package algoPrj_day1;

public class 박태민P_22 {

	public static void main(String[] atgs) {
		
		int sum=0;
		
		for(int n=1; n<=100; n++) {
			sum=sum+n*(101-n);
		}
		
		System.out.println(sum);
	}
}
