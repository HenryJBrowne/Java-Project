
// =IMPORT ALL BUILT IN PACKAGES USED=
import javax.swing.*;
import java.awt.event.*;

// (Square class that creates clickable moveable squares on the Board GUI)
public class Square implements ActionListener { 

    // =INITILIZING NON-LOCAL VARIABLES/OBJECTS USED IN BOARD CLASS=

    private JButton square = new JButton();
    // (square button: 25 instances of this button created using Board class to create 5x5 grid)

    // variables used to denote a instance of square:
    private int xPosition;
    private int yPosition;
    private String SquareIcon;

    // variables/object used in action performed method:
    private static int clickcount;
    private static String click1peice;
    private static JButton click1square;
    private static int click1xPosition;
    private static int click1yPosition;


    // (Square constuctor method creates a square, and records its location (used board to
    // create 25 square instances))
    public Square(String image, int x, int y, JPanel panel) {

        // =CREATE SQUARE=

        square.setSize(140, 140);
        final ImageIcon Image = new ImageIcon(image);
        square.setIcon(Image);
        square.setLocation(x, y);
        panel.add(square);
        square.addActionListener(this);

        // =SAVE LOCATION AND IMAGE OF A SQUARE=

        xPosition = x;
        yPosition = y;
        SquareIcon = image;
    }

    // (method called when a square button is pressed)
    public void actionPerformed(final ActionEvent event) {

        clickcount++;
        
        // variables used when checking for legal moves:
        int middleX = 0;
        int middleY = 0;

        if (clickcount == 1) {

            // =SAVE SQUARE + LOCATION ON GRID OF USERS FIRST CLICK=
            click1square = square;
            click1xPosition = xPosition;
            click1yPosition = yPosition;
        }

        // (dont count first click (reset clickcount) if first click if a lilypad)
        if (SquareIcon == ("LilyPad.png") & (clickcount == 1)) {
            clickcount = 0;
        }


        // =HIGHLIGHT FROG WHEN FIRST CLICKED AND SAVE WHAT FROG IS CLICKED=

        if (SquareIcon == ("GreenFrog.png") & (clickcount == 1)) {
            
            final ImageIcon Image = new ImageIcon("GreenFrog2.png");
            square.setIcon(Image);
            click1peice = "GreenFrog.png";

        }
        if (SquareIcon == ("RedFrog.png") & (clickcount == 1)) {
            
            final ImageIcon Image = new ImageIcon("RedFrog2.png");
            square.setIcon(Image);
            click1peice = "RedFrog.png";
        }


        // =DESELECT / UNHIGHLIGHT FROG AND RESET CLICKCOUNTER WHEN SECOND CLICK IS WATER, ANOTHER FROG OR AN ILLEGAL MOVE=

        if (((SquareIcon == ("GreenFrog.png")) | (SquareIcon == ("RedFrog.png")) | (SquareIcon == ("Water.png")))
                & ((click1peice == ("GreenFrog.png")) & (clickcount == 2))) {

                    deselectfrog(click1peice);
        }

        if (((SquareIcon == ("RedFrog.png")) | (SquareIcon == ("GreenFrog.png")) | (SquareIcon == ("Water.png")))
                & ((click1peice == ("RedFrog.png")) & (clickcount == 2))) {
            
                    deselectfrog(click1peice);
        }

        if (SquareIcon == ("Water.png")) {
            clickcount = 0;
        }

        
        // =ENSUREING LEGAL MOVES!=
        
        //(first check if first clicked square (click1peice) is a green frog or red frog and second clicked square (SquareIcon) is a lily pad)
        if ((clickcount == 2) & (SquareIcon == ("LilyPad.png"))
                & ((click1peice == ("GreenFrog.png")) | (click1peice == ("RedFrog.png")))) {

            clickcount = 0;

            middleX = ((xPosition + click1xPosition) / 2);
            middleY = ((yPosition + click1yPosition) / 2);

            //(second check their is a square in the middle of frist clicked square and second click clicked square
            if ((middleX % 140 == 0) & (middleY % 140 == 0)){

                //(third check the square in the middle is a frog)
                if ((Board.arrayofsqaures[middleX][middleY].GetSquareIcon() == "GreenFrog.png")
                        | (Board.arrayofsqaures[middleX][middleY].GetSquareIcon() == "RedFrog.png")) {

                    //=LEGAL MOVE=
                    
                    // (remove frog that was jumped over/ set it to a lilypad and call moveTo)
                    Board.arrayofsqaures[middleX][middleY].SquareIcon = "LilyPad.png";
                    final ImageIcon LilyPad = new ImageIcon("LilyPad.png");
                    Board.arrayofsqaures[middleX][middleY].square.setIcon(LilyPad);

                    // (call moveTo to make the legal move)
                    moveTo(click1peice, 0, 0, xPosition, yPosition, Board.panel, square, click1square);

                }
                else {
                    deselectfrog(click1peice);
                }
            } else {
                deselectfrog(click1peice);
            }                 
        //(Dont make players move and call deselectfrog if players move doesnt pass all the checks / is illegal)    
        }

    }

