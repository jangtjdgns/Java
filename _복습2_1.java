class Main {
  public static void main(String[] args) {
    //조건(삼항)연산자 사용해보기
    int a = 10;
    int b = 20;
    int c;
    
    boolean f = a > b;        //a>b는 f임
    c = f ? a : b;            //f이므로 b를 반환
    System.out.println(f);    //false
    System.out.println(c);    //20
    
    boolean t = a < b;        //a<b는 t임
    c = t ? a : b;            //t는 t이므로 a를 반환
    
    System.out.println(t);    //true
    System.out.println(c);    //10
  }
}
