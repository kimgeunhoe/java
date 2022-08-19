package quiz;
import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		//Q2. 음수나 0을 입력할 때까지 숫자를 계속 입력받고 음수나 0이 입력되면 지금까지 입력된 수의 총합과 평균을 구하세요
		Scanner sc = new Scanner(System.in);
		int count = -1;
		int sum = 0;
		int num = 0;

		do {
			sum += num;
			count++;
			System.out.print("숫자: ");
			num = sc.nextInt();
		}while(num > 0);
		
//		boolean flag = true;
//		int count = 0;
//		while(flag) {
//			num = sc.nextInt();
//			if(num <= 0) {
//				flag = false; // break;
//			} else {
//				sum += num;
//				count++;
//			}
//		}
		
		System.out.printf("합: %d, 평균: %f", sum, (float)sum/count);
	}
	
}