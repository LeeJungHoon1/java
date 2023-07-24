package algoPrj_day4;

import java.util.Scanner;

public class 문제_10 {

	public static void main(String[] args) {

		String menu;
		int qty;
		int amount =0;
		int 아메리카노 = 2000;
		int 카푸치노 =2900;
		int 모카라떼=3200;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴와 수량을 입력하세요.");
		menu=sc.next();
		qty=sc.nextInt();
		
		switch(menu) {
		case "아메리카노":
			amount = 아메리카노 * qty;
			break;
		case "카푸치노":
			amount = 카푸치노 * qty;
			break;
		case "모카라떼":
			amount = 모카라떼 * qty;
			break;
		default:
			System.out.println("없는메뉴");
			amount=0;
		}
		System.out.println(amount);
	}

}
