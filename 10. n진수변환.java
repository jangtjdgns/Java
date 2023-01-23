//n진수 -> n진수 변환
//parseInt or valueOf 사용
import java.util.Scanner;

class n진수변환 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//10진수는 2, 8, 16진수로 변환, 입력 : 정수 / 출력 : 문자열
		System.out.println("10진수 입력");
		int num = sc.nextInt();
		String toBinary = Integer.toBinaryString(num);	//10진수 -> 2진수
		System.out.println(toBinary);
		
		String toOctal = Integer.toOctalString(num);		//10진수 -> 8진수
		System.out.println(toOctal);

		String toHex = Integer.toHexString(num);				//10진수 -> 16진수
		System.out.println(toHex);
		
		//2, 8, 16진수는 10진수로 변환, 입력 : 문자열 / 출력 : 정수
		//parseInt or valueOf 사용
		System.out.println("2진수 입력");
		String BinarytoInt = sc.next();
		int BInt = Integer.parseInt(BinarytoInt, 2);
		System.out.println(BInt);												//2진수 -> 10진수
		
		System.out.println("8진수 입력");
		String OctaltoInt = sc.next();
		int OInt = Integer.valueOf(OctaltoInt, 8);
		System.out.println(OInt);												//8진수 -> 10진수
		
		System.out.println("16진수 입력");
		String HextoInt = sc.next();
		int HInt = Integer.valueOf(HextoInt, 16);
		System.out.println(HInt);												//16진수 -> 10진수
		
		System.out.println();
		
		//2, 8, 16진수 -> 2, 8, 16진수로 변환
		//2, 8, 16진수를 먼저 10진수로 변환하고, 2, 8, 16진수로 변환
		
		System.out.println("2진수 숫자 255");
		String num1 = "255";			//숫자 제시
		//2진수 -> 8진수
		int BinarytoOctal = Integer.parseInt(num1);
		String BtO = Integer.toOctalString(BinarytoOctal);
		System.out.println("2진수 -> 8진수" + BtO);
		
		//2진수 -> 16진수
		int BinarytoHex = Integer.parseInt(num1);
		String BtH = Integer.toHexString(BinarytoHex);
		System.out.println("2진수 -> 16진수" + BtH);
		
		System.out.println("8진수 숫자 150");
		String num2 = "150";
		//8진수 -> 2진수
		int OctaltoBinary = Integer.parseInt(num2);
		String OtB = Integer.toBinaryString(OctaltoBinary);
		System.out.println("8진수 -> 2진수" + OtB);
		
		//8진수 -> 16진수
		int OctaltoHex = Integer.parseInt(num2);
		String OtH = Integer.toHexString(OctaltoHex);
		System.out.println("8진수 -> 16진수" + OtH);
		
		System.out.println("16진수 숫자 70");
		String num3 = "70";
		
		//16진수 -> 2진수
		int HextoBinary = Integer.parseInt(num3);
		String HtB = Integer.toBinaryString(HextoBinary);
		System.out.println("16진수 -> 2진수" + HtB);
		
		//16진수 -> 8진수
		int HextoOctal = Integer.parseInt(num3);
		String HtO = Integer.toOctalString(HextoOctal);
		System.out.println("16진수 -> 8진수" + HtO);
		
		
		//parseInt, valueOf 비교
		boolean a = Integer.valueOf("100") == Integer.valueOf("100");
		System.out.println(a);
		a = Integer.parseInt("100") == Integer.parseInt("100");
		System.out.println(a);
		a = Integer.parseInt("100") == Integer.valueOf("100");
		System.out.println(a);
	}
}