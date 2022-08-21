package quiz;
import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		//24절기 맞추는 게임
		String[] seasonal = {"입춘", "우수", "경칩", "춘분", "청명", "곡우", "입하", "소만", "망종", "하지", "소서", "대서", "입춘", "처서", "백로", "추분", "한로", 
				"상강", "입동", "소설", "대설", "동지", "소한", "대한"};
		//?번째 절기
		//정답
		//시도횟수
		int num = (int)Math.floor(Math.random()*24);
		int count = 0;
		System.out.printf("%d번째 절기는?", num+1);
		Scanner sc = new Scanner(System.in);
		
		while(true) {			
			String guess = sc.next();
			System.out.println(guess);
			count++;
			
			if(guess.equals(seasonal[num])) {
				System.out.print("정답 ");
				break;
			}
			
			System.out.println("오답");
		}
		System.out.println("시도횟수: " + count);
		
//		int count1 = 0, order = 0;
//		String ans = "";
//		do {
//			order = (int)(Math.random()*24);
//			count1++;
//			ans = sc.next();
//			if(seasonal[order].equals(ans)) {
//				System.out.println(count1);
//			}
//		}while(!seasonal[order].equals(ans)); //틀릴 경우 다른 문제 출제
	}

}