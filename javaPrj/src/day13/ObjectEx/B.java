package day13.ObjectEx;

public class B {
	int number;
	
	public B(int number) {
		super();
		this.number=number;
	}
	
	public String toString() {
		return "number";
	}
	
	@Override
//	public boolean equals(B this ,Object obj) {
	public boolean equals(Object obj) { // 업캐스팅
		
		
		boolean result = false;
		B b = (B)obj;  // 다운캐스팅   :  실체객체가 중요합니다
		if(this.number == b.number) {
			result=true;
		}
		return result;
	}
	
}
