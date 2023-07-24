package algoPrj_day3.동기;

public class 단야님P_23 {

	public static void main(String[] args) {

		//
		int sum = 0; // 누적합

		int jsum = 0; // 항을 구할변수
		int i = 1; // 반복을 제어할 변수

		final int MAX = 100;

		// i= 1 2 3 4 5 6 7 8 9 10 ... 100
		// 1 (1+2)(1+2+3)(1+2+3+4)
		// 1 3 6 10

		while (i <= MAX) {
			jsum = jsum + i;
			sum = sum + jsum;
			i++;
		}

		System.out.println(sum);

	}

}
