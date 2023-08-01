package day11.클래스만들고사용하기예제;

public class cap {

	int age;
	String name;
	boolean married;
	int son;

	public void input(int age, String name, boolean married, int son) {
		this.age = age;
		this.name = name;
		this.married = married;
		this.son = son;

	}

	public void printInfo() {
		System.out.print("나이는 " + this.age + "이름은 " + this.name + "결혼여부는 " + this.married + "자녀수는 " + this.son);
	}
}
