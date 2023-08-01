package algoPrj_day5;

public class Array2Ex {

	public static void main(String[] args) {

		// 내가 좋아하는 과일
		// 내가 좋아하는 음료

		String[] fruits = { "사과", "바나나", "수박", "딸기", "오랜지" };
		String[] beverage = { "아메리카노", "재로콜라", "포카리", "파워에이드", "차" };

		// 2차원 배열
		// 2차원 배열 선언 [행][열]

		// String[][] favorites = new String[2][5];

		String[][] favorites = { { "사과", "바나나", "수박", "딸기", "오랜지" }, { "아메리카노", "제로콜라", "캐모마일", "페퍼민트", "파워에이드" } };

		System.out.println(favorites[0][0]);
		System.out.println(favorites[0][1]);
		System.out.println(favorites[0][2]);
		System.out.println(favorites[0][3]);
		System.out.println(favorites[0][4]);

		System.out.println(favorites[1][0]);
		System.out.println(favorites[1][1]);
		System.out.println(favorites[1][2]);
		System.out.println(favorites[1][3]);
		System.out.println(favorites[1][4]);

		int[] 홀수 = { 1, 3, 5, 7, 9 };
		int[] 짝수 = { 2, 4, 6, 8, 10 };

		int[][] number = { { 1, 3, 5, 7, 9 }, { 2, 4, 6, 8, 10 } };

		System.out.print(number[0][0]);
		System.out.print(number[1][0]);
		System.out.print(number[0][1]);
		System.out.print(number[1][1]);
		System.out.print(number[0][2]);
		System.out.print(number[1][2]);
		System.out.print(number[0][3]);
		System.out.print(number[1][3]);
		System.out.print(number[0][4]);
		System.out.print(number[1][4]);

		System.out.println();

		for (int i = 0; i < 5; i++) {
			System.out.print(number[0][i]);
			System.out.print(number[1][i]);
		}
		
		System.out.println();
		
		for(int i =0; i<number.length;i++) {
			for(int j = 0; j<number[i].length;j++) {
				System.out.print(number[i][j]);
			}
		}

	}

}
