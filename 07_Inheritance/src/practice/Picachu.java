package practice;

public class Picachu extends Character {

	public Picachu() { //피카츄 생성자
		hp = 100;  //체력 초기화
		mp = 50; //마나 초기화
	}
	
	public String characterName() {
		return "피카츄";
	}
	
	@Override
	public void eat() {
		mp += 10;
	}

	@Override
	public void sleep() {
		mp += 20;
	}

	@Override
	public void play() {
		mp -= 20;
		hp += 5;
	}

	@Override
	public boolean train() {
		mp -= 10;
		hp += 10;
		levelUp();
		return checkMp();
	}

	@Override
	public void levelUp() {
		if(hp >= 40) {
			hp -= 40;
			level++;
		}
	}
}
