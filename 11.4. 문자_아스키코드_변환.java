//문자 <=> 아스키코드 변환

import java.util.Scanner;

public class 문자_아스키코드_변환 {
	public static void main(String[] args) {
		//문자 -> 아스키코드 값 출력
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		
		int integer = (int)a;
		System.out.println(integer);
		
		//아스키코드 값 출력 -> 문자
		int integer2 = sc.nextInt();
		char a2 = (char)integer2;
		System.out.println(a2);
	}
}
