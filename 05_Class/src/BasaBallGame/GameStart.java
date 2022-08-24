package BasaBallGame;

import java.util.Scanner;

public class GameStart {
	Scanner sc = new Scanner(System.in);
	private Record[] records = new Record[5];
	private int[] comNum = new int[3];
	private int[] answer = new int[3];
	private int count, strike, ball;
	long startTime, endTime;
	public void start() {
		makeComNum();
		inputMyNum();
	}

	private void inputMyNum() {
		count = 0;
		long startTime = System.currentTimeMillis();
		boolean flag1 = true;
		while(flag1) {
			System.out.println("정답을 입력해주세요");
			String myNum = sc.next();
			flag1 = testAnswer(myNum);
		}
	}


	private boolean testAnswer(String myNum) {
		if(myNum.length() < 3 || myNum.length() > 3) {
			System.out.println("숫자를 3자리로 다시 입력해주세요");
			return true;
		} else {
			answer = input(myNum);
			for(int i = 0; i < answer.length; i++) {
				for(int j = 0; j < answer.length; j++) {
					if(i != j && answer[i] == answer[j]) {
						System.out.println("중복없이 입력해주세요");
						return true;
					}
				}
			}
			count++;
			return checkAnswer(answer);
		}
	}


	private boolean checkAnswer(int[] answer) {
		strike = 0;
		ball = 0;
		for(int i = 0;i < comNum.length; i++) {
			for(int j = 0; j < answer.length; j++) {
				if(comNum[i] == answer[j] && i == j) {
					strike++;
				} else if(comNum[i] == answer[j] && i != j) {
					ball++;
				} 
			}
		}
		return printResult(strike, ball);
	}

	private boolean printResult(int strike, int ball) {
		if(strike == 3) {
			System.out.println("정답입니다. 도전 횟수: " + count);
			record();
			return false;
		} else if(strike != 0 || ball != 0) {
			System.out.println(strike + "S " + ball  + "B");
			return true;
		} else {
			System.out.println("Out");
			return true;
		}
	}

	private void record() {
		System.out.println("이름을 입력해주세요");
		User user = new User(sc.next(), count, time(startTime));
		for(int i = 0; i < records.length; i++) {
			if(records[i] == null) {
				records[i] = new Record(); //객체 선언
				records[i].setUsers(user);
				break;
			} else if(records[records.length-1].getUsers() != null) {
				for(int j = 0; j < records.length-1; j++) {
					records[j] = records[j+1];
				}
				records[i].setUsers(user);
			}
		}
		printRecord();
	}

	private void printRecord() {
		for(int i = 0; i < records.length; i++) {
			if(records[i]!=null) { //조건 추가했음. 없으면 출력 안되게
				System.out.println(records[i].getUsers()); //출력문 써야 나오지
			}
		}
	}

	private String time(long startTime2) {
		endTime = System.currentTimeMillis();
		String gamingTime = (endTime - startTime2)/1000 + "초";
		return gamingTime;
	}



	private int[] input(String myNum) {
		String[] myNumStrArr = myNum.split("");
		int[] myNumArr = new int[3];
		for(int i = 0; i < myNumArr.length; i++) {
			myNumArr[i] = Integer.parseInt(myNumStrArr[i]);
		}
		return myNumArr;
	}

	//문제생성
	private void makeComNum() {
		for(int i = 0; i < comNum.length; i++) {
			comNum[i] = (int)(Math.floor(Math.random()*10));
			if(i != 0) {
				for(int j = 0; j < i; j++) {
					if(comNum[j] == comNum[i]) {
						i--;
					}
				}
			}
		} 
//		문제 확인
		for(int i = 0; i < 3; i++) {
			System.out.print(comNum[i] + "\t");
		}
	}
	
}
