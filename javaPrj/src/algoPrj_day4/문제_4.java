package algoPrj_day4;

import java.util.Scanner;

public class 문제_4 {

	public static void main(String[] args) {

		System.out.println("숫자를 입력하세요.");
		System.out.print("1.등록, 2.조회, 3.변경, 4.삭제 : ");
		Scanner sc = new Scanner(System.in);
		
			int menu = sc.nextInt();
			switch(menu) {
			case 1:
				System.out.println("등록하기");
				break;
			case 2:
				System.out.println("조회하기");
				break;
			case 3:
				System.out.println("변경하기");
				break;
			case 4:
				System.out.println("삭제하기");
				break;
		}
	}

}
