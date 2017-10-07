import java.awt.Color;
import wheelsunh.users.*;
import java.awt.Point;
import java.util.*;

public class Cockroach extends Ellipse
{ 
    private Ellipse coch1; 
    private int height;
    private int x, y;
    
    private Random gen, gen2;
    
    
    
    
    
    
    
    public Cockroach( int x, int y )
    {
        
        height = coch1.getHeight();
       
        
        this.setColor( Color.BLACK );
        this.setSize( 3 * height , 15);
        
        
        
    }
    
    public Cockroach()
    {
        
        
        //height = coch1.getHeight();
       
        
        
        gen = new Random();
        
        int xrandom = gen.nextInt( 699 );
        int yrandom = gen.nextInt( 499 );
        int ranrot = gen.nextInt( 359 );
        int ranheight = gen.nextInt( 99 );
        
        this.setColor( Color.BLACK );
        this.setSize( 3 * ranheight , ranheight);
        this.setLocation( xrandom, yrandom);
        this.setRotation( ranrot );
        
       
    }
    
    public void mousePressed( java.awt.event.MouseEvent e )
    {
        coch1 = new Ellipse();
        gen2 = new Random();
        int xran2 = gen.nextInt( 699 );
        int yran2 = gen.nextInt( 499 );
        int ranheight2 = gen.nextInt( 99 );
        int ranrot2 = gen.nextInt( 359 );
        coch1.setColor(Color.BLACK );
        coch1.setLocation( xran2, yran2 );
        coch1.setSize( 3 * ranheight2, ranheight2);
        coch1.setRotation( ranrot2 );
        
        int xran3 = gen.nextInt( 699 );
        int yran3 = gen.nextInt( 499 );
        this.setLocation( xran3, yran3 );
        
        System.out.println( "The Mouse Event is Located at " + e.getPoint() );
        System.out.println( "The X Location of new Cockroach is " + xran2 );
        System.out.println( "The Y Location of new Cockroach is " + yran2 );
        System.out.println( "The X Size of new Cockroach is " + ranheight2 );
        System.out.println( "The Y Size of new Cockroach is " + ranheight2 * 3 );
        System.out.println( "The X Location of Original Cockroach is " + xran3 );
        System.out.println( "The Y Location of Original Cockroach is " + yran3 );
       
        
        
        
       
       
            
        
    }
    
    
    
    


 public static void main( String[] args )
    {
     new Frame();
     new Cockroach();
 }
 }