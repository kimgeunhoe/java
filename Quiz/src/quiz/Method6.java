package quiz;

import java.util.Scanner;

public class Method6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] nums = makeNum();
		switch (op(sc)) {
		case 1:
			sum1(nums);
			break;
		case 2:
			sub1(nums);
			break;
		case 3:
			mul1(nums);
			break;
		case 4:
			div1(nums);
			break;
		case 5:
			mod1(nums);
			break;
		default:
			break;
		}
	}

	private static void mod1(int[] nums) {
		System.out.println(nums[0] + " % " + nums[1] + " = " + (double)nums[0]%nums[1]);
	}

	private static void div1(int[] nums) {
		System.out.printf("%d / %d = %d \n", nums[0], nums[1], (double)nums[0]/nums[1]);
	}

	private static void mul1(int[] nums) {
		System.out.printf("%d * %d = %d \n", nums[0], nums[1], nums[0]*nums[1]);
	}

	private static void sub1(int[] nums) {
		System.out.printf("%d - %d = %d \n", nums[0], nums[1], nums[0]-nums[1]);
	}

	private static void sum1(int[] nums) {
		System.out.printf("%d + %d = %d \n", nums[0], nums[1], nums[0]+nums[1]);
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
