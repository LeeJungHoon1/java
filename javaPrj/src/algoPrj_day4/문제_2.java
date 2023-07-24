package algoPrj_day4;

import java.util.Scanner;

public class 문제_2 {

	public static void main(String[] args) {


		
		System.out.print("수를 입력하세요:");
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int sum = 0;
		for(int i=1; i<=a;i++) {
			sum=sum+i;
		}
		System.out.println("합: " + sum);
		
	}

}
