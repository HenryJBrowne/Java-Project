import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Board {
    
public static void main(String arg[]){

    //window

    JFrame frame = new JFrame("FROG");
    JPanel panel = new JPanel();
    frame.add(panel);
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
    panel.setLayout(null); 

    //row 1
    Square square1= new Square("LilyPad.png",0,0,0,0);
    square1.CreateSquare(panel);

    Square square2= new Square("Water.png",0,0,140,0);
    square2.CreateSquare(panel);

    Square square3= new Square("LilyPad.png",0,0,280,0);
    square3.CreateSquare(panel);

    Square square4= new Square("Water.png",0,0,420,0);
    square4.CreateSquare(panel);

    Square square5= new Square("LilyPad.png",0,0,560,0);
    square5.CreateSquare(panel);

    //row 2

    Square square6= new Square("Water.png",0,0,0,140);
    square6.CreateSquare(panel);

    Square square7= new Square("GreenFrog.png",0,0,140,140);
    square7.CreateSquare(panel);

    Square square8= new Square("Water.png",0,0,280,140);
    square8.CreateSquare(panel);

    Square square9= new Square("GreenFrog.png",0,0,420,140);
    square9.CreateSquare(panel);

    Square square10= new Square("Water.png",0,0,560,140);
    square10.CreateSquare(panel);

    //row 3

    Square square11= new Square("LilyPad.png",0,0,0,280);
    square11.CreateSquare(panel);

    Square square12= new Square("Water.png",0,0,140,280);
    square12.CreateSquare(panel);

    Square square13= new Square("GreenFrog.png",0,0,280,280);
    square13.CreateSquare(panel);

    Square square14= new Square("Water.png",0,0,420,280);
    square14.CreateSquare(panel);

    Square square15= new Square("LilyPad.png",0,0,560,280);
    square15.CreateSquare(panel);

    //row 4
    
    Square square16= new Square("Water.png",0,0,0,420);
    square16.CreateSquare(panel);

    Square square17= new Square("LilyPad.png",0,0,140,420);
    square17.CreateSquare(panel);

    Square square18= new Square("Water.png",0,0,280,420);
    square18.CreateSquare(panel);

    Square square19= new Square("LilyPad.png",0,0,420,420);
    square19.CreateSquare(panel);

    Square square20= new Square("Water.png",0,0,560,420);
    square20.CreateSquare(panel);
    
    //row 5
    
    Square square21= new Square("GreenFrog.png",0,0,0,560);
    square21.CreateSquare(panel);
    
    Square square22= new Square("Water.png",0,0,140,560);
    square22.CreateSquare(panel);
    
    Square square23= new Square("RedFrog.png",0,0,280,560);
    square23.CreateSquare(panel);
    
    Square square24= new Square("Water.png",0,0,420,560);
    square24.CreateSquare(panel);
    
    Square square25= new Square("GreenFrog.png",0,0,560,560);
    square25.CreateSquare(panel);

    }
} 