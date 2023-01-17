//모든 문제를 while문과 for문 둘다 사용해서 풀기
public class _23_01_17_Exam {
	public static void main(String[] args) {

		// 문제1 : 1부터 5까지 출력해주세요.
		System.out.println("문제1 : 1부터 5까지 출력해주세요.");
		int a = 1;

		System.out.println("1)while문 사용");
		while (a <= 5) {
			System.out.println(a);
			a++;
		}

		System.out.println("\n2)for문 사용");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}

		// 문제2 : -100부터 25까지 출력해주세요.
		System.out.println("\n문제2 : -100부터 25까지 출력해주세요.");
		int b = -100;

		System.out.println("1)while문 사용");
		while (b <= 25) {
			System.out.println(b);
			b++;
		}

		System.out.println("\n2)for문 사용");
		for (int i = -100; i <= 25; i++) {
			System.out.println(i);
		}

		// 문제3 : 단을 * 1000까지 출력해주세요.
		// 조건 : 곱하는 순서를 거꾸로 해주세요.
		System.out.println("\n문제3 : 단을 * 1000까지 출력해주세요.");
		System.out.println("조건 : 곱하는 순서를 거꾸로 해주세요.");
		int dan = 8;
		int c = 1000;

		System.out.println("1)while문 사용");
		while (c >= 0) {
			System.out.println(dan + " * " + c + " = " + dan * c);
			c--;
		}

		System.out.println("\n2)for문 사용");
		for (int i = 1000; i >= 0; i--) {
			System.out.println(dan + " * " + i + " = " + dan * i);
		}

		// 문제4 : 단을 `* 1000`부터 `* -500`까지 출력해주세요.
		System.out.println("\n문제4 : 단을 `* 1000`부터 `* -500`까지 출력해주세요.");
		int d = 1000;

		System.out.println("1)while문 사용");
		while (d >= -500) {
			System.out.println(dan + " * " + d + " = " + dan * d);
			d--;
		}

		System.out.println("\n2)for문 사용");
		for (int i = 1000; i >= -500; i--) {
			System.out.println(dan + " * " + i + " = " + dan * i);
		}

		// 문제5 : 1부터 5까지의 합을 더한 결과를 출력해주세요.
		System.out.println("\n문제5 : 1부터 5까지의 합을 더한 결과를 출력해주세요.");
		int sum = 0;
		int e = 1;

		System.out.println("1)while문 사용");
		while (e <= 5) {
			System.out.println(e);
			sum += e;
			e++;
		}
		System.out.println("1부터 5까지의 합 : " + sum);
		sum = 0;

		System.out.println("\n2)for문 사용");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			sum += i;
		}
		System.out.println("1부터 5까지의 합 : " + sum);
		sum = 0;

		// 문제6 : -100부터 25까지의 합을 더한 결과를 출력해주세요.
		System.out.println("\n문제6 : -100부터 25까지의 합을 더한 결과를 출력해주세요.");
		int f = -100;

		System.out.println("1)while문 사용");
		while (f <= 25) {
			System.out.println(f);
			sum += f;
			f++;
		}
		System.out.println("-100부터 25까지의 합 : " + sum);
		sum = 0;

		System.out.println("\n2)for문 사용");
		for (int i = -100; i <= 25; i++) {
			System.out.println(i);
			sum += i;
		}
		System.out.println("-100부터 25까지의 합 : " + sum);
		sum = 0;

		// 문제7 : 1부터 3까지 출력하는 작업을 10번 해주세요.
		// 조건 : 2중 반복문 사용
		System.out.println("\n문제7 : 1부터 3까지 출력하는 작업을 10번 해주세요.");
		System.out.println("조건 : 2중 반복문 사용");
		int g = 1;
		int h = 1;

		System.out.println("1)while문 사용");
		while (g <= 10) {
			System.out.println(g + "번 반복");
			h = 1;
			while (h <= 3) {
				System.out.println(h);
				h++;
			}
			g++;
		}

		System.out.println("\n2)for문 사용");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + "번 반복");
			for (int j = 1; j <= 3; j++) {
				System.out.println(j);
			}
		}

		// 끝
	}
}
