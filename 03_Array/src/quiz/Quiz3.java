package quiz;
import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		//숫자 야구 게임
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
		
		Scanner sc = new Scanner(System.in);
		int strike = 0;
		int ball = 0;
		int count = 0;
		
		while(true) {
			System.out.print("숫자 입력: ");
			String[] stringGuess = sc.next().split("");
			int[] guess = new int[3];
			
			for(int i=0; i<stringGuess.length; i++) {
				guess[i] = Integer.parseInt(stringGuess[i]);
			}
			
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
			count++;
			
			if(strike==3) {
				System.out.print("정답. 시도횟수: " + count);
				break;
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
			
			strike = 0;
			ball = 0;
		}
		
	}

}