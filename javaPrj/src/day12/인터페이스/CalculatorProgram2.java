package day12.인터페이스;

import java.util.Scanner;

public class CalculatorProgram2 {		
	 public static void main(String[] args) {	
		 
		 Scanner sc = new Scanner(System.in); 		 
		 System.out.print("두 수입력");
		 int num1= sc.nextInt();
		 int num2= sc.nextInt();		 		 	 
		 정훈계산기클래스  cal = new 정훈계산기클래스();		 
		 int result  =cal.add정훈(num1, num2);
		 System.out.println( result);
		 
		 int result2 = cal.sub정훈(num1, num2);
		 System.out.println(result2);
		 
		 int result3 = cal.multi정훈(num1, num2);
		 System.out.println(result3);
		 
		 int result4 = cal.divide정훈(num1, num2);
		 System.out.println(result4);

	 }

}
