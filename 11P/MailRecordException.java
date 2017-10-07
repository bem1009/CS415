/**
 * MailRecordException, thrown when an error is detected in a String
 *          that is supposed to define a MailRecord object.
 *  A correct String is a comma separated list consisting of:
 *   <<TITLE>>, <<FIRST>> , <<LAST>>, <<STREET>>, <<TOWN>>, <<STATE>>
 * 
 * @author cs415
 */
public class MailRecordException extends RuntimeException
{
    /**
     * Construct a MailRecordException.
     * 
     * @param msg String
     * 
     */
  
  

    public MailRecordException( String msg )
    {
        super( "MailRecord ERROR:" + msg );
    }
}