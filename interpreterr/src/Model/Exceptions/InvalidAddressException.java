package Model.Exceptions;

public class InvalidAddressException extends Exception {

    private static final long serialVersionUID = 5516220286507543629L;

    private final int code;

    public InvalidAddressException(int code) {
        super();
        this.code = code;
    }

    public InvalidAddressException(String message, Throwable cause, int code) {
        super(message, cause);
        this.code = code;
    }

    public InvalidAddressException(String message, int code) {
        super(message);
        this.code = code;
    }

    public InvalidAddressException(Throwable cause, int code) {
        super(cause);
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
