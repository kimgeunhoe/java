package printEx;
import java.util.Scanner;

public class InputData {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String data = sc.next();
		System.out.print("숫자: ");
		int num = sc.nextInt();
		System.out.println("연산결과: " + 100 + num); 
		System.out.println("연산결과: " + (100 + num)); //연산은 괄호가 중요
	}

}
