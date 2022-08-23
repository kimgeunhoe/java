package creation;

import java.util.Scanner;
//클래스를 벗어난 코드는 있을 수 없다
public class Quiz3 {

	public static void main(String[] args) {
		//숫자 야구 게임
		Scanner sc = new Scanner(System.in);
		int[] comArr = makeComNum();
		int count = 0;
		boolean flag = true;
		
		while(flag) {
			int[] result = compare(comArr, inputGuess(comArr, sc));
			count++;
			flag = check(result[0], result[1], count);
		}	
	}

	private static boolean check(int strike, int ball, int count) {
		if(strike==3) {
			System.out.print("정답. 시도횟수: " + count);
			return false;
		}
		else if(strike==0 && ball==0) {
			System.out.println("out");
		}
		else if(ball==0) {
			System.out.println(strike + "S");
		}
		else if(strike==0) {
			System.out.println(ball + "B");
		}
		else {
			System.out.println(strike + "S" + ball + "B");
		}
		return true;
	}
	
	private static int[] compare(int[] arr, int[] guess) {
		int strike = 0;
		int ball = 0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<guess.length; j++) {					
				if(arr[i]==guess[j]) {
					if(i==j) {
						strike++;
					}
					else {
						ball++;
					}
				}
			}
		}
		
		int[] res = {strike, ball};
		
		return res;
	}
	
	private static int[] inputGuess(int[] arr, Scanner sc) {
		System.out.print("숫자 입력: ");
		String[] stringGuess = sc.next().split("");
		int[] guess = new int[3];
		
		for(int i=0; i<stringGuess.length; i++) {
			guess[i] = Integer.parseInt(stringGuess[i]);
		}
		
		return guess;
	}

	private static int[] makeComNum() {
		int[] arr = new int[3];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)Math.floor(Math.random()*10);
			for(int j=0; j<i; j++) {
				if(arr[j]==arr[i]) {
					i--;
					break;
				}
			}
		}
		
		return arr;
	}
	
}