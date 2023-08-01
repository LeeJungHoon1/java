package algoPrj_day8;

import java.util.Scanner;

public class 실습_1 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		
		System.out.print("두 수를 입력하세요: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		Sum(a, b);
		
	}

	public static int Sum(int a , int b) {
		int sum =0;
		sum = a+b;
		System.out.print("두수의 합은: " + sum);
		return sum;
	}

}
