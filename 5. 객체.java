//객체
//ex)윈도우의 폴더같은 역할
public class _23_01_17_Review2 {
	public static void main(String[] args) {

		int[] arr = new int[3]; // [] -> 복수형 (정수들)
		//위에서 =의 의미를 대입한다가 아닌 연결한다로 보는게 좋음
		//정수들이 존재할수 있는 arr변수와 새로운 정수형 객체를 만들어서 연결한다.
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		//arr[0] 번호: index
		//위 같은 메모리에 만들어진 객체와 변수가 서로 연결되어 변수가 리모콘 역할을 함
		//쉽게 변수라는 리모콘을 이용해서 객체를 조종하는 것
		
		//객체는 서로 관련성이 있어야함
		
		for (int i = 0; i < 3; i++) {
			System.out.println(arr[i]);
		}
	}
}
