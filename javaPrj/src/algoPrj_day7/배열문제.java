package algoPrj_day7;

import java.util.Scanner;

public class 배열문제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] array = new int[20];

		System.out.print("수를 입력하세요: ");
		int a = sc.nextInt();
		int n = 0;

		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				array[n] = i;
				n++;
			}
		}

		System.out.print("약수는: ");
		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
