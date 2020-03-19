import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;

public class Board implements ActionListener {

    final static JFrame frame = new JFrame("Hoppers Game!");
    static JPanel panel = new JPanel();
    static Square arrayofsqaures[][] = new Square[700][700];
    static String Icon = "Water.png";

    // lvl buttons
    final JFrame Levelselectframe = new JFrame("SELECT A LEVEL");
    JPanel Levelselectpanel = new JPanel();
    static JButton Levelbtn = new JButton();
    static JButton Levelbtn2 = new JButton();
    static JButton Levelbtn3 = new JButton();
    static JButton Levelbtn4 = new JButton();

    public void Levelselction() {
        
        // level selection: /////////////////////////////////////////////////////////////////////////////////////////////////////////////

        Levelselectframe.add(Levelselectpanel);
        Levelselectframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Levelselectframe.setSize(600, 200);
        Levelselectframe.setResizable(false);

        Levelselectpanel.setLayout(null);

        // level 1 button

        Levelbtn.setLocation(100, 40);
        Levelbtn.setSize(80, 80);
        Levelbtn.setText("Level 1");
        Levelselectpanel.add(Levelbtn);

        Levelbtn.addActionListener(this);

        // level 2 button

        Levelbtn2.setLocation(200, 40);
        Levelbtn2.setSize(80, 80);
        Levelbtn2.setText("Level 2");
        Levelselectpanel.add(Levelbtn2);
        Levelbtn2.setBackground(Color.yellow);

        Levelbtn2.addActionListener(this);

        // level 3 button

        Levelbtn3.setLocation(300, 40);
        Levelbtn3.setSize(80, 80);
        Levelbtn3.setText("Level 3");
        Levelselectpanel.add(Levelbtn3);
        Levelbtn3.setBackground(Color.yellow);

        Levelbtn3.addActionListener(this);

        Levelselectframe.setVisible(true);

        // level 4 button

        Levelbtn4.setLocation(400, 40);
        Levelbtn4.setSize(80, 80);
        Levelbtn4.setText("Level 4");
        Levelselectpanel.add(Levelbtn4);
        Levelbtn4.setBackground(Color.yellow);

        Levelbtn4.addActionListener(this);

        Levelselectframe.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Levelselectframe.setVisible(false);

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
    //==========================================================Level 1==========================================================
    public void board() {

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(712, 735);
        frame.setResizable(false);
        panel.setLayout(null);

        for (int xPosition = 560; xPosition >= 0; xPosition = xPosition - 140) {

            for (int yPosition = 0; yPosition < 700; yPosition = yPosition + 140) {

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

                arrayofsqaures[xPosition][yPosition] = new Square(Icon, 0, 0, xPosition, yPosition);
                arrayofsqaures[xPosition][yPosition].CreateSquare(panel);

                Icon = "Water.png";

            }
        }
        frame.setVisible(true);

    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // task 4 levels:
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            
            ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    

    //==========================================================Level 2==========================================================
    public void board2() {

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(712, 735);
        frame.setResizable(false);
        panel.setLayout(null);

        for (int xPosition = 560; xPosition >= 0; xPosition = xPosition - 140) {

            for (int yPosition = 0; yPosition < 700; yPosition = yPosition + 140) {

                if ((xPosition == 0 & yPosition == 0) | (xPosition == 280 & yPosition == 0)
                        | (xPosition == 0 & yPosition == 280) | (xPosition == 560 & yPosition == 280)
                        | (xPosition == 420 & yPosition == 420) | (xPosition == 560 & yPosition == 280)){
                    Icon = "LilyPad.png";
                }

                if ((xPosition == 140 & yPosition == 140) | (xPosition == 0 & yPosition == 560)
                        | (xPosition == 140 & yPosition == 420) | (xPosition == 280 & yPosition == 280)
                        | (xPosition == 420 & yPosition == 140)| (xPosition == 560 & yPosition == 0)) {
                    Icon = "GreenFrog.png";
                }

                if (xPosition == 560 & yPosition == 560) {
                    Icon = "RedFrog.png";
                }

                arrayofsqaures[xPosition][yPosition] = new Square(Icon, 0, 0, xPosition, yPosition);
                arrayofsqaures[xPosition][yPosition].CreateSquare(panel);

                Icon = "Water.png";

            }
        }
        frame.setVisible(true);

    }
    //==========================================================Level 3==========================================================
    public void board3() {

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(712, 735);
        frame.setResizable(false);
        panel.setLayout(null);

        for (int xPosition = 560; xPosition >= 0; xPosition = xPosition - 140) {

            for (int yPosition = 0; yPosition < 700; yPosition = yPosition + 140) {

                if ((xPosition == 0 & yPosition == 0) | (xPosition == 560 & yPosition == 0)
                        | (xPosition == 560 & yPosition == 280) | (xPosition == 420 & yPosition == 420)
                        | (xPosition == 0 & yPosition == 560) | (xPosition == 280 & yPosition == 560)){
                    Icon = "LilyPad.png";
                }

                if ((xPosition == 140 & yPosition == 140) | (xPosition == 0 & yPosition == 280)
                        | (xPosition == 280 & yPosition == 0) | (xPosition == 420 & yPosition == 140)
                        | (xPosition == 280 & yPosition == 280)| (xPosition == 140 & yPosition == 420)) {
                    Icon = "GreenFrog.png";
                }

                if (xPosition == 560 & yPosition == 560) {
                    Icon = "RedFrog.png";
                }

                arrayofsqaures[xPosition][yPosition] = new Square(Icon, 0, 0, xPosition, yPosition);
                arrayofsqaures[xPosition][yPosition].CreateSquare(panel);

                Icon = "Water.png";

            }
        }
        frame.setVisible(true);

    }
        //==========================================================Level 4==========================================================
        public void board4() {

            frame.add(panel);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setSize(712, 735);
            frame.setResizable(false);
            panel.setLayout(null);
    
            for (int xPosition = 560; xPosition >= 0; xPosition = xPosition - 140) {
    
                for (int yPosition = 0; yPosition < 700; yPosition = yPosition + 140) {
    
                    if ((xPosition == 0 & yPosition == 0) | (xPosition == 280 & yPosition == 0)
                            | (xPosition == 560 & yPosition == 0) | (xPosition == 0 & yPosition == 280)
                            | (xPosition == 280 & yPosition == 280) | (xPosition == 420 & yPosition == 420)| (xPosition == 280 & yPosition == 560)){
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
    
                    arrayofsqaures[xPosition][yPosition] = new Square(Icon, 0, 0, xPosition, yPosition);
                    arrayofsqaures[xPosition][yPosition].CreateSquare(panel);
    
                    Icon = "Water.png";
    
                }
            }
            frame.setVisible(true);
    
        }
                ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static void main(final String arg[]) {

        Board start = new Board();
        start.Levelselction();

    }

}