//복습
//*반복문 *3대 *구성요소
//1. 초기값 설정
//2. (종료)조건 -> limit설정
//3. step(++, --)

public class _23_01_17_Review1 {
	public static void main(String[] args) {
		int w = 1; //

		System.out.println("1. while문");
		while (w <= 5) {
			System.out.println(w);
			w++;
		}

		System.out.println("==============");

		System.out.println("2. 이중 while문"); // 1,2가 세번나옴
		w = 1;
		int ww;
		while (w <= 3) {
			ww = 1;
			while (ww <= 2) {
				System.out.println(ww);
				ww++;
			}
			w++;
		}

		System.out.println("==============");

		System.out.println("3. for문");
		for (int f = 1; f <= 5; f++) {
			System.out.println(f);
		}

		System.out.println("==============");

		System.out.println("4. 이중 for문");
		for (int f = 1; f <= 3; f++) {
			for (int ff = 1; ff <= 2; ff++) {
				System.out.println(ff);
			}
		}
	}
}