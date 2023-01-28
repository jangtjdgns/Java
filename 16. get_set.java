//GET, SET메소드
//get, set을 사용하는 이유는 데이터의 무결성 때문
//get은 변수값을 반환하는 것이 목적이기 때문에 return필요
//클래스 내의 변수는 외부에서 다른 값을 반환받지 않게하기위해
//PRIVATE로 선언되어야함
//PRIVATE로 변수를 은식하고 필요한 곳에서 get함수를 이용하여 조회가능

//set은 변수값을 할당하는 것이 목적이기 때문에 인자를 받음
//set함수를 통해 변수값을 대입하므로 모든 코드에서 무결성 보장가능
//set메소드 내에서 작업이 진행되므로 객체지향에 적합함

public class get_set {
	public static void main(String[] args) {
		Car acar = new Car();
		acar.setFuel(10);
		System.out.println(acar.getFuel());
		acar.setFuel(5);
		System.out.println(acar.getFuel());
		acar.setFuel(15);
		System.out.println(acar.getFuel());
	}
}

class Car {
	private int fuel;

	//get
	int getFuel() {
		return fuel;
	}

	//set
	void setFuel(int f) {
		if (f < 10) {
			return;
		} 
		else {
			this.fuel = f;
		}
	}
}