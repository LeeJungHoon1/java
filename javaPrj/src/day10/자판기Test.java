package day10;

import java.util.Scanner;

public class 자판기Test {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		
		
		System.out.print("선택해주세요: 1.돈넣기 2.가격인상 3.가격인하");
		int s = sc.nextInt();
		extracted(s);


	}

	public static void extracted(int s) {
		자판기 drink = new 자판기();
		if(s == 1) {
			System.out.print("\n 돈을 넣어주세요.");
			int money = sc.nextInt();
			drink.buy(money);
		}else if(s == 2) {
			System.out.print("\n 인상 할 금액을 넣어주세요: 콜라, 사이다, 물, 커피, 이온음료");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			int e = sc.nextInt();
			drink.priceIncrease(a, b, c, d, e);
		}else if(s == 3) {
			System.out.print("\n 인하 할 금액을 넣어주세요: 콜라, 사이다, 물, 커피, 이온음료");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			int e = sc.nextInt();
			drink.priceReduction(a, b, c, d, e);
		}else {
			System.out.print("\n 잘못된 입력");
		}
	}

}
