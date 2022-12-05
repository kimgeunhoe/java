package quiz;

class Pet {
	int age = 1;
	String name = "ㅁㅁ";
	String breeds = "breeds";
	
	void sound() {
		
	}
	
	int getOlder() {
		age++;
		return age;
	}
}

public class Class1 {

	public static void main(String[] args) {
		Pet myPet = new Pet();
		System.out.printf("나이: %d살, 이름: %s, breeds: %s \n", myPet.age, myPet.name, myPet.breeds);
		myPet.getOlder();
		System.out.printf("나이: %d살, 이름: %s, breeds: %s \n\n", myPet.age, myPet.name, myPet.breeds);
	}

}
