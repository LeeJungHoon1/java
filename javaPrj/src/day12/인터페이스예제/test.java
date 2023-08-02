package day12.인터페이스예제;

public class test {

	public static void main(String[] args) {

		kimbop kb = new kimbop("김","밥","단무지","햄");
		kimbop tu = new 참치김밥("김","밥","단무지","햄","참치","마요네즈");
		kimbop ch = new 치즈김밥("김","밥","단무지","햄","치즈","스팸");
		
		System.out.println(tu.toString());
		System.out.println(ch.toString());
		
	}

}
