import java.util.Scanner;

class 재귀함수 {
	public static void main(String[] args) {
		
		재귀.반복(1);
		System.out.println("종료");
	}
}

class 재귀 {
	
	static void 반복(int a) {
		Scanner sc = new Scanner(System.in);
		if (a == 0) {	
			return;
		}
		a = sc.nextInt();
		반복(a++);
	}
}