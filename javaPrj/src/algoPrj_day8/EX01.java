package algoPrj_day8;

public class EX01 {

	public static void main(String[] args) {
		
		getSum(); //함수 호출
		
	}
			// void => 반환값이 없다.
			// 반환type 함수명();	// (입력정보(매게변수))
	public static void getSum() {
		int sum =0;
		for(int i=1;i<=10;i++) {
			sum+=1;
		}
		System.out.println(sum);
	}

}
