//문자열에서 특정 문자 개수 구하는 방법 3가지
class 문자열에서_특정문자_개수_구하기{
	public static void main(String[] args) {
		String s = "apple";
		
		System.out.println(countChar1(s, 'a'));
		System.out.println(countChar1(s, 'p'));
		System.out.println(countChar1(s, 'l'));
		System.out.println(countChar1(s, 'e'));
		System.out.println(countChar1(s, 'z'));
		System.out.println();
		System.out.println(countChar2(s, 'a'));
		System.out.println(countChar2(s, 'p'));
		System.out.println(countChar2(s, 'l'));
		System.out.println(countChar2(s, 'e'));
		System.out.println(countChar2(s, 'z'));
		System.out.println();
		System.out.println(countChar3(s, 'a'));
		System.out.println(countChar3(s, 'p'));
		System.out.println(countChar3(s, 'l'));
		System.out.println(countChar3(s, 'e'));
		System.out.println(countChar3(s, 'z'));
	}
	
	//1번 반복문 이용
	static int countChar1(String s, char c) {
		int count = 0;
		for(int i = 0; i<s.length(); i++) {
			if(s.charAt(i) == c) {
				count++;
			}
		}
		return count;
	}
	
	//2번 stream 이용	-> 인터넷 자료 더 찾아보기
	static long countChar2(String s, char ch) {
		return s.chars().filter(c -> c == ch).count();
	}
	
	//3번 replace()이용
	static int countChar3(String s, char c) {
		return s.length() - s.replace(String.valueOf(c), "").length();
	}
}