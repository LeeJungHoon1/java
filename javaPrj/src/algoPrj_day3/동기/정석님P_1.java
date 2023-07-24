package algoPrj_day3.동기;

public class 정석님P_1 {

	public static void main(String[] args) {

		//항			1+3+5+7...............99	합을 구하시오.
		
		//항의 누적합을 출력하는 문제
		
		int sum=0;
		int n=1;
		
		while(n<=99) {
			sum+=n;
			n+=2;
		}
		System.out.println(sum);
	}

}
