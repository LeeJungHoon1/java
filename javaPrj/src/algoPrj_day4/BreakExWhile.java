package algoPrj_day4;

import java.util.Scanner;

public class BreakExWhile {

	public static void main(String[] args) {

		// 메뉴 1.등록, 2. 조회, 3.변경, 4.삭제, 5.종료
		Scanner sc = new Scanner(System.in);

		int menu;
		System.out.print("메뉴 1.등록, 2. 조회, 3.변경, 4.삭제, 5.종료");
		menu = sc.nextInt();
		switch (menu) {
		case 1:
			System.out.println("등록선택");
			break;
		case 2:
			System.out.println("조회선택");
			break;
		case 3:
			System.out.println("변경선택");
			break;
		case 4:
			System.out.println("삭제선택");
			break;
		case 5:
			System.out.println("종료");
		default:
			System.out.println("잘못된선택");
		}

		// 반복문

		loop : while (true) {
			System.out.print("메뉴 1.등록, 2. 조회, 3.변경, 4.삭제, 5.종료");
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				System.out.println("등록선택");
				break loop;
			case 2:
				System.out.println("조회선택");
				break loop;
			case 3:
				System.out.println("변경선택");
				break loop;
			case 4:
				System.out.println("삭제선택");
				break loop;
			case 5:
				System.out.println("종료");
			default:
				System.out.println("잘못된선택");
			}
		}

	}

}
