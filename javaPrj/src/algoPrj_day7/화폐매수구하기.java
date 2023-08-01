package algoPrj_day7;

import java.util.Scanner;

public class 화폐매수구하기 {

	public static void main(String[] args) {

		//Scanner sc =new Scanner(System.in);
		
		int n=0;
		int a = 325100;
				//sc.nextInt();
		int[] arr = new int[8];
		for(int i =0; i<arr.length;i++) {
			
			if(a/50000!=0) {
				n=a/50000;
				arr[i]=n;
				a=a%50000;
			}else if(a/10000!=0) {
				n=a/10000;
				arr[i]=n;
				a=a%10000;
			}else if(a/5000!=0) {
				n=a/5000;
				arr[i]=n;
				a=a%5000;
			}else if(a/1000!=0) {
				n=a/1000;
				arr[i]=n;
				a=a%1000;
			}else if(a/500!=0) {
				n=a/500;
				arr[i]=n;
				a=a%500;
			}else if(a/100!=0) {
				n=a/100;
				arr[i]=n;
				a=a%100;
			}else if(a/50!=0) {
				n=a/50;
				arr[i]=n;
				a=a%50;
			}else if(a/10!=0) {
				n=a/10;
				arr[i]=n;
				a=a%10;
			}
		}
		
		
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
