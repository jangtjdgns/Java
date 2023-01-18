//정수,논리,String으로 구성되어있는 객체를 만들고
//임의의 값을 넣은 후 출력해주세요

//동물병원 진료접수증
public class _23_01_18_숙제 {
	public static void main(String[] args) {
		
		//1번 Pet1 객체 
		진료접수증 Pet1 = new 진료접수증();
		//Pet1.OO  ->  객체 속성 부여
		Pet1.접수번호 = 1;
		Pet1.보호자 = "김철수";
		Pet1.주소 = "대전시 유성구";
		Pet1.번호 = "010-0001-0001";
		Pet1.반려동물_이름_종 = "코코(강아지)";
		Pet1.반려동물_나이 = 4;
		Pet1.성별 = true;						//true: 수컷, false: 암컷
		Pet1.중성화_유무 = true;		//true: O,    false: X		
		Pet1.진료 = true;						//true: 초진, false: 재진
		Pet1.증상 = "밥을 먹질않고 계속 누워있어요";
		Pet1.진료일_년 = 23;
		Pet1.진료일_월 = 1;
		Pet1.진료일_일 = 18;
		Medical_Certificate(Pet1);	//매개변수 호출
		
		//2번 Pet2 객체 
		진료접수증 Pet2 = new 진료접수증();
		Pet2.접수번호 = 2;
		Pet2.보호자 = "김철민";
		Pet2.주소 = "대전시 서구";
		Pet2.번호 = "010-0002-0002";
		Pet2.반려동물_이름_종 = "루비(고양이)";
		Pet2.반려동물_나이 = 2;
		Pet2.성별 = false;					//true: 수컷, false: 암컷
		Pet2.중성화_유무 = false;		//true: O,    false: X		
		Pet2.진료 = true;						//true: 초진, false: 재진
		Pet2.증상 = "중성화 수술 시키려고 왔어요";
		Pet2.진료일_년 = 23;
		Pet2.진료일_월 = 1;
		Pet2.진료일_일 = 18;
		Medical_Certificate(Pet2);
		
		//3번 Pet3 객체 
		진료접수증 Pet3 = new 진료접수증();
		Pet3.접수번호 = 3;
		Pet3.보호자 = "김영희";
		Pet3.주소 = "대전시 동구";
		Pet3.번호 = "010-0003-0003";
		Pet3.반려동물_이름_종 = "망고(앵무새)";
		Pet3.반려동물_나이 = 3;
		Pet3.성별 = true;							//true: 수컷, false: 암컷
		Pet3.중성화_유무 = false;			//true: O,    false: X		
		Pet3.진료 = false;						//true: 초진, false: 재진
		Pet3.증상 = "지난번 진료때랑 같은 증상이예요";
		Pet3.진료일_년 = 23;
		Pet3.진료일_월 = 1;
		Pet3.진료일_일 = 18;
		Medical_Certificate(Pet3);
		
		//4번 Pet4 객체 
		진료접수증 Pet4 = new 진료접수증();
		Pet4.접수번호 = 4;
		Pet4.보호자 = "김민희";
		Pet4.주소 = "대전시 중구";
		Pet4.번호 = "010-0004-0004";
		Pet4.반려동물_이름_종 = "냥이(고양이)";
		Pet4.반려동물_나이 = 2;
		Pet4.성별 = true;							//true: 수컷, false: 암컷
		Pet4.중성화_유무 = true;			//true: O,    false: X		
		Pet4.진료 = false;						//true: 초진, false: 재진
		Pet4.증상 = "밥을 잘 안먹고 헛구역질을 계속해요";
		Pet4.진료일_년 = 23;
		Pet4.진료일_월 = 1;
		Pet4.진료일_일 = 18;
		Medical_Certificate(Pet4);
		}
	
		//정적메소드 생성, (진료접수증 Pet) -> 매개변수
		static void Medical_Certificate(진료접수증 Pet) {
		System.out.printf("[---접 수 번 호 %d번---]\n", Pet.접수번호);
		System.out.printf("보 호 자 | %s 님\n", Pet.보호자);
		System.out.printf("주    소 | %s\n", Pet.주소);
		System.out.printf("전화번호 | %s\n", Pet.번호);
		System.out.printf("이름(종) | %s\n", Pet.반려동물_이름_종);	
		System.out.printf("나    이 | %d살\n", Pet.반려동물_나이);
		//성별
		System.out.print("성    별 | ");
		if(Pet.성별 == true) {
			System.out.println("■수컷      □암컷");
		}
		else {
			System.out.println("□수컷      ■암컷");
		}
		//중성화
		System.out.printf("중 성 화 | ");
		if(Pet.중성화_유무 == true) {
			System.out.println("■유	      □무");
		}
		else {
			System.out.println("□유	      ■무");
		}
		//진료
		System.out.print("진    료 | ");
		if(Pet.진료 == true) {
			System.out.println("■초진      □재진");
		}
		else {
			System.out.println("□초진      ■재진");
		}
		System.out.printf("증    상 | %s\n", Pet.증상);
		System.out.printf("---진 료 일 %d년 %d월 %d일---\n", Pet.진료일_년, Pet.진료일_월, Pet.진료일_일);
		System.out.println();
		}
}

//진료접수증을 위한 객체 틀, 진료접수증 클래스 생성
//속성 값 정의
class 진료접수증{
	int 접수번호;								//1. 접수번호								int
	String 보호자;							//2. 보호자									String
	String 주소;								//3. 주소										String	
	String 번호;								//4. 전화번호								String
	String 반려동물_이름_종;		//5. 반려동물_이름_종				String
	int 반려동물_나이;					//6. 반려동물_나이					int
	boolean 성별;								//7. 성별			boolean				boolean
															//true: 수컷, false: 암컷
	boolean 중성화_유무;				//8.중성화 유무							boolean
															//true: 유,    false: 무			
	boolean 진료;								//9. 진료(초진, 재진)				boolean
															//true: 초진, false: 재진
	String 증상;								//10. 증상									String
	int 진료일_년;							//진료일										int
	int 진료일_월;
	int 진료일_일;
}