package loops;
import java.util.Scanner;

public class ForEx {

	public static void main(String[] args) {
		//원하는 단을 입력하여 그 단의 구구단을 출력해보세요. for문 이용하기
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 단을 입력: ");
		int dan = sc.nextInt();
		
		for(int i=1; i < 10; i++) {
			System.out.printf("%d x %d = %d \n", dan, i, dan*i);
			//System.out.println(dan + " x " + i + " = " + (dan*i));
		}
	}
}
