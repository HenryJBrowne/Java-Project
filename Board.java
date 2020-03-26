
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

    
    // ==========================================================Level 1==========================================================

    // (board# method creates 25 instances of square(created in square constructor) to create a 5x5 grid in frame/ the game window)
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

        // =CREATE GAME WINDOW=

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(712, 735);
        frame.setResizable(false);
        panel.setLayout(null);

        // Start of program calls levelselection -------------------------------------------+
        //                                                                                  |
        Levels start = new Levels(0,"");// <(creates instance to call non-static method)    |
        start.Levelselection(); // <--------------------------------------------------------+

    }

}