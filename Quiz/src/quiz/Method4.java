package quiz;

public class Method4 {

	public static void main(String[] args) {
		sum();
		sub();
		mul();
		div();
		mod();
	}

	private static void mod() {
		int num1 = (int)(Math.random()*10);
		int num2 = (int)(Math.random()*10+1);
		System.out.println(num1 + " % " + num2 + " = " + (double)num1%num2);
	}
	private static void div() {
		int num1 = (int)(Math.random()*10);
		int num2 = (int)(Math.random()*10+1);
		System.out.printf("%d / %d = %f \n", num1, num2, (double)num1/num2);
	}
	private static void mul() {
		int num1 = (int)(Math.random()*10);
		int num2 = (int)(Math.random()*10);
		System.out.printf("%d x %d = %d \n", num1, num2, num1*num2);
	}
	private static void sub() {
		int num1 = (int)(Math.random()*10);
		int num2 = (int)(Math.random()*10);
		System.out.printf("%d - %d = %d \n", num1, num2, num1-num2);
	}
	private static void sum() {
		int num1 = (int)(Math.random()*10);
		int num2 = (int)(Math.random()*10);
		System.out.printf("%d + %d = %d \n", num1, num2, num1+num2);
	}
}
