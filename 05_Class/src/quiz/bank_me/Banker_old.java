package quiz.bank_me;

public class Banker_old {

	public static void main(String[] args) {
		//은행계좌 개설하기 2개(myBA, urBA)
		User myBA = new User("kim", 10000, 12345678);
		User urBA = new User("lee", 20000, 12345679);

		
		//잔액 조회 기능 구현

		urBA.checkCash();
		
		//입금, 출금 기능 구현 => setter의 활용 한계점

		myBA.in(100);
		myBA.out(1000);
		urBA.out(100000);

	}

}