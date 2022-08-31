package hotel_t;

public class User {
	private String name;
	private int age;
	private char gen;
	
	public User() {
		
	}
	
	public User(String name, int age, char gen) {
		super();
		this.name = name;
		this.age = age;
		this.gen = gen;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGen() {
		return gen;
	}

	public void setGen(char gen) {
		this.gen = gen;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", gen=" + gen + "]";
	}

//	void setUserInfo(String name, int age, char gen) {
//		this.name = name;
//		this.age = age;
//		this.gen = gen;
//	}
//	
//	void getUserInfo() {
//		if(name==null) {
//			System.out.println("투숙객이 없습니다.");
//		} 
//		else {
//			System.out.printf("투숙객 정보\n이름: %s, 나이: %d, 성별: %c \n", name, age, gen);
//		}
//	}
//
//	void delUserInfo() {
//		name = null;
//		age = 0;
//		gen = ' ';
//	}
}