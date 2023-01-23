//static변수 범위
public class scope_static {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.wheels = 4;
		car1.windows = 4;
		System.out.println("car1의 바퀴 수 : " + car1.wheels);
		System.out.println("car1의 창문 수 : " + car1.windows);		
		
		Car car2 = new Car();
		car2.wheels = 8;
		car2.windows = 8;
		System.out.println("car2의 바퀴 수 : " + car2.wheels);
		System.out.println("car2의 창문 수 : " + car2.windows);
		
		System.out.println();
		//값 변화
		car1.wheels = 2;
		car2.wheels = 6;
		//static 변수는 인스턴스가 아닌 클래스에 귀속되기 때문에
		//인스턴스가 여러개 생성되더라도 static변수는 하나만 존재
		System.out.println("car1의 바퀴 수 : " + car1.wheels);
		System.out.println("car2의 바퀴 수 : " + car2.wheels);
		
		car1.windows = 2;
		car2.windows = 6;
		System.out.println("car1의 창문 수 : " + car1.windows);
		System.out.println("car2의 창문 수 : " + car2.windows);
		
	}
}

class Car{
	static int wheels;
	int windows;
}