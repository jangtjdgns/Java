//static과 non-static

public class static_non_static {
  int globalScope = 10;          // 인스턴스 변수		전역
  static int staticVal = 7;      // 클래스 변수

  
  public void scopeTest(int value) {
      int localScope = 20;        //지역변수
      System.out.println(localScope);
  }
  
	public static void main(String[] args) {
		System.out.println(staticVal);	// 클래스 변수는 인스턴스화 하지 않고도 사용가능
		
		//인스턴스화 과정, 인스턴스화 = 객체화
		static_non_static scope = new static_non_static();	//객체화 하면 출력가능
		System.out.println(scope.globalScope);
		
	}
}
