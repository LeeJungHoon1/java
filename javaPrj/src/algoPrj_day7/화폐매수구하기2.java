package algoPrj_day7;

import java.util.Scanner;

public class 화폐매수구하기2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("금액을 입력하세요: ");
		int n = 0;
		int a = sc.nextInt();
		int[] p = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
		int[] arr = new int[8];

		for (int i = 0; i < p.length; i++) {
			if (a / p[i] != 0) {
				arr[i] = a / p[i];
				a = a % p[i];
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(p[i] + "원 " + arr[i] + "개 입니다.");
		}

	}

}
