package algoPrj_day7;

public class EX7 {

	public static void main(String[] args) {
		//1~10까지 합
		
		System.out.println("프로그램을 시작합니다.");
		
		sum();
		
		System.out.println("코드를 수행합니다.");
		
		sum();
		
		System.out.println("프로그램을 종료합니다.");
	}

	public static void sum() {
		int sum=0;
		for(int i=1; i<=10; i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
}
