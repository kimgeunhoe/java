package basic;

public class Student extends Person {
	private String[] subjects;
	
	public Student() {
		System.out.println("This is Student Instance");
//		super(); 인스턴스 생성 순서 위반 => Error, this()도 마찬가지
	}
	
	public void printSubjects() {
//		System.out.println(name + "학생의 수강과목 리스트"); 상속의 변수가 protected면 사용가능
		System.out.println(super.getName() + "학생의 수강과목 리스트");
		
		for (String sub : subjects) {
			System.out.println("수강과목: " + sub);
		}
	}

	public String[] getSubjects() {
		return subjects;
	}

	public void setSubjects(String[] subjects) {
		this.subjects = subjects;
	}
	
}
