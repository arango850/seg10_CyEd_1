package exception;

public class isEmptyExceptionStack extends RuntimeException {

	public isEmptyExceptionStack() {
		super("El stack está vacío");
	}
}
