package printEx;

public class Variable {

	public static void main(String[] args) {
		//변수의 데이터타입을 우선 지정하고 값을 초기화한다
		String str; //변수 선언
		str = "문자열 초기화";
		String str2 = "변수 선언 및 초기화";
		int num = 100;
		
		System.out.println(str + ' ' + str2 + 100);
		System.out.println(100); //단독으로 숫자가 오는 것은 권장하지 않음
		System.out.println("" + 100);
		
		System.out.print("엔터효과\n넣기");
		System.out.printf("\n문자열 넣기: %s + %d", str, num);
	}

}
