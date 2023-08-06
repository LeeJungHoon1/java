package java_day12.동기상속연습;

public class Animal {
	
	
	String name;
	String fname;
	
	
	
	public Animal() {
		this("동물이름","별명"); // 매개변수 있는 생성자 호출
		
		
	}
	
	public Animal(String name, String fname) {
		this.fname=fname;
		this.name=name;
	}
	
	
	

}
