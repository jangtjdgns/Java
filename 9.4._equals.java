//equals
//equals는 문자열 자체를 비교
//==는 String의 주소를 비교

public class equals {
	public static void main(String[] args) {
		String str1 = "test";							//리터럴 사용
		String str2 = new String("test");	//new 연산자 사용
		String str3 = "test";							//비교용
		
		//리터럴과 연산자 비교
		if(str1 == str2) {
			System.out.println("str1과 str2는 같습니다.");
		}
		else {
			System.out.println("str1과 str2는 다릅니다.");			
		}
		
		//리터럴과 리터럴 비교
		if(str1 == str3) {
			System.out.println("str1과 str3은 같습니다.");
		}
		else {
			System.out.println("str1과 str3은 다릅니다.");			
		}
		
		if(str1.equals(str2)) {
			System.out.println("str1과 str2는 같습니다.");
		}
		else {
			System.out.println("str1과 str2는 다릅니다.");			
		}
	}
}
