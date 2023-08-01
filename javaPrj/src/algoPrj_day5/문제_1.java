package algoPrj_day5;

import java.util.Scanner;

public class 문제_1 {

	public static void main(String[] args) {

		int[] a = new int[10];
		int n = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.print("수를 입력하세요: ");
			int p = sc.nextInt();
			if (p % 2 == 0) {
				a[n] = p;
				n += 1;
			}
		}

		System.out.print("짝수는:{");
		for (int j = 0; j < n; j++) {
			if (j == n - 1) {
				System.out.print(a[j]);
				break;
			}
			System.out.print(a[j] + ",");
		}
		System.out.print("}입니다.");

	}

}
