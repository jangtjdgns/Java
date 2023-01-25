import java.util.Scanner;

public class 두정수_최댓값구하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int swap = 0;

		double[] arr = new double[8];
		arr[0] = a + b;
		arr[1] = a - b;
		arr[2] = b - a;
		arr[3] = a * b;
		arr[4] = a / b;
		arr[5] = b / a;
		//Math.pow(a, b) -> a^b
		arr[6] = Math.pow(a, b);
		arr[7] = Math.pow(b, a);

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					swap = (int) arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = swap;
				}
			}
		}
		System.out.printf("%.6f", (double) arr[7]);
	}
}
