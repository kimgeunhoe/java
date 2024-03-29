package attacker;

public class ChracterTest {

	public static void main(String[] args) {
		//추상 클래스는 클래스의 특징을 가지므로 단일상속만 가능함
		//추상 클래스 내부에 추상메서드와 일반메서드 모두 존재하므로 개념이 모호
		//인스턴스로 만들지 못한다면 굳이 일반클래스의 속성을 따를 필요가 있을까?
		
		//인터페이스는 final상수와 추상메서드를 갖는다
		//class라고 선언하지 않고 interface라고 선언한다
		//extends키워드 대신 implements라는 키워드를 사용한다
		//주로 규격 및 기능정의를 제시하기때문에 public이 가장 많다
		//implements뒤에 ,를 사용하여 여러개를 구현할 수 있다
		
		Fighter f = new Fighter();
		if(f instanceof Unit) {
			System.out.println("f는 Unit클래스의 자손입니다");
		}
		if(f instanceof Fightable) {
			System.out.println("f는 Fightable인터페이스의 구현체입니다");
		}
		if(f instanceof Movable) {
			System.out.println("또한 f는 Movable인터페이스의 구현체입니다");
		}
		if(f instanceof Attackable) {
			System.out.println("또한 f는 Attackable인터페이스의 구현체입니다");
		}
		if(f instanceof Object) {
			System.out.println("또한 f는 Object 클래스의 최종 자손입니다");
		}
		//클래스 extends 클래스
		//인터페이스 extends 인터페이스
		//클래스 implement인터페이스[, 인터페이스...]
		//인터페이스는 클래스를 implements 못함
		//인터페이스는 클래스보다 추상화된 상위 개념임
		//인터페이스에 제시된 규격에 따라 클래스가 구체화되는 객체로 만들어짐
		
	}

}
