package algoPrj_day3.동기;

public class 윤님P_1 {

	public static void main(String[] args) {

		
		//항			1+3+5+7...............99	합을 구하시오.
		
		int sum=0;
		int n=1;
		final int MAX=11;
		while(n<=MAX) {
			sum+=n;
			n+=2;
		}
		System.out.println(sum);
	}

}
