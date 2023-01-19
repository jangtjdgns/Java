//입력 Boy
//출력
//'B'
//'o'
//'y'
import java.util.Scanner;

class _23_01_20_01문자_배열에_접근방법_split2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String[] sArr = s.split("");
		for(int i=0; i<sArr.length; i++) {
			String a = String.valueOf(sArr[i]);
			System.out.printf("\'%s\'\n", a);
		}
	}
}