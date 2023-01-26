//import java.util.Scanner;
//
//class 문자열을정수로변환하여계산하기 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String sum = sc.next();
//		int pm = 0;
//		
//		for(int j = 0; j < sum.length(); j++) {
//			if(sum.charAt(j) == '+') {
//				pm = 1;
//			}
//			else if(sum.charAt(j) == '-') {
//				pm = 2;
//			}
//			else if(sum.charAt(j) == '*') {
//				pm = 3;
//			}
//			else if(sum.charAt(j) == '/') {
//				pm = 4;
//			}
//		}
//
//		String[] sArr = sum.split("\\+|\\-|\\*|\\/");
//
//		String[] sRes = new String[sum.length()]; // 문자열 저장 배열
//		int[] nRes = new int[sRes.length]; 				// 문자열을 인트로 저장하는 배열
//
//		for (int i = 0; i < sArr.length; i++) {
//			sRes[i] = sArr[i]; 										// sRes에 sum변수에 저장된 문자열을 스플릿 기준으로 나누어 저장
//			nRes[i] = Integer.parseInt(sRes[i]); 	// nRes에 sRes배열에 저장되어 있는 문자열을 정수로 변환하여 저장
//		}
//
//		switch (pm) {
//		case 1:
//			System.out.printf("%d", nRes[0] + nRes[1]);
//			break;
//		case 2:
//			System.out.printf("%d", nRes[0] - nRes[1]);
//			break;
//		case 3:
//			System.out.printf("%d", nRes[0] * nRes[1]);
//			break;
//		case 4:
//			System.out.printf("%.2f", (double) nRes[0] / nRes[1]);
//			break;
//		}
//		
//	}
//}