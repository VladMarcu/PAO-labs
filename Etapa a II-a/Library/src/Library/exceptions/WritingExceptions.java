package Library.exceptions;

public class WritingExceptions extends Exception{
    public WritingExceptions(String message, Throwable messageThrown) {
        super(message, messageThrown);
    }

    public WritingExceptions(String message) {
        super(message);
    }
}
