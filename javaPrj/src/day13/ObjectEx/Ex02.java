package day13.ObjectEx;

public class Ex02 {

	public static void main(String[] args) {

		B b1 = new B(5);
		B b2 = new B(5);
		
		// 두 개의 객체가 만들어 진것
		
		// true, false
		if (b1.equals(b2)) {  // b1, b2
			System.out.println("두 객체는 같습니다");
		}
		// Object의 equals() 는 객체의 레퍼런스를 비교합니다.
	}



}
