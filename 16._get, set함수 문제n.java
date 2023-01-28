//get, set함수

class Main {
  public static void main(String[] args) {
  	Warrior warriors = new Warrior();

  	//전사1
  	warriors.setName("칸");
  	warriors.setAge(20);
  	warriors.setRank(1);
  	warriors.Weapons = new 활();
    warriors.introduce();
    
    System.out.println("b. 랭크랑 주 무기가 뭐라구요?");
    System.out.printf("a. 제 랭크는 %d 입니다.\n", warriors.getRank());
    System.out.printf("a. 제 무기는 %s 입니다.\n", warriors.Weapons.getWeapon());
    warriors.attack();
    
    System.out.println();
    
    //전사2
    warriors.setName("카니");
    warriors.setAge(30);
    warriors.setRank(3);
    warriors.Weapons = new 칼();
    warriors.introduce();
    System.out.println("b. 이름하고 나이가 뭐라구요?");
    System.out.printf("a. 제 이름은 %s 입니다.\n", warriors.getName());
    System.out.printf("a. 제 나이는 %d 입니다.\n", warriors.getAge());
    warriors.attack();
    
  }
}

class Warrior {
	
  private String name;
  private int age;
  private int rank;
  Weapon Weapons;
  
  //Name
  void setName(String n) {
  	this.name = n;
  }
  String getName() {
  	return this.name;
  }
  
  //age
  void setAge(int a) {
  	this.age = a;
  }
  int getAge() {
  	return this.age;
  }
  
  //rank
  void setRank(int r) {
  	this.rank = r;
  }
  int getRank() {
  	return this.rank;
  }
  
  //introduce
  void introduce() {
    System.out.printf("a. 안녕하세요. 저는 %d살 랭크 %d단 %s 입니다. 제 주무기는 %s 입니다.\n"
    		, this.age, this.rank, this.name, this.Weapons.getWeapon());
  }
  
  void attack() {
  	System.out.printf("v. %s이(가) %s로 공격합니다.", this.name, this.Weapons.getWeapon());
  }
}

class Weapon {
  String weapons;
  
  //getweapon
  String getWeapon() {
  	return this.weapons;
  }
}

class 칼 extends Weapon {
  칼(){
  	this.weapons = "칼";
  }
}

class 활 extends Weapon {
  활(){
  	this.weapons = "활";
  }
}
