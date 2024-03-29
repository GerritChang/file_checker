package top.gerritchang.daily.exception;

public class ColumnIsNullException extends Exception {

    private static final long serialVersionUID = 1L;

    public ColumnIsNullException(){
        super();
    }

    public ColumnIsNullException(String msg) {
        super(msg);
    }

    public ColumnIsNullException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public ColumnIsNullException(Throwable cause) {
        super(cause);
    }
}
