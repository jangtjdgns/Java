//현재 년, 월, 일, 시, 분, 초

import java.util.Calendar;

public class 현재날짜_시간출력 {
	public static void main(String[] args) {
		int year = Calendar.getInstance().get(Calendar.YEAR);
		int month = Calendar.getInstance().get(Calendar.MONTH) + 1; // 0부터 나오기때문에 +1
		int date = Calendar.getInstance().get(Calendar.DATE);

		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY); // 00~24
		int hour2 = Calendar.getInstance().get(Calendar.HOUR); // 0~12
		int minute = Calendar.getInstance().get(Calendar.MINUTE);
		int second = Calendar.getInstance().get(Calendar.SECOND);

		String AMPM = hour <= 12 ? "AM" : "PM";

		System.out.printf("%d년 %d월 %d일\n", year, month, date);
		System.out.printf("%d시 %d분 %d초\n", hour, minute, second);
		System.out.printf("%s.%d시 %d분 %d초\n", AMPM, hour2, minute, second);
	}
}