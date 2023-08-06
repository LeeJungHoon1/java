package day14.실습;

import java.util.Arrays;

public class Fruit {

	String[] fruit = {"사과","바나나","오랜지","망고","딸기"};
	
	public Fruit() {}

	public Fruit(String[] fruit) {
		super();
		this.fruit = fruit;
	}

	@Override
	public String toString() {
		return "Fruit [fruit=" + Arrays.toString(fruit) + "]";
	}

	public String[] getFruit() {
		return fruit;
	}

	public void setFruit(String[] fruit) {
		this.fruit = fruit;
	}
}
