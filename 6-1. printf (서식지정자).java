//2. 출력(printf)에서 서식지정자 사용
public class _23_01_18_Review2 {
	public static void main(String[] args) {
		
		int dan = 8;
		int i = 1;
		//같은 내용을 출력하더라도 편한 방법 중 하나를 선택하여 출력할 수 있어야한다. 
		System.out.println(dan + " * " + i + " = " + dan * i);
		
		//치환
		System.out.printf("%d * %d = %d\n", dan, i, dan * i);		
		//printf("서식지정자 사용하여 문장을 생성", 값, 값, 값)
		//서식지정자: %d, %f, %c, %s -> 4개 정도만 알아두면 편함
		//%d 부호없는 10진 정수, %f 부호없는 10진 실수, %c 문자, %s 문장
		
		//위 두가지 중 서식지정자를 사용하여 출력하는 방법이 더 간단함
	}
}
