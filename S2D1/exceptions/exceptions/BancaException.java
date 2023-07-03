package exceptions;

public class BancaException extends Exception {

	private static final long serialVersionUID = 4484614175127191687L;

	public BancaException(String message) {
		super(message);
	}

	@Override
	public String toString() {
		return getMessage();
	}
}
