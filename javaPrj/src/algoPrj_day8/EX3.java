package algoPrj_day8;

public class EX3 {

	public static void main(String[] args) {

		int n = 5;

		int result = getSum3(n);
		System.out.println(result);
	}

	public static int getSum3(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		return sum;
	}

}
