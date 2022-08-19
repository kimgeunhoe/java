package quiz;
import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		//Q1. 3자리 이상의 정수 L, 2자리 이하의 정수 a, b를 입력받아 L까지의 a, b의 배수 개수를 구하세요
		Scanner sc = new Scanner(System.in);
		System.out.print("L: ");
		int L = sc.nextInt();
		System.out.print("a: ");
		int a = sc.nextInt();
		System.out.print("b: ");
		int b = sc.nextInt();
		int count = 0;
		
		for(int i =1; i < L; i++) {
			if(i%a==0 && i%b==0) {
				count++;
			}
		}
		
		System.out.println(L/a);
		System.out.println(L/b);
		System.out.println(count);
	}
}
