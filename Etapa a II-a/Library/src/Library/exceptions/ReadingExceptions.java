package Library.exceptions;

public class ReadingExceptions extends Exception {
    public ReadingExceptions(String message, Throwable messageThrown) {
        super(message, messageThrown);
    }

    public ReadingExceptions(String message) {
        super(message);
    }
}
