package day10;

import java.util.Scanner;

public class MyMath2Test {

	public static void main(String[] args) {
		
		MyMath2 math = new MyMath2();
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		math.input(a,b);
		math.result();
	}
}
