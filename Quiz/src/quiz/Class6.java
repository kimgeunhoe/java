package quiz;

class Ex06 {
	final double PI = 3.141593;
	
	public double area(int a) {
		return a*a*PI;
	}
	
	public double area(int a, int b) {
		return a*b;
	}
	
	public double area(int a, int b, int c) {
		return (double)(a+b)*c/2;
	}
	
}
public class Class6 {

	public static void main(String[] args) {
		Ex06 ex = new Ex06();
		System.out.println("원의 넓이: " + ex.area(3));
		System.out.println("사각형의 넓이: " + ex.area(4, 5));
		System.out.println("사다리꼴의 넓이: " + ex.area(3, 4, 7));
	}

}
