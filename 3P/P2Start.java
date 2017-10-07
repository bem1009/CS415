/** 
 * Program3.java:
 * 
 * Benajamin Miller 3P
 * Draw 4 Bugs by making a method.
 *
 * CS415 
 *
 * 
 */

import wheelsunh.users.*;
import java.awt.Color;

public class Program3 extends wheelsunh.users.Frame
{
    //---------------- instance variables ------------------------------
    
    private int x1 = 200, y1 = 200, x2 = 400, y2 = 200;
    private int padX = 130, padY = 110;
    
    // -----------------------------------------------------------------
    /** Constructor for the Program3 class.
     */
    public Program3( )
    {
        
        //--------------------------------------------
        // add your code starting here
        
        private void makeBug (int x , int y )
    { 
       Ellipse head;
       RoundedRectangle body;
       Line antenna1, antenna2;
       Rectangle leg1, leg2, leg3, leg4, leg5, leg6;
       
       
        head = new Ellipse( 40,  10);
        head.setFillColor( Color.RED);
        head.setSize(20, 20);
        
        body = new RoundedRectangle( 45, 30);
        body.setFillColor( Color.BLUE);
        body.setSize( 10, 30);
        
        leg1 = new Rectangle( 37, 23);
        leg1.setSize(4, 15);
        leg1.setFillColor( Color.GREEN);
        leg1.setRotation( -45);
        
        leg2 = new Rectangle( 60,  24);
        leg2.setSize(4, 15);
        leg2.setFillColor( Color.GREEN);
        leg2.setRotation( 45);
        
        leg3 = new Rectangle( 38, 36);
        leg3.setSize(3, 12);
        leg3.setFillColor( Color.GREEN);
        leg3.setRotation( 90); 
        
        leg4 = new Rectangle( 61, 36);
        leg4.setSize(3, 12);
        leg4.setFillColor( Color.GREEN);
        leg4.setRotation( 90); 
        
        leg5 = new Rectangle(  38,  48);
        leg5.setSize(4, 15);
        leg5.setFillColor( Color.GREEN);
        leg5.setRotation( 45);
        
        leg6 = new Rectangle(  60,  48);
        leg6.setSize(4, 15);
        leg6.setFillColor( Color.GREEN);
        leg6.setRotation( -45);
        
        antenna1 = new Line(  40,  3, 45, 10);
        antenna1.setColor( Color.BLACK); 
        
        antenna2 = new Line(  55,  10,  60,  3);
        antenna2.setColor( Color.BLACK);   
        
        
    } 
    
    // -----------------------------------------------------------------
    /** main program just invokes the class constructor.
     */
    public static void main(String[] args)
    {
        Program3 app = new Program3();
    }
}//End of Class Program3