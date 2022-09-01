package object;

class BankAccount {
	String owner;
	String accNum;
	int deposit;
	
	void get(String o, String a, int d) {
		owner = o;
		accNum = a;
		deposit = d;
	}
	
	void info() {
		System.out.printf("예금주: %s, 계좌번호: %s, 계좌잔액: %d원 \n", owner, accNum, deposit);
	}
	
	void in(int i) {
		deposit += i;
		System.out.println("입금액" + i + "원, 잔액: " + deposit + "원");
	}
	
	void out(int i) {
		if(deposit>i) {			
			deposit -= i;
			System.out.println("출금액" + i + "원, 잔액: " + deposit + "원");
		}
		else {
			System.out.println("출금불가. 잔액이 " + i + "원보다 적습니다. 잔액: " + deposit + "원");
		}
	}
}

public class BankingService {

	public static void main(String[] args) {
		//BankAccount 클래스를 정의
		//BankAccount에는 예금주(owner), 계좌번호(accNum), 계좌잔액(deposit)
		//계좌현황조회, 입금, 출금을 할 수 있다(메서드)
		
		BankAccount myAccount = new BankAccount();
		myAccount.get("kim", "1234", 100);
		myAccount.info();
		myAccount.in(30);
		myAccount.out(10);
		myAccount.out(200);
	}

}