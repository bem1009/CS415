import javax.swing.JFileChooser;
import java.io.*;
import java.util.*;

/**
 * MailRecordException, thrown when an error is detected in a String
 *          that is supposed to define a MailRecord object.
 *  A correct String is a comma separated list consisting of:
 *   <<TITLE>>, <<FIRST>> , <<LAST>>, <<STREET>>, <<TOWN>>, <<STATE>>
 * 
 * @author cs415
 */
public class MailRecord extends ArrayList< String >
{
    /**
     * Construct a MailRecordException.
     * 
     * @param msg String
     * 
     */
    private String s1;
    private ArrayList<MailRecord> mailz;
    
    private ArrayList<MailRecord> records;
    
    /**
     * Constructor.
     * @param line is the string input.
     */
    public MailRecord( String line )
    {
        super();
        
        if( line == null )
        {
            throw new MailRecordException( " Fields are Null " );
            
        }
        String[] arr = line.split( "," );
        
        if ( arr.length != 6 )
        {
            throw new MailRecordException( " Must Have 6 Fields " );
        }
        
        for( String s : arr )
        {
            s = s.trim();
            if ( s.equals( "" ) )
            {
                throw new MailRecordException( " Fields cannot be empty: " 
                                                  + line );
                
            }
            else 
            {
                this.add( s );
            }
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    /** 
     * MAIN tests the mailrecordexception in a mailrecord.
     * @param args is the args.
     */
    public static void main( String[ ] args ) 
    {
        String test = " Mrs., Marge, Simpson, 742 Evergreen Terrace,"
            + "Springfield, Oregon ";
        System.out.println( "Good String: |" + test +  "| " );
        MailRecord mr = new MailRecord( test );
        for( int i = 0; i < mr.size(); i++ )
        {
            System.out.println( "    Field" + ( i + 1 ) + ": " + mr.get( i ) );
            
        }
        System.out.println();
        test = "Mrs., Marge, Simpson, 742 Evergreen Terrace, Springfield";
        System.out.println( "Not enough Fields |" + test + " | " );
        try 
        {
            new MailRecord( test );
        }
        catch( MailRecordException mre )
        {
            System.err.println( mre.getMessage() );
        }
        System.out.println();
        
        test =  "Mrs., Marge, Simpson, 742 Evergreen Terrace," 
            + "Springfield, Oregon, 03031 ";
        
        System.out.println( " Too many Fields | " + test + " | " );
        try
        {
            new MailRecord( test );
        }
        catch( MailRecordException mre )
        {
            System.err.println( mre.getMessage() );
            
        }
        System.out.println();
        
        test = null;
        System.out.println( " Null " );
        try
        {
            new MailRecord( test );
        }
        
        catch( MailRecordException mre )
        {
            System.err.println( mre.getMessage() );
        }
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
}