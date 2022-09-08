package practice;

import java.util.Scanner;

public class PlayGame {
	Scanner sc = new Scanner(System.in);
	private Character character; //캐릭터 추상
	private boolean flag; //종료 조건

	public void setCharacter(Character character) {
		this.character = character;
		flag = true;
		System.out.println(character.characterName() + "로 플레이");
		while(flag) {			
			printMenu();
		}
	}
	
	public void printMenu() { //캐릭터 플레이 메뉴
		System.out.println(character.characterName() + "'s Stat");
		character.printStatus(); //캐릭터 상태 출력 in 캐릭터 추상 클래스
		System.out.print("1.EAT 2.SLEEP 3.PLAY 4.TRAIN etc.EXIT ");
		playCharcter(); //캐릭터 플레이 메서드
	}

	private void playCharcter() { //캐릭터 추상 클래스에서 확인바람
		switch(sc.nextInt()) {
		case 1:
			character.eat();
			break;
		case 2:
			character.sleep();
			break;
		case 3:
			character.play();
			break;
		case 4:
			character.train();
			break;
		default:
			flag = false;
			break;
		}
	}
}
