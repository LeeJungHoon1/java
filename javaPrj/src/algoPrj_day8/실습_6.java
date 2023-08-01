package algoPrj_day8;

public class 실습_6 {

	public static void main(String[] args) {

		String[] week = { "월", "화", "수", "목", "금", "토", "일" };
		String[] weather = { "맑음", "대체로 맑음", "흐림", "대체로 흐림", "비" };

		weekWeather(week, weather);
	}

	public static void weekWeather(String[] week, String[] weather) {
		for (int i = 0; i < week.length; i++) {
			System.out.print("요일: " + week[i] + " ");
			int a = ((int) (Math.random() * 4) + 1);
			System.out.println("날씨: " + weather[a]);
		}
	}

}
