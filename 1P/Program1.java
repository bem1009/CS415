/** Ben Miller 1P 
 * Program1.java:
 * Displays a pad for building a Bug.
 *
 * mb 9/15
 * 
 */
import wheelsunh.users.*;
import java.awt.Color;

public class Program1 
{
    
    //---------------- instance variables ------------------------------
    
    private  Rectangle pad;
    public  Ellipse circle;
    public RoundedRectangle rondrect; 
    public Rectangle rect; 
    public Rectangle rect2;
    public Rectangle rect3; 
    public Rectangle rect4; 
    public Rectangle rect5; 
    public Rectangle rect6; 
    public Ellipse circ2;
    public Ellipse circ3;
    public Ellipse circ4;
    public Ellipse circ5;
    public RoundedRectangle rondrect2; 
    public RoundedRectangle rondrect3; 
    public Rectangle mouth;
    public Rectangle mouth2;
    public Rectangle eyebrow;
    public Rectangle eyebrow2;
   
    
    
    // -----------------------------------------------------------------
    /** Constructor 
      */
    public Program1( )
    {
        pad = new wheelsunh.users.Rectangle( 50, 50 );
        pad.setFillColor( java.awt.Color.WHITE );
        pad.setFrameColor( java.awt.Color.BLACK );
        pad.setSize( 600, 350);
        circle = new wheelsunh.users.Ellipse( 300, 100);
        circle.setFillColor( java.awt.Color.YELLOW );
        rondrect = new wheelsunh.users.RoundedRectangle( 305, 150 );
        rondrect.setFillColor( java.awt.Color.BLUE );
        rondrect.setSize( 40, 150); 
        rect = new wheelsunh.users.Rectangle(228, 150);
        rect.setSize( 90,10);
        rect.setRotation( 40);
        rect.setFrameColor( java.awt.Color.BLACK);
        rect2 = new wheelsunh.users.Rectangle(333,150);
        rect2.setSize ( 90,10);
        rect2.setRotation(-40);
        rect2.setFrameColor( java.awt.Color.BLACK);
        rect3 = new wheelsunh.users.Rectangle( 255,210);
        rect3.setSize( 50,10);
        rect3.setFillColor( java.awt.Color.GREEN);
        rect3.setFrameColor( java.awt.Color.BLACK);
        rect4 = new wheelsunh.users.Rectangle( 345,210);
        rect4.setSize( 50,10);
        rect4.setFillColor( java.awt.Color.GREEN);
        rect4.setFrameColor( java.awt.Color.BLACK);
        rect5 = new wheelsunh.users.Rectangle( 253,280);
        rect5.setSize( 60,10);
        rect5.setFillColor( java.awt.Color.CYAN);
        rect5.setFrameColor( java.awt.Color.BLACK);
        rect5.setRotation(-40);
        rect6 = new wheelsunh.users.Rectangle( 337, 280);
        rect6.setSize( 60,10);
        rect6.setFillColor( java.awt.Color.CYAN);
        rect6.setFrameColor( java.awt.Color.BLACK);
        rect6.setRotation(40);
        circ2 = new wheelsunh.users.Ellipse(311,113);
        circ2.setSize( 10,10);
        circ2.setFillColor( java.awt.Color.WHITE);
        circ2.setFrameColor( java.awt.Color.BLACK); 
        circ3 = new wheelsunh.users.Ellipse(331,113);
        circ3.setSize( 10,10);
        circ3.setFillColor( java.awt.Color.WHITE);
        circ3.setFrameColor( java.awt.Color.BLACK);
        circ4 = new wheelsunh.users.Ellipse(333,114);
        circ4.setSize( 3,3);
        circ4.setFillColor( java.awt.Color.BLACK);
        circ5 = new wheelsunh.users.Ellipse(313,119);
        circ5.setSize( 3,3);
        circ5.setFillColor( java.awt.Color.BLACK);
        rondrect2 = new wheelsunh.users.RoundedRectangle(340,80);
        rondrect2.setSize( 4,25);
        rondrect2.setRotation(15); 
        rondrect2.setFillColor( java.awt.Color.ORANGE); 
        rondrect2.setFrameColor( java.awt.Color.BLACK);
        rondrect3 = new wheelsunh.users.RoundedRectangle(310,78);
        rondrect3.setSize( 4,25);
        rondrect3.setRotation(-15); 
        rondrect3.setFillColor( java.awt.Color.ORANGE); 
        rondrect3.setFrameColor( java.awt.Color.BLACK);
        mouth = new wheelsunh.users.Rectangle(318,133);
        mouth.setSize(23,2);
        mouth.setFrameColor( java.awt.Color.BLACK);
        eyebrow = new wheelsunh.users.Rectangle(310,110);
        eyebrow.setSize (8,1);
        eyebrow.setFrameColor( java.awt.Color.BLACK);
        eyebrow.setRotation(-20); 
        eyebrow2 = new wheelsunh.users.Rectangle(331, 110);
        eyebrow2.setSize (8,1);
        eyebrow2.setFrameColor( java.awt.Color.BLACK);
        eyebrow2.setRotation(20); 
        
        
        
   
        
        
        
        
    }
        
        
        
        
     
    
    // -----------------------------------------------------------------
    /** main program just invokes the class constructor.
      */
    public static void main(String[] args)
    {
        new Frame( );
        Program1 app = new Program1();
    }
}//End of Class Program1