package algoPrj_day5;

public class ArrayEx {

	public static void main(String[] args) {

		// 배열

		// 1. 배열 사용해보기 1차원 2차원 3차원
		// 2. 배열 이해하기

		// 자바에서 1차원 배열

		// 변수 5개 선언 (메모리 공간을 확보하는 행위)
		// int a, b, c, d, e;

		// 배열선언
		// 자바는 배열부터 heap메모리 강제한다.

		// c에서 배열을 선언하는 코드, 자바는 사용할 수 없다.
		// c언어에서 배열을 선언하는 두 가지 방법입니다.
		// int arr[5];
		// int* arr2 = (int*)malloc(sizeof(int) *5);

		// 자바에서 배열을 선언하는 밥법
		// int[] kors = new int[5];
		// int[] kors2 = { 90, 80, 99, 100, 89 }; // 배열의 초기화블럭

		int a = 10, b = 5, c = 8, d = 9, e = 25;
		int sum = a + b + c + d + e;
		System.out.println(sum);

		int[] arr = new int[5];
		// arr=10; X , 배열명은 배열(연속적인 기억장소의 시작점이다.)
		arr[0] = 10;
		arr[1] = 5;
		arr[2] = 8;
		arr[3] = 9;
		arr[4] = 25;

		int sum2 = arr[0] + arr[1] + arr[2] + arr[3] + arr[4];

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);

		// 배열의 청자는 변수를 사용할 수 있다.
		// 반복문을 사용할 수 있다.
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		// 내가 좋아하는 것 5개 배열로 만들고 출력하시오.
		// char[] arr = new char[5]; ' '
		// double[] arr2 = new double[5];
		// String[] arr3 = new String[5]; " "
		// int[] arr4 = new int[5];

		char[] p = new char[6];

		p[0] = '안';
		p[1] = '녕';
		p[2] = '하';
		p[3] = '세';
		p[4] = '요';
		p[5] = '.';

		System.out.print(p[0]);
		System.out.print(p[1]);
		System.out.print(p[2]);
		System.out.print(p[3]);
		System.out.print(p[4]);
		System.out.print(p[5]);

		System.out.println();

		for (int i = 0; i < p.length; i++) {
			System.out.print(p[i]);
		}

	}

}
