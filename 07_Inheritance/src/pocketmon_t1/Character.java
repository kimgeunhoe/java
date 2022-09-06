package pocketmon_t1;

public abstract class Character {
	protected int hp; //체력
	protected int mp; //마나
	protected int level; //레벨
	
	//플레이를 위한 추상 클래스
	public abstract void eat();
	public abstract void sleep();
	public abstract void play();
	public abstract boolean train();
	public abstract void levelUp();

	//마나 사용 조건 체크
	public boolean checkMp() {
		return mp <= 0 ? true : false;
	}
	
	//캐릭터 상태 출력
	public void printStatus() {
		System.out.println("HP: " + hp);
		System.out.println("MP: " + mp);
		System.out.println("Level: " + level);
		System.out.println();
	}
	
}
