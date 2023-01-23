//문자열 붙이기, 자르기

public class concat_substring {
	public static void main(String[] args) {
		String str1 = new String("안녕");
		String str2 = new String("하세요");
		
		//따로 출력됨
		System.out.printf("%s%s\n", str1, str2);
		
		//str1에 str2문자열을 붙임
		String strConcat = str1.concat(str2);
		System.out.printf("%s\n", strConcat);
		
		//문자열 자르기
		String strSub = strConcat.substring(1, 3);	//2번째 자리부터 3번째 자리까지 출력
		System.out.printf("%s", strSub);
		
		String strSub2 = "안녕하세요";
		strSub = strSub2.substring(2);	//숫자 다음자리부터 끝까지 출력
	}
}
