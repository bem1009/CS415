/**
 * VectorSort - Given Vector<Rectangle> create another vector sorted by height
 *              
 *               
 * 
 */

import wheelsunh.users.*;
import java.util.*;
import javax.swing.JOptionPane;

public class VectorSort
{
    public static Vector<Rectangle> sort( Vector<Rectangle> unsorted )
    {
        Vector<Rectangle> sorted = new Vector<Rectangle>();
        
        //////////////////////////////////////////////////////////////////
        // Add code here to copy all references from "unsorted" to "sorted"
        // Use the sorted.add( int i, Rectangle r ) method to add the rectangle
        // to sorted at index i.
        // You should search for the first index in sorted
        ///////////////////////////////////////////////////////////////////
        
        
        for( int i = 0; i < unsorted.size(); i++ )
        {
           
            Rectangle r = unsorted.get(i);
            int b = 0;
            
            for( int s = 0; s < sorted.size(); s++ )
            {
                if( r.getHeight() > sorted.get(s).getHeight() )
                {
                    b = s + 1;
                    
                    
                }
            }
            sorted.add( b, unsorted.get( i ) );
            
            
            
        }

        
        
        return sorted;
    }
    
    
    
    ///////////////////////////////////////////////////////////////////////
    //
    // DO NOT CHANGE ANY CODE BELOW HERE
    //
    ///////////////////////////////////////////////////////////////////////
    
    //-------------------------- main -------------------------------------
    /**
     * generate an Vector<Rectangle> and call areaSubList for a variety
     * of different area min/max settings.
     */
    public static void main( String[] args )
    {
  
        Frame f = new Frame();
        Random rng = new Random( 4 );
 
        Vector<Rectangle> unsorted = makeList( rng );

        for ( int i = 0; i < unsorted.size(); i++ )
            unsorted.get(i).setLocation( i * 50 , 220 - unsorted.get(i).getHeight() );
 
        pause( "Sort them" );
        
        // hide them
        for ( int i = 0; i < unsorted.size(); i++ )
            unsorted.get(i).setLocation( -500 , 220 - unsorted.get(i).getHeight() );
 
        
        
       Vector<Rectangle> sorted = sort( unsorted );  
       for ( int i = 0; i < sorted.size(); i++ )
             sorted.get(i).setLocation( i*50 , 220 - sorted.get(i).getHeight());
         
   
    }
    //------------- makeList -----------------------------
    /**
     * create an Vector<Rectangle> 
     */
    private static Vector<Rectangle> makeList( Random rng )
    {   
        int num = 14;
           
        Vector<Rectangle> all = new Vector<Rectangle>();
        
        for ( int i = 0; i < num; i++ )
        {
            int h = rng.nextInt( 200 ) + 5;
            
            Rectangle r = new Rectangle( 0, 0 );
            
            r.setLocation( i*50 , 20);
            r.setSize(  40, h );
            all.add( r );
        }
        return all;
    }
    

    //------------------------- pause ----------------------------
    /**
     * pop up a dialog to wait for user input
     */
    private static void pause( String msg )
    {
        JOptionPane.showMessageDialog( null, msg );
    }
}