package algoPrj_day5;

import java.util.Scanner;

public class 문제_2 {

	public static void main(String[] args) {

		int[] a = new int[10];
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.print("수를 입력하세요.");
			a[i] = sc.nextInt();
			sum += a[i];
		}
		System.out.print("\n 총 합: " + sum);
		
		System.out.print("\n{");
		for(int i =0; i<a.length; i++) {
			if(i==a.length-1) {
				System.out.print(a[i]);
				break;
			}
			System.out.print(a[i]+",");
		}
		System.out.print("}");

	}

}
