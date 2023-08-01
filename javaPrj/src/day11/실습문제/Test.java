package day11.실습문제;

public class Test {

	public static void main(String[] args) {
		Animal a = new Animal();
		Mammalia m = new Mammalia();
		Birds b = new Birds();
		Dog d = new Dog();
		Cat c = new Cat();
		Pigeon p = new Pigeon();
		
		print(p);
		print(m);


		
		
	}
	public static void print( Animal a) {
		//a.걷는다();
		//a.먹는다();
		//a.본다();
		//a.잔다();		
		//a.낳는다();
		a.짖는다();

	}

}
