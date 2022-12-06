package quiz;

class Ex3 {
	double base = 5.0;
	double height = 3.5;
	
	
	double getArea() {
		return base*height/2;
	}
	double getHypotenuse() {
		return Math.sqrt(base*base+height*height);
	}
	double getPerimeter() {
		return base+height+getHypotenuse();
	}
}

public class Class3 {

	public static void main(String[] args) {
		Ex3 ex = new Ex3();
		System.out.printf("삼각형의 넓이: %.2f \n빗변길이: %.2f \n둘레길이: %.2f \n\n", ex.getArea(), ex.getHypotenuse(), ex.getPerimeter());
	}

}
