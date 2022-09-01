package object;

class BankAccount2 {
	String owner;
	String accNum;
	int deposit;
	
	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}

	public void setAccInfo(int deposit) {
		this.deposit = deposit;
	}
	
	public String getOwner() {
		return this.owner;
	}
	public String getAccNum() {
		return this.accNum;
	}
	public int getDeposit() {
		return this.deposit;
	}
	
	void info() {
		System.out.print("예금주: " + getOwner());
		System.out.print(", 계좌번호: " + getAccNum());
		System.out.println(", 계좌잔액: " + getDeposit() + "원");
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

public class BankingService2 {

	public static void main(String[] args) {
		//BankAccount 클래스를 정의
		//BankAccount에는 예금주(owner), 계좌번호(accNum), 계좌잔액(deposit) 세팅하는 메서드
		//위의 정보를 조회할 수 있는 메서드
		//계좌현황조회, 입금, 출금을 할 수 있다(메서드)
		
		BankAccount2 myAccount = new BankAccount2();
		myAccount.setOwner("kim");
		myAccount.setAccNum("1234");
		myAccount.setAccInfo(100);
		myAccount.info();
		myAccount.in(30);
		myAccount.out(10);
		myAccount.out(200);
	}

}