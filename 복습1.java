// 문제 : 할인 대상인지 아닌지 출력해주세요.
// 조건 : 나이가 19세 이하이거나 60세 이상이면 할인 대상입니다.
// 조건 : 출력예시 처럼 출력되어야 합니다.
// 조건 : `구현시작` 부분만 수정 할 수 있습니다.
// 조건 : 4가지 이상의 방법으로 풀어야 합니다.
// 조건 : 그 중 2가지 방법은 `&&, ||`없이 풀어야 합니다.

class Main {
  public static void main(String[] args) {
    int age = 30; // 이 값을 바꿔가면서 실행해보세요.

    System.out.println("당신의 나이는 " + age + "살 입니다.\n");

    // 구현시작
    // 출력 => 할인대상입니다. 또는 할인 대상이 아닙니다.

    
    //1. if만 사용
    //if만 사용했을때 19이하로 내려가면 19이하와 60미만 둘다 충족하기 때문에 두개가 출력됨.
    //*그러므로 if만 사용 불가
    System.out.println("1. if만 사용");

    if(age <= 19){    //19세 이하
      System.out.println("할인 대상 입니다.");
    }
    if(age < 60){     //60세 미만  *19세 이하일때 60세 미만도 포함되므로 같이 출력됨
      System.out.println("할인 대상이 아닙니다.");
    }
    if(age >= 60){    //60세 이상
      System.out.println("할인 대상 입니다.");
    }

    
    //2. if, else if 사용
    //if 다음에 else if를 같이 사용하면 하나의 조건문으로 봄
    //*문제는 없지만 불필요한 조건문이 되어있음
    System.out.println("\n2. if, else if 사용");
    if(age <= 19){        //19세 이하
      System.out.println("할인 대상 입니다.");
    }
    else if(age >= 60){   //60세 이상
      System.out.println("할인 대상 입니다.");
    }
    else if(age > 19){    //19세 초과  *컴퓨터가 인식하기에 19세 이하
                          //60세 이상이 아니기 때문에 작동
                          //작동은 하지만 사실상 19~60사이의 범위가 정해진 것은 아님
      System.out.println("할인 대상이 아닙니다.");
    }
    else if(age < 60){    //60세 미만  *오류는 없지만 (age > 19)가 있는한 작동 할 일이 없음
      System.out.println("할인 대상이 아닙니다.");
    }

    
    //3. if, else if, else 사용
    //if와 else if가 f일때 사용됨
    System.out.println("\n3. if, else if, else 사용");
    
    if(age <= 19){          //19세 이하
      System.out.println("할인 대상 입니다.");
    }
    else if(age >= 60){      //60세 이상
      System.out.println("할인 대상 입니다.");
    }
    else{                   //19세 초과, 60세 미만 일때 출력
      System.out.println("할인 대상이 아닙니다.");
    }

    
    //4. && 사용
    //논리연산자 &&는 and를 의미함
    //a && b    -> a, b 둘 다 t일때만 작동      a, b 둘 중 하나만 t일시 f임
    System.out.println("\n4. && 사용");

    if(age > 19 && age < 60){    //19세 초과 and 60세 미만
      System.out.println("할인 대상이 아닙니다.");
    }
    else{                         //19세 초과 and 60세 미만이 아닐 때 출력
      System.out.println("할인 대상 입니다.");
    }

    
    //5. ||사용
    //논리연산자 ||은 or을 의미함
    //a || b    -> a, b 중 하나만 t여도 작동    a, b 둘 다 f일때는 f임
    System.out.println("\n5. || 사용");

    if(age <= 19 || age >= 60){    //19세 이하 or 60세 이상
      System.out.println("할인 대상 입니다.");
    }
    else{                          //19세 이하 or 60세 이상이 아닐 때 출력
      System.out.println("할인 대상이 아닙니다.");
    }


    //6. boolean 사용
    //boolean은 true/false의 값만 사용됨        true: 1  false: 2

    System.out.println("\n6. boolean 사용");
    boolean a = age > 19 && age < 60;    //19세 초과, 60세 미만일때 t
    
    System.out.println("a: " + a);
    if(a){   //t
      System.out.println("할인 대상이 아닙니다.");
    }
    else{    //f
      System.out.println("할인 대상 입니다.");
    }

    
    //7. boolean 응용1
    //!a  *!는 반대의 의미(!true == false)
    System.out.println("\n7. boolean 응용1");
    System.out.println("!a: " + !a);
    
    if(!a){  //t
      System.out.println("할인 대상 입니다.");
    }
    else{    //f
      System.out.println("할인 대상이 아닙니다.");
    }

    
    //8. boolean 응용 2
    System.out.println("\n8. boolean 응용2");
    
    boolean b = age > 19;     //19세 초과 시 t
    boolean c = age < 60;     //60세 미만 시 t
    boolean d = b && c;       //b, c가 t일때 d는 t, 둘 중 하나만 t일때 d는 f

    System.out.println("b: " + b + "    c: " + c + "\nd: " + d);
    System.out.println("!d: " + !d);
      
    if(!d){                   //20~50사이 일때 t -> !이므로 20~50사이가 아닐때 t
      System.out.println("할인 대상 입니다.");
    }
    else{
      System.out.println("할인 대상이 아닙니다.");
    }
  }
}
