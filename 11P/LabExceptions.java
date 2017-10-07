import java.util.*;
import java.io.*;
import javax.swing.JFileChooser;

/**
 * LabExceptions.java. 
 * @author cs415
 * 
 * 
 */
public class LabExceptions 
{ 
    /**
     * Constructor.
     * 
     *@throws IOException if file won't open
     */
    public LabExceptions( )                         
    { 
        // Create a File using FileChooser
        JFileChooser fc = new JFileChooser();
        fc.setCurrentDirectory( new java.io.File( "." ) );
        int returnVal = fc.showOpenDialog( null );
        File inputFile = fc.getSelectedFile();
        
        System.out.println( "Selected file: " + inputFile.getName( ) );
 
        
        
        
        
        ////////////////////////////////////////////////////////////////
        
        System.out.println( "\n*******************************\n" );
        System.out.println( "Part 1: print the file to standard output" +
                           " with line numbers\n\n" );
        
        lineInput( inputFile );
        
        System.out.println( "\n*******************************\n" );
        System.out.println( "Part 2:print the same file one token per" +
                           " line\n\n" ); 
        
        tokenInput( inputFile );
        
        
        System.out.println( "\n*******************************\n" );
        System.out.print( "Part 3 read integers and print them one per line" );
        System.out.println( " and sum them up:\n" );
       
        integerInputAndSum( inputFile );
        
    }
    
    
    //////////////////////////////////////////////////////////////////////////
    /**
     * Read lines from inputFile and print out with line numbers.
     * 
     * @throws IOException  if file won't open
     * @param inFile File
     */
    private void lineInput( File inFile ) 
    {       
        Scanner scanFile;
        // 2a. Create a Scanner object from the File parameter, inFile 
        try
        {
        scanFile = new Scanner( inFile );
        }
        catch( IOException ioe )
        {
            System.out.println( "lineInput Error: " + ioe.getMessage() );
            return;
        }
        
        
        // 2b. Read lines from the Scanner, print each input line on 1 
        // output line
        // prefixed by its line number starting at 1 and a space.
        while ( scanFile.hasNextLine() )
        {
            System.out.println( scanFile.nextLine() );
        }
        
        
    }
    
    //////////////////////////////////////////////////////////////////////////
    /**
     * Read tokens from inputFile and print out as one token per line.
     * 
     * 
     * @throws IOException  if file won't open
     * @param inFile File
     */
    
    private void tokenInput( File inFile ) 
    {
        Scanner scanFile;
        // 3a. Create a Scanner object from the File parameter, inFile 
        try
        {
        scanFile = new Scanner( inFile );
        }
        catch ( IOException ioe )
        {
            System.out.println( "tokenInput Error: " + ioe.getMessage() );
            return;
        }
        
        // 3b. Read tokens from the Scanner, print each input token 
        //     on its own output line
        
        while ( scanFile.hasNext() )
        {
            System.out.println( scanFile.next() );
        }
        
        
        
        // 6. Add try-catch
        
    }
    
    
    /**
     * Read integers, print them out along with their sum.
     * 
     * 
     * @throws IOException  if file won't open
     * @param inFile File
     */
    private void integerInputAndSum( File inFile ) 
    {
        Scanner scanFile;
        // 4a. Create a Scanner object from the File parameter, inFile 
        try
        {
        scanFile = new Scanner( inFile );
        }
        
        catch ( IOException ioe )
        {
            System.out.println( "integerInputAndSum Error: " + ioe.getMessage() );
            return;
        }
        
        // 4b. Read ntegers from the Scanner, print each input token 
        //     on its own output line and add them up. When you are done
        //     print out the sum
        
        while ( scanFile.hasNextInt() )
        {
            System.out.println( scanFile.nextInt() );
        }
        
        
        // 7. Add try-catch
    }
    
    
    
    
    /**
     * Main.
     * @param args String[]
     * @throws IOException  if file won't open
     */
    public static void main( String[ ] args ) 
    {
        LabExceptions app = new LabExceptions( );
    }
}
