package algoPrj_day8;

import java.util.Scanner;

public class 실습_3 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("원하는 별을 입력하세요: ");
		String a = sc.next();
		System.out.print("별의 수를 입력하세요: ");
		int b = sc.nextInt();
		
		star(a, b);
	}
	public static void star(String a, int b) {
		for(int i=1; i<=b;i++) {
			System.out.print(a+" ");
		}
	}

}
