package exception;

public class IsFullExceptionStack extends RuntimeException {

	public IsFullExceptionStack() {
		super("El stack est� lleno");
	}
}