    //(deselectfrog method is called to deselect a frog and reset clickcounter)
    void deselectfrog(String click1peice) {

        clickcount = 0;

        if (click1peice == ("GreenFrog.png")) {
            final ImageIcon Image = new ImageIcon("GreenFrog.png");
            click1square.setIcon(Image);
        }
        if (click1peice == ("RedFrog.png")) {
            final ImageIcon Image = new ImageIcon("RedFrog.png");
            click1square.setIcon(Image);
        }
    }


    // (called on second click if first click if a frog and second click is a lily pad and a legal move)
    void moveTo(String click1peice, final int Width, final int Length, final int xPosition, final int yPosition,
            final JPanel panel, final JButton square, final JButton click1square) {

        // =SET FIRST CLICKED SQUARE (FROG) TO LILYPAD ICON=

        final ImageIcon LilyPad = new ImageIcon("LilyPad.png");
        click1square.setIcon(LilyPad);
        Board.arrayofsqaures[click1xPosition][click1yPosition].SquareIcon = "LilyPad.png";

        // =SET SECOND CLICKED SQUARE (LILYPAD) TO FROG ICON (FIRST CLICKED SQUARE ICON)=

        final ImageIcon Image = new ImageIcon(click1peice);
        square.setIcon(Image);
        SquareIcon = click1peice;


        // =CALL METHOD TO CHECK IF USER HAS WON=
        checkifwon();
    }


    //(checkifwon method to check if the user has won (their a 0 green frogs and 1 red frog))
    void checkifwon() {

        //variables used to count number of frogs on the game window:
        int GreenFrogcount = 0;
        int RedFrogcount = 0;

        // =CHECK ALL SQUARE AND COUNT HOW MANY ARE GREEN FROGS AND RED FROGS=
        for (int x = 560; x >= 0; x = x - 140) {

            for (int y = 0; y < 700; y = y + 140) {

                if (Board.arrayofsqaures[x][y].SquareIcon == "GreenFrog.png") {
                    GreenFrogcount = GreenFrogcount + 1;
                }
                if (Board.arrayofsqaures[x][y].SquareIcon == "RedFrog.png") {
                    RedFrogcount = RedFrogcount + 1;
                }
            }
        }

        // =IF THE USER HAS WON CLOSE GAME WINDOW AND CREATE NEW WINDOW TO DISPLAY THEY HAVE WON=
        if ((GreenFrogcount == 0) & (RedFrogcount == 1)) {

            Board.frame.setVisible(false);

            final JFrame frame2 = new JFrame("WIN");
            JTextField WIN = new JTextField("YOU WIN!");
            WIN.setEditable(false);
            frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame2.setSize(320, 120);
            frame2.add(WIN);
            frame2.setResizable(false);
            frame2.setVisible(true);
        }

    }

    // =ACCESSOR METHODS USED TO GET THE IMAGE AND LOCATION OF A SQUARE=
    public int getXPosition() {
        return xPosition;
    }
    public int getYPosition() {
        return yPosition;
    }
    public String GetSquareIcon() {
        return SquareIcon;
    }
}
