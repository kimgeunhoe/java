package conditions;
import java.util.Scanner;

public class RSPGame {

	public static void main(String[] args) {
		//컴퓨터가 랜덤으로 가위바위보 선택
		//나도 가위바위보를 입력
		//승무패 결과 출력
		int com = (int)Math.floor(Math.random()*3);
		char comrsp = com == 0 ? 'r' : com == 1 ? 's' : 'p';
		
//		switch(com) {
//			case 0:
//				comrsp = 'r';
//				break;
//			case 1:
//				comrsp = 's';
//				break;
//			case 2:
//				comrsp = 'p';
//				break;
//			default:
//				break;
//		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("가위바위보: ");
	
		char myrsp = sc.next().charAt(0);
		System.out.printf("컴퓨터: %c", comrsp);
		System.out.println("");
		
		if(comrsp==myrsp) {
			System.out.println("무");
		}
		else {
			if(myrsp=='r') {
				System.out.println(comrsp == 's' ? '승' : '패');
			}
			else if(myrsp=='s') {
				System.out.println(comrsp == 'p' ? '승' : '패');
			}
			else if(myrsp=='p') {
				System.out.println(comrsp == 'r' ? '승' : '패');
			}
		}
	}
}