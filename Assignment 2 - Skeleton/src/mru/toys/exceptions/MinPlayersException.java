package mru.toys.exceptions;

public class MinPlayersException extends Exception{
	
	public MinPlayersException() {
		super("Minimum number of Players cannot be greater than maximum number of players");
	}
	public MinPlayersException(String error) {
		super(error);
	}
	
}
