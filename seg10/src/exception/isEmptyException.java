package exception;

public class isEmptyException extends RuntimeException {

	public isEmptyException() {
		super("La Fila está vacía");
	}
}
