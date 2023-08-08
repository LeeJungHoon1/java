package day15;

public class CTest {

	public static void main(String[] args) {

		C c = new C();
		try {
			c.매서드(105);
		} catch (OverNumverException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}finally {
			// 예외 바ㅏㄹ생하든 하지 않은 수행하는코드
		}
		
		System.out.println("정상종료");
	}

}
