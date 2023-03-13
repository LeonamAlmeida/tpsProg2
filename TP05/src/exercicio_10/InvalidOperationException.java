package exercicio_10;

public class InvalidOperationException extends Throwable {

    private String exception;

    public InvalidOperationException(String exception) {
        this.exception = exception;
    }

    public String getException() {
        return exception;
    }
    public void setException(String exception) {
        this.exception = exception;
    }
}
