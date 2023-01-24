//버블정렬
import java.util.Scanner;

class 오름차수정렬2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("정렬의 길이는 몇으로 할까요?");
		int Max = sc.nextInt(); // 정렬 수
		int t = 0;		//swap시 값 저장변수

		int[] arr = new int[Max];
		for (int num = 0; num < Max; num++) {
			System.out.println(num + 1 + "번째 입력");
			arr[num] = sc.nextInt();
		}

		for (int i = 0; i < arr.length - 1; i++) { // arr배열 길이 - 1 까지
			//정렬 전 숫자 출력
			System.out.print("전 : ");
			for(int before = 0; before < Max; before++) {
				System.out.print(arr[before] + " ");
			}
			System.out.println();
			
			for (int j = 0; j < arr.length - 1; j++) { // arr배열 길이 - 1 까지
				if (arr[j] > arr[j + 1]) {
					t = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = t;
				}
				
				//정렬 과정 출력
				System.out.print("정렬 중 : ");
				for(int after = 0; after < Max; after++) {
					System.out.print(arr[after] + " ");
				}
				System.out.println();
			}
		}
		
		//최종 오름차순으로 출력
		System.out.print("최종 : ");
		for(int result = 0; result < Max; result++) {
			System.out.print(arr[result] + " ");
		}
	}
}