package algoPrj_day8;

import java.util.Scanner;

public class 실습_7 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("100이하의 수를 입력해주세요: ");
		int p =sc.nextInt();
		System.out.print(p+"까지 구하고 싶은 수를 입력해주세요 : 1.짝수, 2.홀수 ");
		int num = sc.nextInt();
		int[] a = new int[p];
		int[] b = new int[p];
		int n =0;
		int m =0;
		
		for(int i = 1; i<=p;i++) {
			if (i%2==0) {
					a[n]=i;
					n++;
			}else if(i%2!=0) {
					b[m]=i;
					m++;
			}
				
		}
		
		if(num == 1) {
			System.out.print("짝수: ");
			for(int i= 0; i<n;i++) {
			System.out.print(a[i] + " ");
			}
		}else if(num ==2) {
			System.out.print("홀수: ");
			for(int i = 0; i<m;i++) {
				System.out.print(b[i]+" ");
			}
		}else {
			System.out.print("잘못된 입력");
		}
	}


}
