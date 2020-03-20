
// =IMPORT ALL BUILT IN PACKAGES USED=
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;

//(Board class represents/ creates GUI)
public class Board implements ActionListener {  // <(Board class contains MAIN METHOD)

    // =INITILIZIING NON-LOCAL VARIABLES/OBJECTS USED IN BOARD CLASS=

    // variables/objects/ array used to create game window:
    static JFrame frame = new JFrame("Hoppers Game!"); 
    static JPanel panel = new JPanel(); 
    static Square arrayofsqaures[][] = new Square[700][700]; // <(2D array that contains all the coordinates of the squares)
    private static String Icon = "Water.png"; 

    // objects used to create level selection window:}
    private JFrame Levelselectframe = new JFrame("SELECT A LEVEL"); 
    private JPanel Levelselectpanel = new JPanel(); 

    // buttons used in level selection window:
    private JButton Levelbtn = new JButton();
    private JButton Levelbtn2 = new JButton();
    private JButton Levelbtn3 = new JButton();
    private JButton Levelbtn4 = new JButton();

    public void Levelselection() {

        // =CREATE LEVEL SELECTION WINDOW=

        Levelselectframe.add(Levelselectpanel);
        Levelselectframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // <(exits application when window is closed by user)
        Levelselectframe.setSize(600, 200);
        Levelselectframe.setResizable(false);
        Levelselectpanel.setLayout(null);       // <(allowing button positions to be set manually)

        // =ADD LEVEL 1 BUTTON=
        Levelbtn.setLocation(100, 40);
        Levelbtn.setSize(80, 80);
        Levelbtn.setText("Level 1");
        Levelselectpanel.add(Levelbtn);
        Levelbtn.addActionListener(this);

        // =ADD LEVEL 2 BUTTON=
        Levelbtn2.setLocation(200, 40);
        Levelbtn2.setSize(80, 80);
        Levelbtn2.setText("Level 2");
        Levelselectpanel.add(Levelbtn2);
        Levelbtn2.setBackground(Color.yellow);
        Levelbtn2.addActionListener(this);

        // =ADD LEVEL 3 BUTTON=
        Levelbtn3.setLocation(300, 40);
        Levelbtn3.setSize(80, 80);
        Levelbtn3.setText("Level 3");
        Levelselectpanel.add(Levelbtn3);
        Levelbtn3.setBackground(Color.yellow);
        Levelbtn3.addActionListener(this);

        // =ADD LEVEL 4 BUTTON=
        Levelbtn4.setLocation(400, 40);
        Levelbtn4.setSize(80, 80);
        Levelbtn4.setText("Level 4");
        Levelselectpanel.add(Levelbtn4);
        Levelbtn4.setBackground(Color.yellow);
        Levelbtn4.addActionListener(this);

        // =OPEN LEVEL SELECTION WINDOW=
        Levelselectframe.setVisible(true);
    }

    // (method called when a square button is pressed)
    public void actionPerformed(ActionEvent e) {

        // =CLOSE LEVEL SELECTION WINDOW=
        Levelselectframe.setVisible(false);

        // =CREATE GAME WINDOW=

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(712, 735);
        frame.setResizable(false);
        panel.setLayout(null);

        // =CALL METHOD THAT CORRESPONDS TO THE BUTTON THE USER PRESSED=

        if (e.getSource() == Levelbtn) {
            final Board board1 = new Board();
            board1.board();
        }
        if (e.getSource() == Levelbtn2) {
            final Board board2 = new Board();
            board2.board2();
        }
        if (e.getSource() == Levelbtn3) {
            final Board board3 = new Board();
            board3.board3();
        }
        if (e.getSource() == Levelbtn4) {
            final Board board4 = new Board();
            board4.board4();
        }
    }

    // ==========================================================Level 1==========================================================

