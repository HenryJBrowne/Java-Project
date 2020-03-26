
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

    // variables/ array used to store x and y location of level buttons; all level buttons
    // stored in array:
    
    private int btnXposition=0; 
    private int btnYposition=40;
    private Levels lvlbtns[] = new Levels[40];

    // (Level selection method creates level selection window with buttons for user
    // to select a level)
    public void Levelselection() {

        // =CREATE LEVEL SELECTION WINDOW=

        Levelselectframe.add(Levelselectpanel);
        Levelselectframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // <(exits application when window is closed by user)
        Levelselectframe.setSize(1200, 500);
        Levelselectframe.setResizable(false);
        Levelselectpanel.setLayout(null); // <(allowing button positions to be set manually)


        // =CREATE LEVEL BUTTON INSTANCES TO MAKE UP LEVEL SELCTION WINDOW AND STORE INSTANCES IN ARRAY=

        for (int x = 0; x <= 39; x++) {
            btnXposition = btnXposition + 100;

            if (btnXposition==1100){
                btnYposition=btnYposition+100;
                btnXposition=100;
            }

            lvlbtns[x] = new Levels(btnXposition, btnYposition,"Level"+(x+1));
        }
        
        // =OPEN LEVEL SELECTION WINDOW=

        Levelselectframe.setVisible(true);
    }

