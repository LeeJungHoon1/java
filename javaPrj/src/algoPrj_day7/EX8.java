package algoPrj_day7;

public class EX8 {

	public static void main(String[] args) {
		
		int result = a(5);
		System.out.println(result);
		
		int result1 = b('너');
		System.out.println(result1);
		
		char result2 = c(3);
		System.out.println(result2);
		
		double result3 = d();
		System.out.println(result3);
		
		String result4 = e();
		System.out.println(result4);
		
		System.out.println(p(12,32));
		
	}

	// 1)
	public static int a(int a) {
		System.out.println("a 호출");
		return 3;
	}

	// 2)
	public static int b(char a) {
		System.out.println("b 호출");
		return 4;
	}

	// 3)
	public static char c(int a) {
		System.out.println("c 호출");
		return 'c';
	}

	// 4)
	public static double d() {
		System.out.println("d 호출");
		return 2.5;
	}

	// 5)
	public static String e() {
		System.out.println("e 호출");
		return "안녕";
	}
	public static int p(int q,int w) {
		int sum = 0;
		sum = q+ w;
		return sum;
	}
}
