//변수 문제
// 문제 : a와 b가 가지고 있는 값을 서로 뒤바꿔주세요.

class Main {
  public static void main(String[] args) {
    // `int a` => a라는 이름의 변수(즉 공간)을 만든다.
    // `int` => a라는 공간에는 정수만 담을 수 있다.
    // `;` => 문장이 끝남을 알린다.
    int a;
    a = 5;
    
    System.out.println(a);
    System.out.println(a + 10);
    
    int b = 10;
    
    // `+` => 문장과 문자을 합친다.
    System.out.println("a : " + a);
    System.out.println("b : " + b);
    
    // 여기서 부터
    a = 10;
    b = 5;   
    // 여기까지 수정 가능
    
    System.out.println("a : " + a);
    // 출력 : a : 10
    System.out.println("b : " + b);
    // 출력 :  b : 5
  }
}



// 문제 : a와 b가 가지고 있는 값을 서로 뒤바꿔주세요.
// 조건 : 숫자와 사칙연산 사용 금지

class Main {
  public static void main(String[] args) {
    // `int a` => a라는 이름의 변수(즉 공간)을 만든다.
    // `int` => a라는 공간에는 정수만 담을 수 있다.
    // `;` => 문장이 끝남을 알린다.
    int a;
    a = 5;
    
    System.out.println(a);
    System.out.println(a + 10);
    
    int b = 10;
    
    // `+` => 문장과 문자을 합친다.
    System.out.println("a : " + a);
    System.out.println("b : " + b);
    
    // 여기서 부터 
    int c;
    c = a;
    a = b;
    b = c;
    
    // 여기까지 수정 가능
    
    System.out.println("a : " + a);
    // 출력 : a : 10
    System.out.println("b : " + b);
    // 출력 :  b : 5
  }
}