    // (board constructor creates 25 instances of square(created in square constructor) to create a 5x5 grid in frame/ the game window)
    public void board() {

        // =CREATE 5X5 GRID CONSISTING OF 25 INSTANCES OF SQUARE (CREATED IN SQUARE CONSTRUCTOR)=

        for (int xPosition = 560; xPosition >= 0; xPosition = xPosition - 140) {

            for (int yPosition = 0; yPosition < 700; yPosition = yPosition + 140) {

                // =SET THE POSITIONS OF LILYPADS, GREENS FROGS AND RED FROG=
                if ((xPosition == 0 & yPosition == 0) | (xPosition == 280 & yPosition == 0)
                        | (xPosition == 560 & yPosition == 0) | (xPosition == 0 & yPosition == 280)
                        | (xPosition == 560 & yPosition == 280) | (xPosition == 140 & yPosition == 420)
                        | (xPosition == 420 & yPosition == 420)) {
                    Icon = "LilyPad.png";
                }

                if ((xPosition == 140 & yPosition == 140) | (xPosition == 420 & yPosition == 140)
                        | (xPosition == 280 & yPosition == 280) | (xPosition == 0 & yPosition == 560)
                        | (xPosition == 560 & yPosition == 560)) {
                    Icon = "GreenFrog.png";
                }

                if (xPosition == 280 & yPosition == 560) {
                    Icon = "RedFrog.png";
                }

                // =CREATE SQUARE INSTANCE AND STORE LOCATION IN 2D ARRAY=
                arrayofsqaures[xPosition][yPosition] = new Square(Icon, xPosition, yPosition, panel);

                // =SET THE POSITIONS THAT ARE NOT LILYPADS, GREENS FROGS AND RED FROG TO WATER=
                Icon = "Water.png";

            }
        }
        // =OPEN LEVEL WINDOW=
        frame.setVisible(true);
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // additional levels:
            ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

                ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // ==========================================================Level 2==========================================================
    
    // (board# method creates 25 instances of square(created in square constructor) to create a 5x5 grid in frame/ the game window)
    public void board2() {

        // =CREATE 5X5 GRID CONSISTING OF 25 INSTANCES OF SQAURE (CREATED IN SQUARE CONSTRUCTOR)=

        for (int xPosition = 560; xPosition >= 0; xPosition = xPosition - 140) {

            for (int yPosition = 0; yPosition < 700; yPosition = yPosition + 140) {

                // =SET THE POSITIONS OF LILYPADS, GREENS FROGS AND RED FROG=
                if ((xPosition == 0 & yPosition == 0) | (xPosition == 280 & yPosition == 0)
                        | (xPosition == 0 & yPosition == 280) | (xPosition == 560 & yPosition == 280)
                        | (xPosition == 420 & yPosition == 420) | (xPosition == 560 & yPosition == 280)) {
                    Icon = "LilyPad.png";
                }

                if ((xPosition == 140 & yPosition == 140) | (xPosition == 0 & yPosition == 560)
                        | (xPosition == 140 & yPosition == 420) | (xPosition == 280 & yPosition == 280)
                        | (xPosition == 420 & yPosition == 140) | (xPosition == 560 & yPosition == 0)) {
                    Icon = "GreenFrog.png";
                }

                if (xPosition == 560 & yPosition == 560) {
                    Icon = "RedFrog.png";
                }
                
                // =CREATE SQUARE INSTANCE AND STORE LOCATION IN 2D ARRAY=
                arrayofsqaures[xPosition][yPosition] = new Square(Icon, xPosition, yPosition, panel);

                // =SET THE POSITIONS THAT ARE NOT LILYPADS, GREENS FROGS AND RED FROG TO WATER=
                Icon = "Water.png";

            }
        }
        // =OPEN LEVEL WINDOW=
        frame.setVisible(true);
    }

    // ==========================================================Level 3==========================================================
    
    // (board# method creates 25 instances of square(created in square constructor) to create a 5x5 grid in frame/ the game window)
    public void board3() {

        // =CREATE 5X5 GRID CONSISTING OF 25 INSTANCES OF SQAURE (CREATED IN SQUARE CONSTRUCTOR)=

        for (int xPosition = 560; xPosition >= 0; xPosition = xPosition - 140) {

            for (int yPosition = 0; yPosition < 700; yPosition = yPosition + 140) {

                // =SET THE POSITIONS OF LILYPADS, GREENS FROGS AND RED FROG=
                if ((xPosition == 0 & yPosition == 0) | (xPosition == 560 & yPosition == 0)
                        | (xPosition == 560 & yPosition == 280) | (xPosition == 420 & yPosition == 420)
                        | (xPosition == 0 & yPosition == 560) | (xPosition == 280 & yPosition == 560)) {
                    Icon = "LilyPad.png";
                }

                if ((xPosition == 140 & yPosition == 140) | (xPosition == 0 & yPosition == 280)
                        | (xPosition == 280 & yPosition == 0) | (xPosition == 420 & yPosition == 140)
                        | (xPosition == 280 & yPosition == 280) | (xPosition == 140 & yPosition == 420)) {
                    Icon = "GreenFrog.png";
                }

                if (xPosition == 560 & yPosition == 560) {
                    Icon = "RedFrog.png";
                }

                // =CREATE SQUARE INSTANCE AND STORE LOCATION IN 2D ARRAY=
                arrayofsqaures[xPosition][yPosition] = new Square(Icon, xPosition, yPosition, panel);

                // =SET THE POSITIONS THAT ARE NOT LILYPADS, GREENS FROGS AND RED FROG TO WATER=
                Icon = "Water.png";

            }
        }
        // =OPEN LEVEL WINDOW=
        frame.setVisible(true);
    }

    // ==========================================================Level 4==========================================================
    
    // (board# method creates 25 instances of square(created in square constructor) to create a 5x5 grid in frame/ the game window)
    public void board4() {

        // =CREATE 5X5 GRID CONSISTING OF 25 INSTANCES OF SQAURE (CREATED IN SQUARE CONSTRUCTOR)=

        for (int xPosition = 560; xPosition >= 0; xPosition = xPosition - 140) {

            for (int yPosition = 0; yPosition < 700; yPosition = yPosition + 140) {

                // =SET THE POSITIONS OF LILYPADS, GREENS FROGS AND RED FROG=
                if ((xPosition == 0 & yPosition == 0) | (xPosition == 280 & yPosition == 0)
                        | (xPosition == 560 & yPosition == 0) | (xPosition == 0 & yPosition == 280)
                        | (xPosition == 280 & yPosition == 280) | (xPosition == 420 & yPosition == 420)
                        | (xPosition == 280 & yPosition == 560)) {
                    Icon = "LilyPad.png";
                }

                if ((xPosition == 140 & yPosition == 140) | (xPosition == 420 & yPosition == 140)
                        | (xPosition == 560 & yPosition == 280) | (xPosition == 140 & yPosition == 420)
                        | (xPosition == 0 & yPosition == 560)) {
                    Icon = "GreenFrog.png";
                }

                if (xPosition == 560 & yPosition == 560) {
                    Icon = "RedFrog.png";
                }

                // =CREATE SQUARE INSTANCE AND STORE LOCATION IN 2D ARRAY=
                arrayofsqaures[xPosition][yPosition] = new Square(Icon, xPosition, yPosition, panel);

                // =SET THE POSITIONS THAT ARE NOT LILYPADS, GREENS FROGS AND RED FROG TO WATER=
                Icon = "Water.png";

            }
        }
        // =OPEN LEVEL WINDOW=
        frame.setVisible(true);
    }
                    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

            ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static void main(final String arg[]) { // (main method / start of program!)

        // start of program calls levelselection ---------------------------------------+
        //                                                                              |
        Board start = new Board();// (creates instance to call non-static method)       |
        start.Levelselection(); // <----------------------------------------------------+

    }

}