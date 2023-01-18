public class _23_01_18_Exam {
	public static void main(String[] args) {

		//1. arr1에 [true, true, false] 연결
		boolean[] arr1 = new boolean[3];
		arr1[0] = true;
		arr1[1] = true;
		arr1[2] = false;

		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println("=======================");

		
		//2. arr2에 [3.14, 5.55, 10.0] 연결
		double[] arr2 = {3.14, 5.55, 10.0};				//new doulbe[3] == {3.14, 5.55, 10.0} -> 두개는 같은 의미임
		
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		System.out.println("=======================");

		
		//3. arr3에 [1~10] 연결
		int[] arr3 = new int[10];
		
		for (int i = 0; i < arr3.length; i++) {			//반복문에서 범위를 정할때 arr.length 사용하는 것이 용이함
														//객체의 요소 개수를 바꿨을때 반복문을 건드릴 필요가 없음
			arr3[i] = i + 1;
			System.out.println(arr3[i]);
		}		
		System.out.println("=======================");

		
		//4. 배열요소의 총 합, 평균
		int[] arr = new int[10];						//정수 10개 저장할 수 있는 배열객체를 arr에 연결
		int sum = 0;									//총합을 저장할 변수
		
		for (int i = 0; i < arr.length; i++) {			//범위를 0 ~ arr.length
			arr[i] = (i + 1) * 10;						//0~9까지의 요소에 10씩증가하는 값을 저장
			sum += arr[i];
		}
		System.out.println("배열 요소의 총 합 : " + sum);
		System.out.println("배열 요소의 평균 : " + sum / arr.length);
	}
}
