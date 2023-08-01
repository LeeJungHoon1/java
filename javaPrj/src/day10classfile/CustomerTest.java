package day10classfile;

public class CustomerTest {

	public static void main(String[] args) {

		// 자료형이 있으면 자료형 맞는 변수를 만들 수 있어야 한다.

		int a;
		a = 10;

		// Customer형 변수를 만들어 봅시다.
		//참조형변수를 초기화하고 싶을 땐 null로 초기화
		// null=> 아무것도 참조하지 않음을 나타내는 값
		Customer customer = null;  //customer형 변수가 만들어지지 않앗다.
		customer = new Customer(); // new를 통해서 CUstomer형 변수가 만들어졌다.
					// customer변수 참조형변수입니다.
					// Customer형 변수가 있는 위치, 래퍼런스를 저장하는 참조형 변수.
		customer.id="test01";
		customer.pw="1234";
		customer.name="홍길동";
		customer.address="서울시 마포구";
		
		System.out.println(customer.id);
		System.out.println(customer.pw);
		System.out.println(customer.name);
		System.out.println(customer.address);
				
	}

}
