package quiz;

class Student {
	String name;
	String ban;
	int num;
	double korean;
	double english;
	double math;
	
	double getTotal() {
		return korean+english+math;
	}
	
	double getAvg() {
		return getTotal()/3;
		
	}
}

public class Class4 {

	public static void main(String[] args) {
		Student me = new Student();
		me.korean = 80;
		me.english = 80;
		me.math = 80;
		System.out.println(me.getAvg());
	}

}
