package compras.exceptions;

@SuppressWarnings("serial")
public class DomainException extends RuntimeException {

    public DomainException(String message) {
        super(message);
    }

}
