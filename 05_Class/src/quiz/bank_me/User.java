package quiz.bank_me;

public class User {
	private String name;
	private int cashAmount;
	private BankAccount account = new BankAccount();
	private int acc;

	public User(String name, int cashAmount, int acc) {
		this.name = name;
		this.cashAmount = cashAmount;
		this.acc = acc;
	}



	void checkCash() {
		System.out.println(name + "님의 잔액: " + cashAmount + "원");
	}
	
	void in(int i) {
		account.getBal(cashAmount);
		cashAmount = account.inAcc(i);
		System.out.println(name + "의 잔액: " + cashAmount + "원");
	}
	
	void out(int i) {
		account.getBal(cashAmount);
		cashAmount = account.outAcc(i);
		System.out.println(name + "의 잔액: " + cashAmount + "원");
	}
}
