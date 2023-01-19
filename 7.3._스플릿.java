//split은 구분자를 기준으로 문자열을 잘라 배열로 입력 받을때 사용하는 메소드
//상황: 전화번호를 입력 했을때 010-0000-0000식으로 입력하지만
//출력은 '-' 를 없애고 출력해야한다.

import java.util.Scanner;

class _23_01_19_01스플릿_split {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String[] sArr = s.split("-");
		int a = Integer.valueOf(sArr[0]);
		int b = Integer.valueOf(sArr[1]);
		int c = Integer.valueOf(sArr[2]);
		
		System.out.printf("%03d%04d%04d", a, b, c);
	}
}