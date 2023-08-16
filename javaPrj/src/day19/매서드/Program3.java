package day19.매서드;

public class Program3 {

	public static void main(String[] args) {

		// 책 정보를 담을 수 있는 변수를 만드는 것
		// 객체라고 부름 1. ( 구조가 있는 변수) + 매서드
		Book book = new Book("자바의 정석", 28000,"도우출판사");
		book.매서드(); // book객체의 정보 전달 됨 = > this 참조변수형
		
		
	}

}
