import wheelsunh.users.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.JFileChooser;
import java.io.*;



/**
 * Lab2Db - practice some 2D array methods.
 *
 * @author cs415 and ???
 */
public class Game2048 implements KeyListener
{  
    private int [ ][ ]  matrix; 
    private Random gen, gennew;
    private TextBox tb, title, displayscore, highestscore, saveinfo;
    private int nCols = 4;
    private int nRows = 4;
    private int score, highint;
    private Tile[][] tilearr;
    
    
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    /**
     * Construct the lab.
     */
    public Game2048(  ) 
    {
        
        matrix = new int[ 4 ][ 4 ];
        gen = new Random( );
        tb = new TextBox( 1000, 2000 );
        displayscore = new TextBox( 150, 170 );
        title = new TextBox( 400, 270 );
        title.setText( "PRESS N TO START NEW GAME" );
        displayscore.setText( " SCORE: " + score );
        saveinfo = new TextBox( 400, 300 );
        saveinfo.setText( "PRESS S TO SAVE HIGH SCORE" );
        tilearr = new Tile[4][4];
        highestscore = new TextBox( 150, 140 );
        highestscore.setText( " High Score: " + highint );
        
        
        printArrFirst( ); 
        updateHighScore();
        highestscore.setText( "High Score: " + highint );
        
        score = 0;
        
    }
    
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    /**  
     *  Moves all nozero elements as far to the left as possible.
     *  All zero elements move to the right.
     *     
     *      
     */
    private void compressLeft( )
    {
        System.out.println( "compressLeft called" );
        
        for( int r = 0; r < matrix.length; r++ )
        {
            int insertAt = 0;
            for( int c = 0; c < matrix[r].length; c++ )
            {
                if ( matrix[r][c] != 0 )
                {
                    int swap = matrix[r][c];
                    matrix[r][c] = matrix[r][insertAt];
                    matrix[r][insertAt] = swap;
                    insertAt += 1;
                }
                
            }
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    /**  
     *  Does a 2048 merge left.
     *     
     *      
     */
    private void mergeLeft( )
    {
        System.out.println( "mergeLeft called" );
        
        compressLeft();
        
        for( int r = 0; r < matrix.length; r++ )
        {
            if( matrix[r][0] == matrix[r][1] && matrix[r][0] != 0 )
            {
                matrix[r][0] = matrix[r][0] + matrix[r][1];
                matrix[r][1] = 0;
                score = score + matrix[r][0];
                displayscore.setText( "Score: " + score );
            }
            else if( matrix[r][1] == matrix[r][2] && matrix[r][1] != 0 )
            {
                matrix[r][1] = matrix[r][1] + matrix[r][2];
                matrix[r][2] = 0;
                score = score + matrix[r][1];
                displayscore.setText( "Score: " + score );
            }
            else if( matrix[r][2] == matrix[r][3] && matrix[r][2] != 0 )
            {
                matrix[r][2] = matrix[r][2] + matrix[r][3];
                matrix[r][3] = 0;
                score = score + matrix[r][2];
                displayscore.setText( "Score: " + score );
            }
            
            compressLeft();
        }
        
    }
    /** 
     * compressRight compresses the numbers to the right.
     */
    private void compressRight()
    {
        System.out.println( "compressDown called" );
        
        for( int r = matrix.length - 1; r > -1 ; r-- )
        {
            int insertAt = 3;
            for( int c =  matrix[r].length - 1; c > -1 ; c-- )
            {
                if ( matrix[r][c] != 0 )
                {
                    int swap = matrix[r][c];
                    matrix[r][c] = matrix[r][insertAt];
                    matrix[r][insertAt] = swap;
                    insertAt--;
                }
            }
        }
    }
    /**
     * mergeRight merges the numbers to the right.
     */
    private void mergeRight()
    {
        compressRight();
        for( int r = 0; r < matrix.length; r++ )
        {
            if( matrix[r][0] == matrix[r][1] && matrix[r][0] != 0 )
            {
                matrix[r][0] = matrix[r][0] + matrix[r][1];
                matrix[r][1] = 0;
                score = score + matrix[r][0];
                displayscore.setText( "Score: " + score );
            }
            else if( matrix[r][1] == matrix[r][2] && matrix[r][1] != 0 )
            {
                matrix[r][1] = matrix[r][1] + matrix[r][2];
                matrix[r][2] = 0;
                score = score + matrix[r][1];
                displayscore.setText( "Score: " + score );
            }
            else if( matrix[r][2] == matrix[r][3] && matrix[r][2] != 0 )
            {
                matrix[r][2] = matrix[r][2] + matrix[r][3];
                matrix[r][3] = 0;
                score = score + matrix[r][2];
                displayscore.setText( "Score: " + score );
            }
            compressRight();
        }
    }
    /**
     * compressDown compresses the numbers down.
     */
    private void compressDown()
    {
        System.out.println( "compressDown called" );
        
        for( int c = matrix.length - 1; c > -1 ; c-- )
        {
            int insertAt = 3;
            for( int r =  matrix[c].length - 1; r > -1 ; r-- )
            {
                if ( matrix[r][c] != 0 )
                {
                    int swap = matrix[r][c];
                    matrix[r][c] = matrix[insertAt][c];
                    matrix[insertAt][c] = swap;
                    insertAt--;
                }
            }
        }
    }
    /**
     * mergeDown merges the numbers down.
     */
    private void mergeDown()
    {
        System.out.println( "mergeUp called" );
        
        compressDown();
        
        for( int c = 0; c < matrix.length; c++ )
        {
            if( matrix[0][c] == matrix[1][c] && matrix[0][c] != 0 )
            {
                matrix[0][c] = matrix[0][c] + matrix[1][c];
                matrix[1][c] = 0;
                score = score + matrix[0][c];
                displayscore.setText( "Score: " + score );
            }
            else if( matrix[1][c] == matrix[2][c] && matrix[1][c] != 0 )
            {
                matrix[1][c] = matrix[1][c] + matrix[2][c];
                matrix[2][c] = 0;
                score = score + matrix[1][c];
                displayscore.setText( "Score: " + score );
            }
            else if( matrix[2][c] == matrix[3][c] && matrix[2][c] != 0 )
            {
                matrix[2][c] = matrix[2][c] + matrix[3][c];
                matrix[3][c] = 0;
                score = score + matrix[2][c];
                displayscore.setText( "Score: " + score );
            }
            
            compressDown();
        }
    }
    /**
     * compressUp compress the numbers upward.
     */
    private void compressUp()
    {
        System.out.println( "compressUp called" );
        
        for( int c = 0; c < nCols; c++ )
        {
            int insertAt = 0;
            for( int r = 0; r < nRows; r++ )
            {
                if ( matrix[r][c] != 0 )
                {
                    int swap = matrix[r][c];
                    matrix[r][c] = matrix[insertAt][c];
                    matrix[insertAt][c] = swap;
                    insertAt += 1;
                }
            }
        }
    }
    
    /**
     * mergeUp merges the numbers up.
     */
    private void mergeUp()
    {
        System.out.println( "mergeUp called" );
        
        compressUp();
        
        for( int c = 0; c < matrix.length; c++ )
        {
            if( matrix[0][c] == matrix[1][c] && matrix[0][c] != 0 )
            {
                matrix[0][c] = matrix[0][c] + matrix[1][c];
                matrix[1][c] = 0;
                score = score + matrix[0][c];
                displayscore.setText( "Score: " + score );
            }
            else if( matrix[1][c] == matrix[2][c] && matrix[1][c] != 0 )
            {
                matrix[1][c] = matrix[1][c] + matrix[2][c];
                matrix[2][c] = 0;
                score = score + matrix[1][c];
                displayscore.setText( "Score: " + score );
            }
            else if( matrix[2][c] == matrix[3][c] && matrix[2][c] != 0 )
            {
                matrix[2][c] = matrix[2][c] + matrix[3][c];
                matrix[3][c] = 0;
                score = score + matrix[2][c];
                displayscore.setText( "Score: " + score );
            }
            
            compressUp();
        }
        
    }
    
    
    
    
    
    
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    /**
     * Convert the matrix to a String and put the String in a Textbox.
     * 
     * 
     */
    public void printArrFirst(   )
    { 
        if( matrix == null || tb == null  )
            return; 
        
        
        int diffx = 0;
        int diffy = 0;
        for ( int r = 0; r < matrix.length; r++ )
        {
            diffx = 0;
            for ( int c = 0; c < matrix[ r ].length ; c++ )
            {
                tilearr[r][c] = new Tile( diffx + 160, diffy + 220 );
                tilearr[r][c].setValue( matrix[r][c] );
                diffx += 40;
            }
            diffy += 30;
            
        }    
        
        
        
    }
    
    public void printArr()
    {
        for ( int r = 0; r < matrix.length; r++ )
        {
            
            for ( int c = 0; c < matrix[ r ].length ; c++ )
            {
                
                tilearr[r][c].setValue( matrix[r][c] );
                
            }
            
            
        }  
    }
    
    
    
    
    
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    /** Handle the key pressed event from the text field. 
      *  Use this for action key input such as arrows --- use
      *   e.getKeyCode()  ( returns int )
      * 
      * @param e KeyEvent
      */
    public void keyPressed( KeyEvent e ) 
    {
        int key = e.getKeyCode( );
        System.out.println( "keyPressed called with key " + key );
        
        if ( key == KeyEvent.VK_UP )
        {
            mergeUp();
            placeRandom();
            setTextHigh();
            
            
        }
        if ( key ==  KeyEvent.VK_DOWN )
        {
            mergeDown();
            placeRandom();
            setTextHigh();
        }
        if ( key == KeyEvent.VK_RIGHT )
        {
            mergeRight();
            placeRandom();
            setTextHigh();
        }
        if ( key == KeyEvent.VK_LEFT )
        {
            mergeLeft();
            placeRandom();
            setTextHigh();
        }
        if ( key == KeyEvent.VK_N )
        {
            clearArray();
            placeRandomStart();
            placeRandomStart();
            setTextHigh();
            score = 0;
            displayscore.setText( "SCORE: " + score );
        }
        if( key == KeyEvent.VK_S )
        {
            highscore();
            updateHighScore();
            setTextHigh();
        }
        
        
        
        else
        {
            
        }
        
        
        // re-display the matrix in case it has changed 
        printArr(   );
    }
    
    public void highscore()
    {
        File f = new File( "highest.txt" );
        try
        {
           PrintStream ps = new PrintStream( new FileOutputStream(f) );
           ps.println( score );
           ps.close();
            
        }
        catch( IOException e )
        {
            System.out.println( " IO Error" );
        }
    }
    
    public void updateHighScore()
    {
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader("highest.txt"));
            Scanner scan = new Scanner(reader);
            while( scan.hasNext() )
            {
                if( scan.hasNextInt() )
                    highint = scan.nextInt();
                
            }
            
        }
        catch( Exception e )
        {
            System.out.println( " ERROR " );
        }
        
    }
    
