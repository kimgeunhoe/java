package constructor;

public class Bank {

	public static void main(String[] args) {
		BankAccount myBA = new BankAccount("kim", 1234, 0);
		System.out.println(myBA.getAccNum());
		
		BankAccount anonyBA = new BankAccount(12345, 10000);
		System.out.println(anonyBA.getAccNum());
		
//		myBA.getAccNum(); private접근제한자는 외부에서 접근 불가능
	}

}
