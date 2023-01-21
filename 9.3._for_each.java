//for each 사용하기

public class for_each {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		int value;
		// for문
		for (int i = 0; i < array.length; i++) {
			value = array[i];
			System.out.println(value);
		}

		// for each문
		// for(타입 값을 받아줄 변수명:출력하고 싶은 자료구조)
		for (int value2 : array) {
			System.out.println(value2);
		}

	}
}
