package algoPrj_day8;

public class EX2 {

	public static void main(String[] args) {
		
		
		int n=10;
		
		getSum2(n);
	}

	private static void getSum2(int n) {
		int sum=0;
		for(int i=1; i<=n; i++) {
			sum = sum+i;
		}
		System.out.println(sum);
	}


}
