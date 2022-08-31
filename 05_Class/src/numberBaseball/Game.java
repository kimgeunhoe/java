package numberBaseball;

import java.util.Scanner;

public class Game {
	private Scanner sc = new Scanner(System.in);
	private int strike = 0;
	private int ball = 0;
	private int count = 0;
	private History[] history;
	private int max = 10;
	private int num = 0;
	private String str = "";
	private long startTime;
	private long endTime;
	private boolean flag = true;

	public Game() {
		history = new History[max];
		
		while(flag) {
			run(menu());
		}
	}

	private void run(int menu) {
		switch(menu) {
		case 1:
			playGame();
			break;
		case 2:
			gameHis();
			break;
		default:
			System.out.println("종료");
			flag = false;
			break;
		}
	}

	private void gameHis() {
		for(int i=0; i<num; i++) {
			System.out.println(history[i] + "\n");
		}
	}

	private int menu() {
		System.out.printf("1.게임플레이  2.기록보기(최근 %d게임)  etc.종료 ", max);
		return sc.nextInt();
	}

	private void playGame() {
		choose(makeGame());
	}

	private void choose(int[] com) {
		startTime = System.currentTimeMillis();
		count = 0;
		while(true) {
			strike = 0;
			ball = 0;
			
			System.out.print("숫자 입력: ");
			String my = sc.next();
			if(my.length()==3) {
				String[] stringGuess = my.split("");
				int[] guess = new int[3];
				
				for(int i=0; i<stringGuess.length; i++) {
					guess[i] = Integer.parseInt(stringGuess[i]);
				}
				
				for(int i=0; i<com.length; i++) {
					for(int j=0; j<guess.length; j++) {					
						if(com[i]==guess[j]) {
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
				
				if(strike!=3) {
					print(strike, ball, my);			
				}
				else {
					System.out.print("정답. 시도횟수: " + count + "\n\n");
					str += my + " 정답.";
					endTime = System.currentTimeMillis();
					save(count, str, playTime());
					str = "";
					break;
				}
			}
			else {
				System.out.println("옳지않은 값");
			}
		}
	}

	private String playTime() {
		int m = (int)((endTime - startTime)/1000/60);
		int s = (int)(((endTime - startTime)/1000)%60);
		return m==0 ? s + "초" : m + "분 " + s + "초";
	}

	private void save(int count, String str, String playTime) {
		if(num<max) {
			history[num] = new History(count, str, playTime);
			num++;
		}
		else {
			for(int i=1; i<max; i++) {
				history[i-1] = history[i];
			}
			history[max-1] = new History(count, str, playTime);
		}
	}

	private void print(int strike, int ball, String my) {
		if(strike==0 && ball==0) {
			System.out.println("out");
			str += my+ " out, ";
		}
		else if(ball==0) {
			System.out.println(strike + "S");
			str += my+ " " + strike + "S, ";
		}
		else if(strike==0) {
			System.out.println(ball + "B");
			str += my+ " " + ball + "B, ";
		}
		else {
			System.out.println(strike + "S" + ball + "B");
			str += my+ " " + strike + "S" + ball + "B, ";
		}
	}

	private int[] makeGame() {
		int[] com = new int[3];
		for(int i=0; i<com.length; i++) {
			com[i] = (int)Math.floor(Math.random()*10);
			for(int j=0; j<i; j++) {
				if(com[j]==com[i]) {
					i--;
					break;
				}
			}
		}
		System.out.printf("%d%d%d\n",com[0], com[1], com[2]);
		return com;
	}
}