// (method called when a square button is pressed)
public void actionPerformed(ActionEvent e) {

    Board board[] = new Board[41];
    
    // =CREATE BOARD INSTANCE / LEVEL THAT CORRESPONDS TO THE BUTTON THE USER PRESSED BY CHECKING THE X AND Y POSITION OF THAT BUTTON=

    // (first row of levels)
    if (btnXposition == 100 & btnYposition==40) {

        int[][] Frogs={{140,140}};
        int[][] Redfrogs= {{0,0}};
        int[][] Lilypads= {{280,0},{560,0},{420,140},{0,280},{280,280},{560,280},{140,420},{420,420},{0,560},{280,560},{560,560}};
    
        board[1] = new Board(Frogs, Lilypads, Redfrogs);
    }

    if (btnXposition == 200 & btnYposition==40) {

        int[][] Frogs={{560,280}};
        int[][] Redfrogs= {{560,0}};
        int[][] Lilypads= {{0,0},{280,0},{140,140},{420,140},{0,280},{280,280},{140,420},{420,420},{280,560},{0,560},{560,560}};
    
        board[2] = new Board(Frogs, Lilypads, Redfrogs);
    }

    if (btnXposition == 300 & btnYposition==40) {

        int[][] Frogs={{420,140}};
        int[][] Redfrogs= {{280,280}};
        int[][] Lilypads= {{0,0},{280,0},{140,140},{560,280},{0,280},{560,0},{140,420},{420,420},{280,560},{0,560},{560,560}};
    
        board[3] = new Board(Frogs, Lilypads, Redfrogs);
    }

    if (btnXposition == 400 & btnYposition==40) {

        int[][] Frogs={{140,140},{420,420}};
        int[][] Redfrogs= {{0,0}};
        int[][] Lilypads= {{280,0},{560,0},{420,140},{0,280},{280,280},{560,280},{140,420},{0,560},{280,560},{560,560}};
    
        board[4] = new Board(Frogs, Lilypads, Redfrogs);
    }

    if (btnXposition == 500 & btnYposition==40) {

        int[][] Frogs={{0,280},{280,0}};
        int[][] Redfrogs= {{0,560}};
        int[][] Lilypads= {{0,0},{140,140},{560,0},{420,140},{280,280},{560,280},{140,420},{420,420},{280,560},{560,560}};
    
        board[5] = new Board(Frogs, Lilypads, Redfrogs);
    }

    if (btnXposition == 600 & btnYposition==40) {

        int[][] Frogs={{280,280},{140,420},{420,420}};
        int[][] Redfrogs= {{560,280}};
        int[][] Lilypads= {{0,0},{280,0},{560,0},{140,140},{420,140},{0,280},{0,560},{280,560},{560,560}};
    
        board[6] = new Board(Frogs, Lilypads, Redfrogs);
    }

    if (btnXposition == 700 & btnYposition==40) {

        int[][] Frogs={{280,0},{0,280},{560,280},{280,560}};
        int[][] Redfrogs= {{560,0}};
        int[][] Lilypads= {{0,0},{140,140},{420,140},{280,280},{140,420},{420,420},{0,560},{560,560}};
    
        board[7] = new Board(Frogs, Lilypads, Redfrogs);
    }

    if (btnXposition == 800 & btnYposition==40) {

        int[][] Frogs={{140,140},{420,140},{140,420},{420,420}};
        int[][] Redfrogs= {{280,0}};
        int[][] Lilypads= {{0,0},{560,0},{0,280},{280,280},{560,280},{0,560},{280,560},{560,560}};
    
        board[8] = new Board(Frogs, Lilypads, Redfrogs);
    }

    if (btnXposition == 900 & btnYposition==40) {

        int[][] Frogs={{280,0},{140,140},{420,140},{560,280},{420,420}};
        int[][] Redfrogs= {{280,280}};
        int[][] Lilypads= {{0,0},{560,0},{0,280},{140,420},{0,560},{280,560},{560,560}};
    
        board[9] = new Board(Frogs, Lilypads, Redfrogs);
    }

    if (btnXposition == 1000 & btnYposition==40) {

        int[][] Frogs={{280,0},{420,140},{0,280},{140,420},{420,420}};
        int[][] Redfrogs= {{560,560}};
        int[][] Lilypads= {{0,0},{560,0},{140,140},{280,280},{560,280},{0,560},{280,560}};
    
        board[10] = new Board(Frogs, Lilypads, Redfrogs);
    }
    // (second row of levels)
    if (btnXposition == 100 & btnYposition==140) {

        int[][] Frogs={{280,280},{420,420}};
        int[][] Redfrogs= {{0,0}};
        int[][] Lilypads= {{280,0},{560,0},{140,140},{420,140},{0,280},{560,280},{140,420},{0,560},{280,560},{560,560}};
    
        board[11] = new Board(Frogs, Lilypads, Redfrogs);
    }

    if (btnXposition == 200 & btnYposition==140) {

        int[][] Frogs={{280,280},{560,280}};
        int[][] Redfrogs= {{0,560}};
        int[][] Lilypads= {{0,0},{280,0},{560,0},{140,140},{420,140},{0,280},{140,420},{420,420},{280,560},{560,560}};
    
        board[12] = new Board(Frogs, Lilypads, Redfrogs);
    }

    if (btnXposition == 300 & btnYposition==140) {

        int[][] Frogs={{140,140},{140,420},{280,560}};
        int[][] Redfrogs= {{560,0}};
        int[][] Lilypads= {{0,0},{280,0},{420,140},{0,280},{280,280},{560,280},{420,420},{0,560},{560,560}};
    
        board[13] = new Board(Frogs, Lilypads, Redfrogs);
    }

    if (btnXposition == 400 & btnYposition==140) {

        int[][] Frogs={{280,0},{0,280},{560,280},{140,420},{560,560}};
        int[][] Redfrogs= {{280,560}};
        int[][] Lilypads= {{0,0},{560,0},{140,140},{420,140},{280,280},{420,420},{0,560}};
    
        board[14] = new Board(Frogs, Lilypads, Redfrogs);
    }

    if (btnXposition == 500 & btnYposition==140) {

        int[][] Frogs={{0,0},{280,0},{560,280},{420,420}};
        int[][] Redfrogs= {{140,420}};
        int[][] Lilypads= {{560,0},{140,140},{420,140},{0,280},{280,280},{0,560},{280,560},{560,560}};
    
        board[15] = new Board(Frogs, Lilypads, Redfrogs);
    }

    if (btnXposition == 600 & btnYposition==140) {

        int[][] Frogs={{420,140},{560,280}};
        int[][] Redfrogs= {{560,0}};
        int[][] Lilypads= {{0,0},{280,0},{140,140},{0,280},{280,280},{140,420},{420,420},{0,560},{280,560},{560,560}};
    
        board[16] = new Board(Frogs, Lilypads, Redfrogs);
    }

    if (btnXposition == 700 & btnYposition==140) {

        int[][] Frogs={{280,280},{140,420},{420,420},{280,560}};
        int[][] Redfrogs= {{280,0}};
        int[][] Lilypads= {{0,0},{560,0},{140,140},{420,140},{0,280},{560,280},{0,560},{560,560}};
    
        board[17] = new Board(Frogs, Lilypads, Redfrogs);
    }

    if (btnXposition == 800 & btnYposition==140) {

        int[][] Frogs={{280,0},{0,280},{280,280},{560,280},{140,420},{420,420}};
        int[][] Redfrogs= {{280,560}};
        int[][] Lilypads= {{0,0},{560,0},{140,140},{420,140},{0,560},{560,560}};
    
        board[18] = new Board(Frogs, Lilypads, Redfrogs);
    }

    if (btnXposition == 900 & btnYposition==140) {

        int[][] Frogs={{0,0},{280,0},{420,140},{140,420},{420,420},{280,560}};
        int[][] Redfrogs= {{0,280}};
        int[][] Lilypads= {{560,0},{140,140},{280,280},{560,280},{0,560},{560,560}};
    
        board[19] = new Board(Frogs, Lilypads, Redfrogs);
    }

    if (btnXposition == 1000 & btnYposition==140) {

        int[][] Frogs={{280,0},{560,0},{140,140},{420,140},{560,280},{420,420}};
        int[][] Redfrogs= {{140,420}};
        int[][] Lilypads= {{0,0},{0,280},{280,280},{0,560},{280,560},{560,560}};
    
        board[20] = new Board(Frogs, Lilypads, Redfrogs);
    }

    // (third row of levels)
    if (btnXposition == 100 & btnYposition==240) {

        int[][] Frogs={{0,0},{140,140},{280,280},{420,420},{560,560}};
        int[][] Redfrogs= {{420,140}};
        int[][] Lilypads= {{280,0},{560,0},{0,280},{560,280},{140,420},{0,560},{280,560}};
        
        board[21] = new Board(Frogs, Lilypads, Redfrogs);
    }

    if (btnXposition == 200 & btnYposition==240) {

        int[][] Frogs={{140,140},{420,140},{280,280},{0,560},{560,560}};
        int[][] Redfrogs= {{280,560}};
        int[][] Lilypads= {{0,0},{280,0},{560,0},{0,280},{560,280},{140,420},{420,420}};
        
        board[22] = new Board(Frogs, Lilypads, Redfrogs);
    }

    if (btnXposition == 300 & btnYposition==240) {

        int[][] Frogs={{560,0},{140,140},{420,140},{280,280},{140,420},{0,560}};
        int[][] Redfrogs= {{560,560}};
        int[][] Lilypads= {{0,0},{280,0},{0,280},{560,280},{420,420},{280,560}};
        
        board[23] = new Board(Frogs, Lilypads, Redfrogs);
    }

    if (btnXposition == 400 & btnYposition==240) {

        int[][] Frogs={{280,0},{140,140},{420,140},{0,280},{280,280},{140,420}};
        int[][] Redfrogs= {{560,560}};
        int[][] Lilypads= {{0,0},{560,0},{560,280},{420,420},{0,560},{280,560}};
        
        board[24] = new Board(Frogs, Lilypads, Redfrogs);
    }

    if (btnXposition == 500 & btnYposition==240) {

        int[][] Frogs={{140,140},{420,140},{560,280},{140,420},{0,560}};
        int[][] Redfrogs= {{560,560}};
        int[][] Lilypads= {{0,0},{280,0},{560,0},{0,280},{280,280},{420,420},{280,560}};
        
        board[25] = new Board(Frogs, Lilypads, Redfrogs);
    }

    if (btnXposition == 600 & btnYposition==240) {

        int[][] Frogs={{280,0},{140,140},{0,280},{280,280},{420,420}};
        int[][] Redfrogs= {{0,0}};
        int[][] Lilypads= {{560,0},{420,140},{560,280},{140,420},{0,560},{280,560},{560,560}};
        
        board[26] = new Board(Frogs, Lilypads, Redfrogs);
    }

    if (btnXposition == 700 & btnYposition==240) {

        int[][] Frogs={{0,280},{140,420},{0,560},{280,560}};
        int[][] Redfrogs= {{560,0}};
        int[][] Lilypads= {{0,0},{280,0},{140,140},{420,140},{280,280},{560,280},{420,420},{560,560}};
        
        board[27] = new Board(Frogs, Lilypads, Redfrogs);
    }

    if (btnXposition == 800 & btnYposition==240) {

        int[][] Frogs={{140,140},{420,140},{560,280},{0,280},{0,560},{560,560}};
        int[][] Redfrogs= {{280,0}};
        int[][] Lilypads= {{0,0},{560,0},{280,280},{140,420},{420,420},{280,560}};
        
        board[28] = new Board(Frogs, Lilypads, Redfrogs);
    }

    if (btnXposition == 900 & btnYposition==240) {

        int[][] Frogs={{280,280},{140,420},{420,420},{0,560},{560,560}};
        int[][] Redfrogs= {{280,0}};
        int[][] Lilypads= {{0,0},{560,0},{140,140},{420,140},{0,280},{560,280},{280,560}};
        
        board[29] = new Board(Frogs, Lilypads, Redfrogs);
    }

    if (btnXposition == 1000 & btnYposition==240) {

        int[][] Frogs={{0,0},{280,0},{140,140},{420,140},{0,280},{140,420}};
        int[][] Redfrogs= {{560,560}};
        int[][] Lilypads= {{560,0},{280,280},{560,280},{420,420},{0,560},{280,560}};
        
        board[30] = new Board(Frogs, Lilypads, Redfrogs);
    }

    // (fourth row of levels)
    if (btnXposition == 100 & btnYposition==340) {

        int[][] Frogs={{280,0},{140,140},{280,280},{420,420}};
        int[][] Redfrogs= {{560,0}};
        int[][] Lilypads= {{0,0},{420,140},{0,280},{560,280},{140,420},{0,560},{280,560},{560,560}};
        
        board[31] = new Board(Frogs, Lilypads, Redfrogs);
    }

    if (btnXposition == 200 & btnYposition==340) {

        int[][] Frogs={{140,140},{0,280},{280,280},{140,420},{420,420},{280,560}};
        int[][] Redfrogs= {{0,560}};
        int[][] Lilypads= {{0,0},{280,0},{560,0},{420,140},{560,280},{560,560}};
        
        board[32] = new Board(Frogs, Lilypads, Redfrogs);
    }

    if (btnXposition == 300 & btnYposition==340) {
        int[][] Frogs={{0,280},{560,280},{140,420},{420,420},{280,560}};
        int[][] Redfrogs= {{280,280}};
        int[][] Lilypads= {{0,0},{280,0},{560,0},{140,140},{420,140},{0,560},{560,560}};
        
        board[33] = new Board(Frogs, Lilypads, Redfrogs);
    }

    if (btnXposition == 400 & btnYposition==340) {

        int[][] Frogs={{280,0},{140,420},{420,420},{0,560},{280,560}};
        int[][] Redfrogs= {{560,560}};
        int[][] Lilypads= {{0,0},{560,0},{140,140},{420,140},{0,280},{280,280},{560,280}};
        
        
        board[34] = new Board(Frogs, Lilypads, Redfrogs);
    }

    if (btnXposition == 500 & btnYposition==340) {

        int[][] Frogs={{0,0},{560,0},{140,140},{420,140},{140,420},{420,420}};
        int[][] Redfrogs= {{560,560}};
        int[][] Lilypads= {{280,0},{0,280},{280,280},{560,280},{0,560},{280,560}};
        
        board[35] = new Board(Frogs, Lilypads, Redfrogs);
    }

    if (btnXposition == 600 & btnYposition==340) {

        int[][] Frogs={{280,0},{140,140},{420,140},{140,420},{420,420},{0,560}};
        int[][] Redfrogs= {{560,560}};
        int[][] Lilypads= {{0,0},{560,0},{0,280},{280,280},{560,280},{280,560}};

        board[36] = new Board(Frogs, Lilypads, Redfrogs);
    }

    if (btnXposition == 700 & btnYposition==340) {

        int[][] Frogs={{140,140},{0,280},{280,280},{420,420},{280,560}};
        int[][] Redfrogs= {{0,560}};
        int[][] Lilypads= {{0,0},{280,0},{560,0},{420,140},{560,280},{140,420},{560,560}};
        
        board[37] = new Board(Frogs, Lilypads, Redfrogs);
    }

    if (btnXposition == 800 & btnYposition==340) {

        int[][] Frogs={{0,0},{280,0},{420,140},{140,420},{280,560}};
        int[][] Redfrogs= {{560,560}};
        int[][] Lilypads= {{560,0},{140,140},{0,280},{280,280},{560,280},{420,420},{0,560}};
        
        board[38] = new Board(Frogs, Lilypads, Redfrogs);
    }

    if (btnXposition == 900 & btnYposition==340) {

        int[][] Frogs={{560,0},{420,140},{0,280},{280,280},{140,420},{280,560}};
        int[][] Redfrogs= {{0,0}};
        int[][] Lilypads= {{280,0},{140,140},{560,280},{420,420},{0,560},{560,560}};
        
        board[39] = new Board(Frogs, Lilypads, Redfrogs);
    }

    if (btnXposition == 1000 & btnYposition==340) {

        int[][] Frogs={{560,0},{140,140},{0,280},{280,280},{420,420},{280,560}};
        int[][] Redfrogs= {{0,560}};
        int[][] Lilypads= {{0,0},{280,0},{420,140},{560,280},{140,420},{560,560}};
        
        board[40] = new Board(Frogs, Lilypads, Redfrogs);
    }
    
    // =CLOSE LEVEL SELECTION WINDOW (ONCE GAME WINDOW IS OPENED)=
    Levelselectframe.setVisible(false); 
}

// (levels constuctor method creates a level button, and records its x location)
public Levels(int btnX, int btnY, String btnTEXT) {

    if (btnX>0){
        Levelbtn.setSize(80, 80);
        Levelbtn.setLocation(btnX,btnY);
        Levelbtn.setText(btnTEXT);
        Levelbtn.setBackground(Color.white);
        Levelselectpanel.add(Levelbtn);
        Levelbtn.addActionListener(this);

        btnXposition=btnX;
        btnYposition=btnY;
    }
}

    // =ACCESSOR METHODS TO GET THE X POSITION AND Y POSITION OF THE LEVEL BUTTON
    
    public int btnXPosition() {
        return btnXposition;
    }

    public int btnYPosition() {
        return btnYposition;
    }

}