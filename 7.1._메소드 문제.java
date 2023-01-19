// 문제 : 각각의 자동차가 서로 다른 최고속력으로 달리게 해주세요.
// 문제 : 번호가 다른 각각의 자동차가 서로 다른 최고속력으로 달리게 해주세요.

class _23_01_19_Exam3 {
	public static void main(String[] args) {
		// 구현시작
		자동차 a자동차1 = new 자동차();
		a자동차1.Number = 1;
		a자동차1.maxSpeed = 230;

		자동차 a자동차2 = new 자동차();
		a자동차2.Number = 2;
		a자동차2.maxSpeed = 210;
		// 구현끝

		a자동차1.달리다();
		// 출력 => 자동차가 최고속력 230km로 달립니다.

		a자동차2.달리다();
		// 출력 => 자동차가 최고속력 210km로 달립니다.
	}
}

class 자동차 {
	// 구현
	int Number;
	int maxSpeed;

	void 달리다() {
		System.out.printf("%d번 자동차가 최고속력 %dkm로 달립니다.\n", this.Number, this.maxSpeed);
	}
}