class Main{
  public static void main(String[] args){
    //a변수 선언
    System.out.println("int a = 5;");
    System.out.println("정수만 사용가능한 a라는 변수(공간)에 5라는 값(데이터)를 넣는다.");
    System.out.println(";은 마침을 뜻함");
    
    int a = 5;
    System.out.print("출력 값: ");
    //출력
    System.out.println(a);

    //정수 int
    //부동소수점수 float
    //문자 char
    //t,f boolean
    


    //사칙연산
    System.out.println("\n사칙연산");
    int b = 5;
    System.out.println("a: 5  b: 5");

    //더하기
    System.out.println("1. 더하기");
    System.out.print("a + b : ");
    System.out.println(a+b);

    //빼기
    System.out.println("2. 빼기");
    System.out.print("a - b : ");
    System.out.println(a-b);

    //곱하기
    System.out.println("3. 곱하기");
    System.out.print("a * b : ");
    System.out.println(a*b);
    
    //나누기
    System.out.println("4. 나누기");
    System.out.print("a / b : ");
    System.out.println(a/b);

    System.out.println("\n\n\n");

    //연산자
    System.out.println("연산자");
    System.out.println("if, else if, boolean\n");

    /*
    논리연산
    == : 같다    != : 다르다    > : 크다(초과)    < : 작다(미만)    >= : 크거나 같다(이상)    <= : 작거나 같다(이하)    && : 그리고(and)    || : 또는(or)    */ 
    System.out.println("if(a*b == 25)");
    if(a*b == 25){
      System.out.println("맞습니다.");
    }
  }
}