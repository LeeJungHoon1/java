package day12.동기상속연습;

public class Gram extends Notebook {
	String name;
	String gpu;
	
	public Gram(String cpu, int ram, String name, String gpu) {
		super(cpu, ram );		// 부모의 매개변수가 이쓴ㄴ 생성자를 호출하는 코다
								// 명시적으로 부모의 생성자를 호출하는 코드가 없으면
								// 부모의 기본생성자 super()를 호출한다.
		this.name = name;
		this.gpu = gpu;
	}
	
	public String toString() {
		return name + cpu + ram + gpu;
	}
}
