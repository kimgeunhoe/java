package object;

class Pet {
	String nick; //class의 정적인 정보(상태값: 변수에 저장)
	int age;

	//상태값을 변경시킬 수 있는 동적 존재: 메서드를 활용
	void sound(String nick) {
		System.out.println(nick + "은 소리를 낸다");
	}
	void initialize(String nickName, int petAge) {
		nick = nickName;
		age = petAge;
	}
	
	void getInfo() {
		System.out.println(nick);
		System.out.println(age);
		
	}
	
	int getOld() {
		age++;
		return age;
	}
	boolean die() {
		nick = "";
		age = 0;
		return false;
	}
}

public class Person { //Person 이라는 개념을 만들기위한 분류
	String name;
	int age;
	
	void speak() {
		System.out.println("사람은 말을 한다");
	}
	
	public static void main(String[] args) {
		//인스턴스 만들기
		Pet myPet = new Pet(); //메모리의 heep영역애 주소값을 생성하여 접근(이용) 가능함
		myPet.sound("냐옹이"); //Pet이라는 객체에 냐옹이를 설정하여 동작하게됨
		myPet.nick = "멍뭉이"; //Pet이라는 객체에 멍뭉이를 초기화
		myPet.age = 13;
		
		Pet yourPet = new Pet();
//		yourPet.nick = "냥";
//		yourPet.age = 1;
		yourPet.initialize("냥", 1);
//		System.out.println(yourPet.nick);
//		System.out.println(yourPet.age);
		yourPet.getInfo(); //냥이 1살
		int age = yourPet.getOld(); //냥이 한살 늙음
		//yourPet.getInfo(); //냥이 2살
		System.out.println("현재 냥이는 " + age + "살");
		yourPet.die();
		yourPet.getInfo();
	}

}
