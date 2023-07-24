package algoPrj_day3.동기;

public class 지원님S_5 {

	public static void main(String[] args) {
		
		// 등비수열 각항에 *3씩 규칙 정용됨
		// 공비:3
		// 1 2 3 4 5 6 7....
		// 2 6 18 54 164 486.....
		
		int sum=0;	// 항의 누적을 구할 변
		int n=0;	// 반복제어변수, 항의 순
		int a=2;	// 항의 구할변수
		int b=3;	// 공비
		
		while(n<7) {
			sum=sum+a;	// sum+=a;
			a=a*b;
			n++;	//
			
		}
		System.out.println(sum);
	}

}
