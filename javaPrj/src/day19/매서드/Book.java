package day19.매서드;


// Book type을 정의할 때
public class Book {
	
	// Book bokk = new Book(); // new에 의해서 구조가 있는 변수가 만들어짐(객체)
	private String 책이름;
	int 가격;
	String 출판사;
	
	//생성자
	public void 매서드() {
		System.out.println("매서드");
	}

	public Book(String 책이름, int 가격, String 출판사) {
		super();
		this.책이름 = 책이름;
		this.가격 = 가격;
		this.출판사 = 출판사;
	}
	
	public Book() {}
	
	
	//toString
	//매서드
	//이 매서드를 사용하는 시점은 .. 객체가 생성된 이후 ( 맴버변수가 만들어진 이후부터 사용가능하다.)

}
