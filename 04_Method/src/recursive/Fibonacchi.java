package recursive;

import java.util.Scanner;

public class Fibonacchi {

	public static void main(String[] args) {
		//피보나치 수열
		//앞의 두개의 수의 합으로 다음 값을 만들어내는 수열
		//첫번째와 두번째 숫자는 1이 된다
		//1, 1, 2, 3, 5, 8...
		
		//피보나치 수열의 n번째 자리수의 숫자를 출력해보기
		Scanner sc = new Scanner(System.in);
		System.out.print("n: ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.print(fibo(i) + " ");
		}
	}

	private static int fibo(int i) {
		if(i==0 || i==1) {
			return 1;
		} 
		else {
			return fibo(i-2) + fibo(i-1);
		}
	}

}
