package hotel;

public class User {
	private String name;
	private int age;
	private char gen;
	
	void setUserInfo(String name, int age, char gen) {
		this.name = name;
		this.age = age;
		this.gen = gen;
	}
	
	void getUserInfo() {
		if(name==null) {
			System.out.println("투숙객이 없습니다.");
		} 
		else {
			System.out.printf("투숙객 정보\n이름: %s, 나이: %d, 성별: %c \n", name, age, gen);
		}
	}

	void delUserInfo() {
		name = null;
		age = 0;
		gen = ' ';
	}
}