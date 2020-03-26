package Model.Exceptions;

public class DivisionByZeroException extends Exception {

    private static final long serialVersionUID = 5516220286507543629L;

    private final int code;

    public DivisionByZeroException(int code) {
        super();
        this.code = code;
    }

    public DivisionByZeroException(String message, Throwable cause, int code) {
        super(message, cause);
        this.code = code;
    }

    public DivisionByZeroException(String message, int code) {
        super(message);
        this.code = code;
    }

    public DivisionByZeroException(Throwable cause, int code) {
        super(cause);
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}

