package algoPrj_day4;

public class continueEx {

	public static void main(String[] args) {

		// continue 명령 반복문에서 다음 반복으로 바로 진행될 수 있도록 하는 명령
		// 1~10까지 홀수합구하기
		// 1 3 7 9
		
		int sum=0; // 홀수합을 저장할 변수
		for(int i=1; i<=10; i++) {
			if(i%2 ==0) {
				continue;
			}
			sum+=i;
		}
		System.out.println("홀수함" + sum);
	}

}
