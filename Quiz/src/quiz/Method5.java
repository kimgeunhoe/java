package quiz;

import java.util.Scanner;

public class Method5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] nums = makeNum();
		switch (op(sc)) {
		case 1:
			sum1(nums[0], nums[1]);
			break;
		case 2:
			sub1(nums[0], nums[1]);
			break;
		case 3:
			mul1(nums[0], nums[1]);
			break;
		case 4:
			div1(nums[0], nums[1]);
			break;
		case 5:
			mod1(nums[0], nums[1]);
			break;
		default:
			break;
		}

	}

	private static void mod1(int a, int b) {
		System.out.println(a + " % " + b + " = " + (double)a%b);
	}

	private static void div1(int a, int b) {
		System.out.printf("%d / %d = %d \n", a, b, (double)a/b);
	}

	private static void mul1(int a, int b) {
		System.out.printf("%d * %d = %d \n", a, b, a*b);
	}

	private static void sub1(int a, int b) {
		System.out.printf("%d - %d = %d \n", a, b, a-b);
	}

	private static void sum1(int a, int b) {
		System.out.printf("%d + %d = %d \n", a, b, a+b);
	}

	private static int op(Scanner sc) {
		System.out.print("연산자: ");
		char op = sc.next().charAt(0);
		return op == '+' ? 1 : op == '-' ? 2 : op == 'x' ? 3 : op == '/' ? 4 : op == '%' ? 5 : 0;
	}

	private static int[] makeNum() {
		int[] nums = {(int)(Math.random()*10), (int)(Math.random()*10+1)};
		return nums;
	}
}
