
// =IMPORT ALL BUILT IN PACKAGES USED=
import javax.swing.*;

//(Board class represents/ creates GUI)
public class Board{     // <(Board class contains MAIN METHOD)

    // =INITILIZIING NON-LOCAL VARIABLES/OBJECTS USED IN BOARD CLASS=

    // variables/objects/ array used to create game window:
    static JFrame frame = new JFrame("Hoppers Game!"); 
    static JPanel panel = new JPanel(); 
    static Square arrayofsqaures[][] = new Square[700][700]; // <(2D array that contains all the coordinates of the squares)
    private static String Icon = "Water.png"; 


    // (Board constructor creates 25 instances of square(created in square constructor) to create a 5x5 grid in frame/ the game window)
    public Board(int[][] frogs , int[][] lilypads, int[][] redfrogs) {

        // =CREATE 5X5 GRID CONSISTING OF 25 INSTANCES OF SQUARE (CREATED IN SQUARE CONSTRUCTOR)=
        
        for (int xPosition = 560; xPosition >= 0; xPosition = xPosition - 140) {

            for (int yPosition = 0; yPosition < 700; yPosition = yPosition + 140) {
                
                // variables used to make sure arrays indexs outside the length of the array are not checked:
                int frogarraylength= frogs.length;
                int Lilypadarraylength= lilypads.length;
                int redfrogsarraylength= redfrogs.length;

                // =SET THE POSITIONS OF LILYPADS, GREENS FROGS AND RED FROG DEPENDING ON PARAMETERS GIVEN=

                for (int x = 0; x < frogarraylength; x ++)
                
                    if ((frogs[x][0]== xPosition) & (frogs[x][1]== yPosition)) {
                        
                        Icon = "GreenFrog.png";
                }

                for (int x = 0; x < Lilypadarraylength; x++)
                
                    if ((lilypads[x][0]== xPosition) & (lilypads[x][1]== yPosition)) {
                    
                        Icon = "LilyPad.png";
                }

                for (int x = 0; x < redfrogsarraylength; x++)
                
                    if ((redfrogs[x][0]== xPosition) & (redfrogs[x][1]== yPosition)) {
                    
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

    public static void main(final String arg[]) { // (main method / start of program!)

        // =CREATE GAME WINDOW=

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(712, 735);
        frame.setResizable(false);
        panel.setLayout(null);

        // Start of program calls levelselection -------------------------------------------+
        //                                                                                  |
        Levels start = new Levels(0,0,"");// <(creates instance to call non-static method)  |
        start.Levelselection(); // <--------------------------------------------------------+
    }

}