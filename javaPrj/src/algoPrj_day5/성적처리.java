package algoPrj_day5;

import java.util.Scanner;

public class 성적처리 {

	public static void main(String[] args) {

		double avg = 0;
		double kor_avg, eng_avg, math_avg;

		// 입력자료
		String name;
		int kor, eng, math;

		int sum;
		int kor_sum = 0, eng_sum = 0, math_sum = 0;

		final int MAX = 3;
		final int SUBJECT = 3;

		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= MAX; i++) {
			name = sc.next();
			kor = sc.nextInt();
			eng = sc.nextInt();
			math = sc.nextInt();
			sum = kor + eng + math;
			avg = (double) sum / SUBJECT;

			kor_sum += kor;
			eng_sum += eng;
			math_sum += math;

			if (avg >= 90) {
				System.out.println(name + " " + kor + " " + eng + " " + math + " " + avg + " " + "Excellent");
			} else if (avg < 60) {
				System.out.println(name + " " + kor + " " + eng + " " + math + " " + avg + " " + "file");
			} else {
				System.out.println(name + " " + kor + " " + eng + " " + math + " " + avg + " " + "file");
			}
		}
		// 반복문 종료
		kor_avg = (double) kor_sum / MAX;
		eng_avg = (double) eng_sum / MAX;
		math_avg = (double) math_sum / MAX;

		System.out.println(kor_avg);
		System.out.println(eng_avg);
		System.out.println(math_avg);

	}

}
