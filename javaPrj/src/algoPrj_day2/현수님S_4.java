package algoPrj_day2;

import java.util.Scanner;

public class 현수님S_4 {

	public static void main(String[] args) {		// TODO Auto-generated method stub

		
		//입력자료
		String name;
		int kor, eng, math;
		
		//출력자료
		double avg;
		double avg_kor=0, avg_eng=0, avg_math=0;
		
		//처리변수
		int n=1;		//반복제어변수
		int sum_kor=0, sum_eng=0, sum_math=0;
		
		final int MAX=3; //상수화 변수
		
		
		Scanner sc = new Scanner(System.in);
		while(n<=MAX) {
			//입력
			name = sc.next();
			kor = sc.nextInt();
			eng = sc.nextInt();
			math = sc.nextInt();
			
			sum_kor = sum_kor+kor;
			sum_eng = sum_eng+eng;
			sum_math = sum_math+math;
			
			avg = (kor+eng+math)/3.0;
			
			if(avg >=90) {
				System.out.println("excellent");
			}else if(avg<60) {
				System.out.println("fail");
			}
			System.out.println( name+" "+kor+" "+eng+" "+math+" "+avg);
			n=n+1;
			
			//과목별 평균구하기
		
			avg_kor=(double) sum_kor/MAX;
			avg_eng=(double) sum_eng/MAX;
			avg_math=(double) sum_math/MAX;
			
			//
			System.out.println("국어평균"+avg_kor);
			System.out.println("영어평균"+avg_eng);
			System.out.println("수학평균"+avg_math);
			
			}

	}
		
	}


