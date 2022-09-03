package quiz.bank_me;
//추상화
//은행계좌 정보 > BankAccount class > 계좌는 소유자 정보를 갖고있지 않음, 잔액만
//사람(User)는 은행계좌를 갖고있다 > 이름, 현금보유액, 은행계좌
//사람은 은행원을 통해 은행계좌을 활용한다(입금, 출금)
public class BankAccount {
	private int balance;

//	public int getBalance() {
//		return balance;
//	}
//
//	public void setBalance(int balance) {
//		this.balance = balance;
//	}
//
//	public void saving(int i) {
//		this.balance += i;
//	}
//
//	public void withdraw(int i) {
//		this.balance -= i;
//	}
//
//	@Override
//	public String toString() {
//		return "BankAccount [balance=" + balance + "]";
//	}
//	
	
	
	void getBal(int a) {
		balance = a;
	}
	
	int inAcc(int i) {
		System.out.print(i + "원 입금. ");
		return balance + i;
	}
	
	int outAcc(int i) {
		if(balance > i) {		
			System.out.print(i + "원 출금. ");
			return balance - i;
		}
		else {
			System.out.print("잔액부족으로 출금 실패. ");
			return balance;
		}
	}

}