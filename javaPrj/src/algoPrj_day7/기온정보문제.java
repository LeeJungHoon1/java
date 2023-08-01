package algoPrj_day7;

public class 기온정보문제 {

	public static void main(String[] args) {

		int[] temperatures = { 27, 27, 28, 29, 30, 33, 32, 33, 32, 31, 31, 33, 33, 31 };

		// 문제 1

		for (int i = 0; i < temperatures.length; i++) {
			System.out.print(temperatures[i] + "도 ");
		}

		System.out.println();

		// 문제 2

		for (int i = temperatures.length - 1; i >= 0; i--) {
			System.out.print(temperatures[i] + "도 ");
		}

		System.out.println();

		// 문제 3
		int s = 0;
		int a = 0;
		for (int i = 0; i < temperatures.length; i++) {
			s += temperatures[i];
		}
		a = s / temperatures.length;
		System.out.print(a + "도");

		System.out.println();

		// 문제 4

		int n = 0;
		for (int i = 0; i < temperatures.length; i++) {
			if (a < temperatures[i]) {
				n++;
			}
		}
		System.out.print(n + "일");

		System.out.println();

		// 문제 5
		int m = 0;
		for (int i = 0; i < temperatures.length; i++) {
			if (m < temperatures[i]) {
				m = temperatures[i];
			}
		}
		System.out.print(m + "도");

		System.out.println();

		// 문제 6
		int o = m;
		for (int i = 0; i < temperatures.length; i++) {
			if (o > temperatures[i]) {
				o = temperatures[i];
			}
		}
		System.out.print(o + "도");

	}

}
