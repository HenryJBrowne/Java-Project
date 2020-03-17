import javax.swing.*;

public class Square 
{

    private int xPosition;
    private int yPosition;
    private static final int Length=140;
    private static final int Width=140;
    private String SquarePeice;
    


    public Square(String image, int Width, int Length, int x, int y)
    {   
        
        xPosition= x;
        yPosition= y;
        SquarePeice =image;
                                                    
                                                    //int xPosition = SQUARE.getLocation().x;
                                                    //int yPosition = SQUARE.getLocation().y;
                                                    //SQUARE.setLocation(x,y);   
    }

    void CreateSquare(JPanel panel){
    
        ImageIcon Image = new ImageIcon(SquarePeice);
        JButton square = new JButton(SquarePeice);
        square.setIcon(Image);
    
        square.setLocation(xPosition,yPosition);
        square.setSize(Width,Length);
        panel.add(square);

    }





    //accessor methods for square position on board 
public int getXPosition()
{
    return xPosition;
}
public int getYPosition()
{
    return yPosition;
}
public String GetSquarePeice()
{
    return SquarePeice;
}




}