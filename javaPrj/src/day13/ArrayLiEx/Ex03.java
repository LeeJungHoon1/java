package day13.ArrayLiEx;

public class Ex03 {

	public static void main(String[] args) {

		
		//문자열 변경해야 하는 경우
		//
		StringBuilder s = new StringBuilder("hello");
		s.setCharAt(1,'a');
		
		System.out.println(s);
		s.append("i love java");
		
		System.out.println(s);
	}

}
