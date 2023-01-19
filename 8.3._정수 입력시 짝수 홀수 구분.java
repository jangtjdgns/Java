//짝수만 순서대로 줄바꿈하여 출력
//a, b, c 3개의 정수 입력
import java.util.Scanner;

class _23_01_20_03정수_입력_짝수_홀수_구분 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = { 0, 0, 0 };
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			if (a[i] % 2 == 0) {
				System.out.println("even");
			} else {
				System.out.println("odd");
			}
		}
	}
}