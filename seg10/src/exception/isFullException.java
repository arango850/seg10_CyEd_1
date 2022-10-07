package exception;

public class isFullException extends RuntimeException{

	public isFullException() {
		super("La fila Está llena");
	}
}
