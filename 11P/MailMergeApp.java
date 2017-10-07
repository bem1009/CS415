import wheelsunh.users.*;
import java.util.*;
import java.awt.Color;
import javax.swing.filechooser.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.io.IOException;
import java.io.File;

/**
 * MailRecordException, thrown when an error is detected in a String
 *          that is supposed to define a MailRecord object.
 *  A correct String is a comma separated list consisting of:
 *   <<TITLE>>, <<FIRST>> , <<LAST>>, <<STREET>>, <<TOWN>>, <<STATE>>
 * 
 * @author cs415
 */
public class MailMergeApp
{
    private TextBox tb1, tb2;
    
    private TextBoxButton textbutton;
    private DataButton dbutton;
    private MergeButton mergebut;
    private JFileChooser fc;
    private ArrayList< MailRecord > recordz;
    private int whatrecord;
    private final String[] placeholder = { "<<TITLE>>", "<<FIRST>>", 
        "<<LAST>>", 
        "<<STREET>>", "<<TOWN>>", "<<STATE>>" };
    
    private String tp = "";
    /** 
     * MailMergeApp.
     */
    public MailMergeApp()
    {
        
        textbutton = new TextBoxButton( 520, 50, this );
        mergebut = new MergeButton( 520, 100, this );
        dbutton = new DataButton( 520, 150, this );
        
        tb1 = new TextBox( 10, 10 );
        tb1.setSize( 500, 300 );
        
        recordz = new ArrayList<MailRecord>();
        tb2 = new TextBox( 11, 325 );
        tb2.setSize( 500, 135 );
        tb2.setFillColor( Color.WHITE );
        
        
        
        
        
        
        FileFilter f1 = new FileNameExtensionFilter( " Files " , "txt" );
        fc = new JFileChooser();
        fc.setCurrentDirectory( new File( "." ) );
        fc.addChoosableFileFilter( f1 );
        fc.setFileFilter( f1 );
        
        
        
        
    }
    /** 
     * getTemplate gets the template file.
     */
    public void getTemplate()
    {
        fc.setSelectedFile( null );
        fc.showOpenDialog( null );
        File f2 = fc.getSelectedFile();
        Scanner scanit;
        
        try 
        {
            scanit = new Scanner( f2 );
        }
        catch( IOException ioe )
        {
            System.out.print( ioe.getMessage() );
            return;
        }
        catch( NullPointerException npe )
        {
            return;
        }
        
        tp = "";
        while( scanit.hasNextLine() )
        {
            tp += scanit.nextLine() + "\n";
        }
        
        tb1.setText( tp );
        tb1.setSize( 500, 300 );
        
    }
    /** 
     * getData ges the data file.
     */
    public void getData()
    {
        fc.setSelectedFile( null );
        fc.showOpenDialog( null );
        File f3 = fc.getSelectedFile();
        Scanner scanit2;
        
        try
        {
            scanit2 = new Scanner( f3 );
        }
        catch( IOException ioe )
        {
            System.err.println( ioe.getMessage() );
            return;
            
        }
        
        catch ( NullPointerException npe )
        {
            return;
        }
        
        recordz.clear();
        
        whatrecord = 0;
        String s = "";
        while( scanit2.hasNextLine() )
        {
            String newline = scanit2.nextLine();
            try
            {
                recordz.add( new MailRecord( newline ) );
                s += recordz.size() + ". " + newline + "\n";
            }
            catch( MailRecordException mre )
            {
                System.err.println( mre.getMessage() );
            }
            tb2.setText( s );
        }
    }
    /** 
     * merge merges the text.
     */
    public void merge()
    {
        if ( tp.equals( "" ) || recordz == null )
        {
            JOptionPane.showMessageDialog( null, " Need a file " );
            return;
        }
        
        String s2 = tp;
        
        for( int i = 0; i < placeholder.length; i++ )
        {
            s2 = s2.replace( placeholder[i], recordz.get( whatrecord ).
                                get( i ) );
            
            tb1.setText( s2 );
            tb1.setSize( 500, 300 );
            
            
            
            whatrecord++;
            if( whatrecord == recordz.size() )
                whatrecord = 0;
        }
    }
    
    /** 
     * main tests the app.
     * @param args is the main.
     */
    public static void main( String[ ] args ) 
    {
        new Frame();
        MailMergeApp m = new MailMergeApp();
        
    }
}