    public void setTextHigh()
    {
        if( highint > score )
        {
            highestscore.setText( "High Score: " + highint );
        }
        else
        {
            highestscore.setText( "High Score: " + score );
        }
    }
    
    
    
    
    
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    /**  
     * This will check the matrix to see if there are any "empty"
     *  elements (zero eleements).
     *     
     *  false: if there are zero entries
     *  true:  if all entries are non-zero
     * 
     * @return boolean
     */
    public boolean isFull( )
    {
        for ( int r = 0; r < matrix.length; r++ )
        {
            for ( int c = 0; c < matrix[ r ].length; c++ )
            {
                if( matrix[ r ][ c ]  == 0 )
                {
                    return false;
                }
            }
        }
        return true;
        
    }
    
    
    //------------------------- placeRandom ---------------------------
    /**
     * Randomly places num is an "empty" (zero) element and increments
     * num. If the array is "full" (all non-zero) then print a message
     * and return.
     * 
     */
    private void placeRandom( )
    {
        int r, c;
        gennew = new Random();
        
        
        if( isFull( ) )
        {
            System.out.println( "Matrix is full" );
            TextBox tbfull = new TextBox( 150, 400 );
            tbfull.setText( "GAME OVER" );
            return;
        }
        
        while ( true )
        {
            r = gen.nextInt( matrix.length );
            c = gen.nextInt( matrix[ 0 ].length );
            int randy = gennew.nextInt();
            
            if( matrix[ r ][ c ]  == 0 )
            {
                
                
                if( randy > 20 )
                    matrix[ r ][ c ] = 2;
                
                else if( randy < 20 )
                    matrix[ r ][ c ] = 4;
                break;
            } 
            printArr();
        } 
        
        
    }
    /**
     * placeRandomStart puts 2s on the board.
     */
    private void placeRandomStart( )
    {
        int r, c;
        
        if( isFull( ) )
        {
            System.out.println( "Matrix is full" );
            return;
        }
        
        while ( true )
        {
            r = gen.nextInt( matrix.length );
            c = gen.nextInt( matrix[ 0 ].length );
            
            if( matrix[ r ][ c ]  == 0 )
            {
                matrix[ r ][ c ] = 2;
                break;
            } 
            printArr();
        } 
        
        
    }
    
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    /**
     * Resets the array "matrix" so that all the values are 0.
     * 
     */
    private void clearArray( )
    {
        System.out.println( "clearArray called" );
        
        for ( int r = 0; r < matrix.length; r++ )
        {
            for ( int c = 0; c < matrix[ r ].length; c++ )
            {
                matrix[ r ][ c ]  = 0 ;
            }
        }
        printArr();
        
    }
    
    
    
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    /** Handle the key released event from the text field. 
      * NOT NEEDED for this lab
      * 
      * @param e KeyEvent
      */
    public void keyReleased( KeyEvent e ) 
    {
        // System.out.println("KEY RELEASED: " + e.getKeyCode( ) );
    }
    
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    /** Handle the key typed event from the text field. 
      *  NOT NEEDED for this lab
      * 
      * @param KeyEvent
      * 
      * @param e KeyEvent
      */
    public void keyTyped( KeyEvent e ) 
    {
        // char c = e.getKeyChar( );
    }
    
    //------------------------------------------------------------------
    /**
     * main.
     *
     * @param arg String[]
     */
    public static void main( String arg[] )
    {
        Frame frame = new Frame( );
        Game2048 lab = new Game2048(  );
        
        // add app as a keyListener to frame:
        frame.addKeyListener( lab );
        
    }
}
