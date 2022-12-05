package quiz;

class Star {
	String str = "";
	
	void print(int a) {
		for(int j=0; j<a; j++) {
			str += "*";
			System.out.println(str);
		}
	}
}

public class Class2 {

	public static void main(String[] args) {
		Star star = new Star();
		star.print(4);
	}
	
}
