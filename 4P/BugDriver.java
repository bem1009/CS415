import wheelsunh.users.*;
import java.awt.Color;

/** 
 * BugDriver.java:
 *     Puts  Bug's through their paces.
 * 
 * @author cs415 
 */

public class BugDriver 
{ 
    //---------------- instance variables ------------------------------
    private Bug     myBug;           // the myBug being tested
    private TextBox label, colorLabel, locStartLabel, locEndLabel;   
    
    //--------------- constructor --------------------------------------
    /**
     * All the work is done in the constructor:
     *    Construct a Bug and then test it.
     *    TextBox objects are displayed to label each test and to show 
     *     results
     */
    public BugDriver()
    {
        label = new TextBox( 270, 40 );
        label.setSize( 290, 100 );
        label.setText( "new Bug( )" );
        
        myBug = new Bug();
        
        Utilities.sleep( 2000 );
        
        label.setText( "new Bug( 20, 200 )" );
        Utilities.sleep( 1000 );
        myBug = new Bug( 20, 200 );
        
        Utilities.sleep( 2000 );
        
        label.setText( "new Bug( Color.ORANGE )" );
        Utilities.sleep( 1000 );
        myBug = new Bug( Color.ORANGE );
        
        Utilities.sleep( 2000 );
        
        label.setText( "setLocation ( 350, 300 ) " );
        Utilities.sleep( 1000 );
        myBug.setLocation( 350, 300 );
        
        Utilities.sleep( 2000 );
        label.setText( "setColor ( PINK ) " );
        Utilities.sleep( 1000 );
        myBug.setColor( Color.pink );
        
        
        
        Utilities.sleep( 2000 );
        colorLabel = new TextBox( 270, 110 );
        colorLabel.setSize( 290, 100 );
        
        colorLabel.setText( "getColor( ) =  " + myBug.getColor() +
                           "\nShould be ( 225, 175, 175 )" );
        
        Utilities.sleep( 2000 );
        
        locStartLabel = new TextBox( 270, 180 );
        locStartLabel.setSize( 290, 100 );      
        locStartLabel.setText( "Start Location" +
                              "\nXlocation =  " + myBug.getXLocation() +
                              "\nYLocation = " + myBug.getYLocation()  );     
        Utilities.sleep( 1000 );
        
        
        label.setText( "move" );
        Utilities.sleep( 1000 );
        
        for( int i = 0; i < 60; i++ )
        {
            myBug.moveUp( 4 );
            Utilities.sleep( 20 );
        }
        
        locEndLabel = new TextBox( 270, 410 );
        locEndLabel.setSize( 290, 100 ); 
        locEndLabel.setText( "End Location" +
                            "\ngetXlocation = " + myBug.getXLocation() +
                            "\ngetYLocation = " + myBug.getYLocation() );
    }
    
    
    
    //-------------------- main -------------------------------------------
    /**
     * Just create a BugDriver object.
     * 
     * @param args String[]
     */
    public static void main( String[] args )
    {
        new Frame();
        new BugDriver( );
    }
}
