package pruebas.exception;

public class GeneracionDatosException extends RuntimeException {

    public GeneracionDatosException(String message) {
        super(message);
    }

    public GeneracionDatosException(String message, Throwable cause) {
        super(message, cause);
    }
}
