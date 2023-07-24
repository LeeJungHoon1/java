package algoPrj_day2;

import java.util.Scanner;

public class 재화님P_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		
		int pos=0;
		int neg=0;
		int posEven=0;
		int posOdd =0;
		
		int count=0;
		
		Scanner sc = new Scanner(System.in);
		while(count <=100) {
			count++;
			num=sc.nextInt();
			if(num>0) {
				
				pos= pos+1;
				if(num%2==0) {
					posEven++;
				}else {
					posOdd++;
				}
			}else {
				neg=neg+1;
			}
			
			
		}
		System.out.println("양수의 개수"+pos);
		System.out.println("음수의 개수"+neg);
		System.out.println("양수 중 짝숭의 개수"+posEven);
		System.out.println("짝수 중 음수의 개수"+posOdd);
		
	}

}
