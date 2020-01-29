package Main;

public class IncorrectDataEntryException extends Exception {
    public IncorrectDataEntryException() {
    }

    public IncorrectDataEntryException(String s) {
        super(s);
    }

    public IncorrectDataEntryException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public IncorrectDataEntryException(Throwable throwable) {
        super(throwable);
    }

    public IncorrectDataEntryException(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }
}
