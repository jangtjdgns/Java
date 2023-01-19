//입력 75254
//출력
//[70000]
//[5000]
//[200]
//[50]
//[4]
import java.util.Scanner;

class _23_01_20_02정수_배열에_접근방법_split3 {
	public static void main(String[] args) {
		int b = 10000;
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		String[] sArr = s.split("");
		for (int i = 0; i < sArr.length; i++) {
			int a = Integer.valueOf(sArr[i]);
			System.out.printf("[%d]\n", a * b);
			b /= 10;
		}
	}