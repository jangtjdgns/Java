//// 문제 : 매개변수를 사용해서 전사가 매번 다르게 공격하도록 해주세요.
//
//class Exam10 {
//  public static void main(String[] args) {
//    전사 a전사 = new 전사();
//    		
//    a전사.공격(/* 수정가능지역 시작 */a전사.이름 = "브라이언", a전사.무기 = "칼" /* 수정가능지역 끝 */); 
//    //V2 : a전사.공격("브라이언", "칼"); 
//    // 브라이언이(가) 칼(으)로 공격합니다.
//
//    a전사.재공격();
//    // 브라이언이(가) 칼(으)로 공격합니다.
//
//    a전사.공격(/* 수정가능지역 시작 */a전사.이름 = "필립", a전사.무기 = "창" /* 수정가능지역 끝 */); 
//    // 필립이(가) 창(으)로 공격합니다.
//    //V2 : a전사.공격("필립", "창"); 
//    
//    a전사.공격(/* 수정가능지역 시작 */a전사.이름 = "마크",  a전사.무기 = "지팡이" /* 수정가능지역 끝 */); 
//    // 마크(가) 지팡이(으)로 공격합니다.
//    //V2 : a전사.공격("마크", 지팡이칼"); 
//    a전사.재공격();
//    // 마크(가) 지팡이(으)로 공격합니다.
//
//    a전사.재공격();
//    // 마크(가) 지팡이(으)로 공격합니다.
//  }
//}
//
//class 전사 {
//	String 이름;
//	String 무기;
//	
//	void 공격(String a, String b) {
//		System.out.printf("%s이(가) %s(으)로 공격합니다.\n", a, b);
//		
//		//V2 : 방법이 더 효율적
//		//this.이름 = a;
//		//this.무기 = b;
//	}
//	
//	void 재공격() {
//		System.out.printf("%s이(가) %s(으)로 공격합니다.\n", this.이름, this.무기);
//	}
//}