package recursive;

public class RecursiveMethod {

	public static void main(String[] args) {
		//재귀 메서드
		//반드시 종료 조건과 연산식
		
		//1부터 10까지의 합
		
		int num = sum(10);
		System.out.println(num);
	}

	private static int sum(int i) {
		if(i>0) {
			return i + sum(i-1);
		} else {
			return 0;
		}
	}
}
