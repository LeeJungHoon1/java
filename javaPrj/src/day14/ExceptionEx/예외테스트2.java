package day14.ExceptionEx;

import java.util.Scanner;

public class 예외테스트2 {

	public static void main(String[] args) {

		
		MyMath2 m = new MyMath2();
		try {
			m.add2(-5,3);
		} catch (NegativeNumberException2 e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

}
