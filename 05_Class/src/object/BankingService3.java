package object;

class BankAccount3 {
	String owner;
	int accNum;
	double deposit;
	
	//getter, setter 자동완성: alt + shift + s => r => alt + a(전체선택) => alt + r(생성)
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public int getAccNum() {
		return accNum;
	}
	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}
	
	public double getDeposit() {
		return deposit;
	}
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	
	//getters, setters만든 후 필요한 메서드 만드시면 됨
	
}
public class BankingService3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
