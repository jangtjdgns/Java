
public class 난수생성 {
	public static void main(String[] args) {
		float a = (float) (Math.random());		//실수형 * 10 해야함
		int b = (int) (Math.random() * 10);

		System.out.printf("%f\n%d", a, b);
	}
}