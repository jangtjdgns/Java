//6일차 문제
//문제1. 자동차 설계도를 만들어주세요.
// 문제2 : 자동차 객체를 담을 변수를 만들어주세요.
// 문제3 : 자동차 객체를 만들고 변수에 담아주세요.
// 문제4 : 자동차 객체마다 서로 다른 최고속력를 가지도록 해주세요.
// 문제5 : 1개의 자동차가 3번 달리게 해주세요.
// 문제6 : 3개의 자동차가 각각 1번씩 달리게 해주세요.

public class _23_01_19_Exam1 {
	public static void main(String[] args) {

		Car car1 = new Car();

		car1.이름 = "car1";
		car1.최고속력 = 240;
		car1.drive();

		/*
		 * for (int i = 0; i < 3; i++) { System.out.printf("%s drive %d\n", car1.이름, i + 1);}
		 */

		Car car2 = new Car();
		car2.이름 = "car2";
		car2.최고속력 = 300;
		car2.drive();

		Car car3 = new Car();
		car3.이름 = "car3";
		car3.최고속력 = 350;
		car3.drive();

	}
}

class Car {
	String 이름;
	int 최고속력;

	void drive() {
		System.out.printf("%s drive\n", this.이름);
	}
}
