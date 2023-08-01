package algoPrj_day8;

import java.util.Scanner;

public class 실습_4 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

	
		loop : while(true) {
			System.out.print("인사말을 입력해주세요: 1.한글, 2.영어 3.종료 ");
			int a = sc.nextInt();
			switch(a) {
			case 1:
				kor();
				break;
			case 2:
				eng();
				break;
			case 3:
				System.out.print("종료합니다.");
				break loop;
			default:
				System.out.print("잘못된 입력입니다.");
			}
			
		}
		
	}
	public static void eng() {
		System.out.print("출력 횟수를 입력해주세요.");
		int eng = sc.nextInt();
		if(eng>0) {
			for(int i=1; i<=eng; i++) {
				System.out.print("Hello ");
				}
		}
		System.out.println();
	}
	public static void kor() {
		System.out.print("출력 횟수를 입력해주세요.");
		int kor = sc.nextInt();
		if(kor>0) {
			for(int i=1; i<=kor; i++) {
				System.out.print("안녕하세요 ");
				}
		}
		System.out.println();
	}
}
