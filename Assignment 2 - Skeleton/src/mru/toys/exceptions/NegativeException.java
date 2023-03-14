package mru.toys.exceptions;

public class NegativeException extends Exception{
	public NegativeException() {
		super("Number cannot be negative! ");
	}
	
	public NegativeException(String message) {
		super(message);
	}
}
