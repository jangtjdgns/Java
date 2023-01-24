import java.util.Scanner;
import java.util.Calendar;

public class 출생년도_계산 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		int Year = Calendar.getInstance().get(Calendar.YEAR);
		int year = Year - age + 1;
		
		System.out.printf("%d %d", year < 2000 ? year - 1900 : year - 2000, year < 2000 ? 1 : 3);
	}
}
