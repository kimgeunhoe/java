package basic;

public class RelationMain {

	public static void main(String[] args) {
		Person p = new Person();
		Student std = new Student();
		std.setTelNum(12345678);
		std.setName("Park");
		std.setDept("IT");
		std.setAddr("Seoul");
		std.setSubjects(new String[] {"HTML", "CSS", "JS", "JAVA"});
		std.printInfo();
		std.printSubjects();
		System.out.println();
		
		Professor pf = new Professor();
		pf.setTelNum(12345678);
		pf.setName("이교수");

		Staff staff = new Staff();
		staff.setTelNum(0);
		staff.setName("김스텝");
		
		Person newbee = new Student();
		
	}

}
