import java.util.Scanner;

public class 오름차수정렬1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int swap = 0;
		
		if(a > b && b > c) {	//321
			swap = a;
			a = c;
			c = swap;
		}
		else if(a > c && c > b) {	//312
			swap = a;
			a = b;
			b = c;
			c = swap;
		}
		else if(b > a && a > c) {	//231
			swap = b;
			b = a;
			a = c;
			c = swap;
		}
		else if(c > a && a > b) {	//213
			swap = a;
			a = b;
			b = swap;
		}
		
		else if(b > c && c > a) {	//132
			swap = b;
			b = c;
			c = swap;
		}
		else if(a == c && b > a) {	//121
			swap = b;
			b = c;
			c = swap;
		}
		else if(b == c && a > b) {	//211
			swap = a;
			a = c;
			c = swap;
		}
		else if(a == b && a > c) {	//221
			swap = a;
			a = c;
			c = swap;
		}
		else if(a == c && a > b) {	//212
			swap = a;
			a = b;
			b = swap;
		}
		
		System.out.printf("%d %d %d", a, b, c);
	}
}
