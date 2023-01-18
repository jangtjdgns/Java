//3. 새로운 type만들기
//철수의 개인 신상을 조사해보기
//변수 이름을 정할때는 이 이름과 객체와 연관성이 있어야함

public class _23_01_18_Review3 {
	public static void main(String[] args) {
		
		//철수의 개인신상 ->이름, 나이, 키, 성별, 전화번호, 주소, 결혼여부 등
		//개인신상에는 전부 다른 타입을 사용해야함
		
		철수 a = new 철수();		//철수라는 타입, 객체 생성
		a.이름 = "김철수";			//a를 활용해서 이름 지정
		a.나이 = 22;						//나이 지정
		a.키 = 170.2;						//키 지정
		
		System.out.println(a.이름);
		System.out.println(a.나이 + "세");
		System.out.println(a.키);
	}
}

//새로운 타입(커스텀타입)의 객체는 설계도의 역할을 함
//철수의 개인신상 객체 만들기
class 철수{
	String 이름;
	int 나이;
	double 키;
}