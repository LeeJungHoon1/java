package day15;

public class OverNumverException extends Exception{
	
	public OverNumverException() {
		super("100초과하면 안됨");
	}

}
