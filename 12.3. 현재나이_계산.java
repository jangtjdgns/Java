import java.util.Scanner;
import java.util.Calendar;

class 현재나이_계산 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Year = Calendar.getInstance().get(Calendar.YEAR);	//현재 년도
		String num = sc.next();
		int year = 0;
		String[] a = num.split("");
			int Y1 = Integer.valueOf(a[0]);		//첫 번째 자리
			int Y2 = Integer.valueOf(a[1]);		//두 번째 자리
			
			Y1 = (Y1 * 10) + Y2;	//십의 자리 * 10 + 일의 자리
			
			int Y3 = sc.nextInt();
			
			if(Y3 < 3) {
				year = Y1 + 1900;
			}
			else {
				year = Y1 + 2000;
			}
			System.out.printf("%d", Year - year + 1);
	}
}