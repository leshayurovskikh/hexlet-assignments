package exercise;

// BEGIN
public class NegativeRadiusException extends Exception{
    private String message;

    public NegativeRadiusException(String message) {
        this.message = message;
    }

    public NegativeRadiusException(String message, String message1) {
        super(message);
        this.message = message1;
    }

    public NegativeRadiusException(String message, Throwable cause, String message1) {
        super(message, cause);
        this.message = message1;
    }

    public NegativeRadiusException(Throwable cause, String message) {
        super(cause);
        this.message = message;
    }

    public NegativeRadiusException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String message1) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.message = message1;
    }


    public String getMessage(){
        return message;
    }
}
// END
