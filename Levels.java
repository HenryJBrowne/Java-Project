
// =IMPORT ALL BUILT IN PACKAGES USED=
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;

public class Levels implements ActionListener {

    // =INITILIZING NON-LOCAL VARIABLES/OBJECTS USED IN LEVEL CLASS=

    // objects used to create level selection window:
    private static JFrame Levelselectframe = new JFrame("SELECT A LEVEL");
    private static JPanel Levelselectpanel = new JPanel();

    private JButton Levelbtn = new JButton();
    // (Level button: instances of this button created to make up level selection
    // window)

    // variable/ array used to store x location of level buttons; all level buttons
    // stored in array:
    
    private int btnXposition=0; 
    private Levels lvlbtns[] = new Levels[4];

    // (Level selection method creates level selection window with buttons for user
    // to select a level)
    public void Levelselection() {

        // =CREATE LEVEL SELECTION WINDOW=

        Levelselectframe.add(Levelselectpanel);
        Levelselectframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // <(exits application when window is closed by user)
        Levelselectframe.setSize(600, 200);
        Levelselectframe.setResizable(false);
        Levelselectpanel.setLayout(null); // <(allowing button positions to be set manually)


        // =CREATE LEVEL BUTTON INSTANCES TO MAKE UP LEVEL SELCTION WINDOW AND STORE INSTANCES IN ARRAY=

        for (int x = 0; x <= 3; x++) {
            btnXposition = btnXposition + 100;
            lvlbtns[x] = new Levels(btnXposition, "Level"+(x+1));
        }
        
        // =OPEN LEVEL SELECTION WINDOW=

        Levelselectframe.setVisible(true);
    }

// (method called when a square button is pressed)
public void actionPerformed(ActionEvent e) {

    // =CALL METHOD THAT CORRESPONDS TO THE BUTTON THE USER PRESSED BY CHECKING THE X POSITION OF THAT BUTTON=

    if (btnXposition == 100) {
        final Board board1 = new Board();
        board1.board();
    }
    if (btnXposition == 200) {
        final Board board2 = new Board();
        board2.board2();
    }
    if (btnXposition == 300) {
        final Board board3 = new Board();
        board3.board3();
    }
    if (btnXposition == 400) {
        final Board board4 = new Board();
        board4.board4();
    }

    // =CLOSE LEVEL SELECTION WINDOW=
    Levelselectframe.setVisible(false);
}

// (levels constuctor method creates a level button, and records its x location)
public Levels(int btnX, String btnTEXT) {

    if (btnX>0){
        Levelbtn.setSize(80, 80);
        Levelbtn.setLocation(btnX,40);
        Levelbtn.setText(btnTEXT);
        if (btnX>100){      //<(if the button isnt the level 1 button)
            Levelbtn.setBackground(Color.yellow);
        }
        Levelselectpanel.add(Levelbtn);
        Levelbtn.addActionListener(this);

        btnXposition=btnX;
    }
}

    // =ACCESSOR METHOD TO GET THE X POSITION OF THE LEVEL BUTTON
    
    public int btnXPosition() {
        return btnXposition;
    }
}