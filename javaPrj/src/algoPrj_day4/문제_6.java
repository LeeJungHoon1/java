package algoPrj_day4;

import java.util.Scanner;

public class 문제_6 {

	public static void main(String[] args) {


		int sum = 0;
		for(int i=1; i<=10; i++) {
			System.out.print("수를 입력하세요: ");
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			if(a %2 == 0) {
				sum += a;
			}else if(a %1 ==1) {
				continue;
			}
		}
		System.out.println("짝수의 총 합은: "+ sum);
	}

}
