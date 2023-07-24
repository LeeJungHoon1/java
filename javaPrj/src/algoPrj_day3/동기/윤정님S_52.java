package algoPrj_day3.동기;

public class 윤정님S_52 {

	public static void main(String[] args) {
		// 등비수열 각항에 *3씩 규칙 정용됨
		// 공비:3
		// 1 2 3 4 5 6 7....
		// 2 6 18 54 164 486.....
		int sum = 0;
		int n = 2;
		int i = 1;

		while (i < 7) {
			n = (n * 2) + n; // 항을 구한다.
			sum = sum + n; // 항을 누적한
			i++; // i=i+1;
		}
		System.out.println(sum);
	}

}
