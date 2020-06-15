package exceptions; 
 
 
 
public class UserCommentNotFoundException extends RuntimeException { 
 
 
 
    /**
   * 
   */
  private static final long serialVersionUID = 1L;



    public UserCommentNotFoundException() { 
 
        super(); 
 
         
 
    } 
 
 
 
    public UserCommentNotFoundException(String message, Throwable cause, boolean enableSuppression, 
 
            boolean writableStackTrace) { 
 
        super(message, cause, enableSuppression, writableStackTrace); 
 
     
 
    } 
 
 
 
    public UserCommentNotFoundException(String message, Throwable cause) { 
 
        super(message, cause); 
 
         
 
    } 
 
 
 
    public UserCommentNotFoundException(String message) { 
 
        super(message); 
 
        // TODO Auto-generated constructor stub 
 
    } 
 
 
 
    public UserCommentNotFoundException(Throwable cause) { 
 
        super(cause); 
 
        // TODO Auto-generated constructor stub 
 
    } 
} 