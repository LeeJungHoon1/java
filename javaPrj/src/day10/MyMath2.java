package day10;

public class MyMath2 {
	int a;
	int b;
	
	public void input(int a , int b) {
		this.a=a;
		this.b=b;
	}

	public void result() {
		
		int result = (a>b)? a:(a==b)? 0:b;
		
		System.out.print("더 큰수는 "+result);
	}

}
