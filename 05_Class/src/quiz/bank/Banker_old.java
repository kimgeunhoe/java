package quiz.bank;

public class Banker_old {

	public static void main(String[] args) {
		//은행계좌 개설하기 2개(myBA, urBA)
		BankAccount acc1 = new BankAccount();
		BankAccount acc2 = new BankAccount();

		User me = new User("kim", 10000);
		User you = new User("you", 100000);
		
		me.setAccount(acc1);
		me.setAccount(acc2);
		
		//잔액 조회 기능 구현
		System.out.println("myBA 계좌잔액: " + me.getAccount().getBalance());
		System.out.println("urBA 계좌잔액: " + you.getAccount().getBalance());
		
		//입금, 출금 기능 구현 => setter의 활용 한계점
		me.getAccount().saving(10000);
		you.getAccount().saving(50000);
		
		me.getAccount().withdraw(10000);
		you.getAccount().withdraw(20000);
	}

}