//입력 Systme.in
import java.util.Scanner;

public class _23_01_19_Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//문장출력
		System.out.print("문장을 입력해주세요 : ");
		String s = sc.nextLine();
		System.out.println(s);
		
		//정수 출력
		System.out.print("정수를 입력해주세요 : ");
		int num = sc.nextInt();
		System.out.println(num);
		
		//실수 출력
		System.out.print("실수를 입력해주세요 : ");
		float num2 = sc.nextFloat();
		System.out.println(num2);

	}
}
