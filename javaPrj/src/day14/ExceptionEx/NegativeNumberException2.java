package day14.ExceptionEx;

// Exception(필수예외)
public class NegativeNumberException2 extends Exception {
	

	public NegativeNumberException2() {
		super( "음수이면 안된다");
	}

}
