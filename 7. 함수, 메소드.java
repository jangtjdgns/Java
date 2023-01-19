//new는 개체생성하는 것
//함수 동작(행동)을 함	-> 메소드

public class _23_01_19_Main1 {
	public static void main(String[] args) {
		김철수 person = new 김철수();
		
		person.age = 22;
		person.isMarried = true;
		person.name = "철수";
		person.introduce();
		//person.run();	//함수 실행

		
		김철수 person2 = new 김철수();
		
		person2.age = 33;
		person2.isMarried = false;
		person2.name = "철수2";
		person2.introduce();
		//person2.run();	//함수 실행
		
	}
}

class 김철수{
	//데이터 저장용		이름: 명사
	int age;
	boolean isMarried;
	String name;
	
	//데이터 실행용
	//함수(메소드) 생성 -> void 함수명(){명령어} 이름: 동사
	void introduce() {
		//int age = this.age;				//this는 객체 내부에 있는 리모콘, introduce메소드가 age함수를 알지못하기 때문에 this사용
										//객체 내부의 값을 사용
		//boolean isMarried = this.isMarried;
		//String name = this.name;
		
		System.out.println("==자기소개==");
		System.out.printf("나이 : %d\n", this.age);	//변수를 선언하고 age = this.age/변수를 선언하지 않고 바로 this.age 가능
		System.out.printf("기혼 여부 : %b\n", this.isMarried);
		System.out.printf("이름 : %s\n", this.name);
	}
	/*
	void run() {		
		System.out.println("달리다");
	}*/
}