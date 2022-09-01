package quiz.bank;

public class Bank {
	private User[] users;

	public Bank(int i) {
		users = new User[i];
	}

	public User[] getUsers() {
		return users;
	}

	public void setUsers(User[] users) {
		this.users = users;
	}

	public void saving(int money, User user) {
		if(user.getCashAmount()<money) {
			System.out.println("현금부족");
		}
		else {
			user.getAccount().setBalance(user.getAccount().getBalance() + money);
			System.out.println("입금 완료");
			user.setCashAmount(user.getCashAmount()-money);
		}
		System.out.println(user.toString());
		System.out.println(user.getAccount().toString());
	}

	public void withdraw(int money, User user) {
		if(user.getAccount().getBalance()<money) {
			System.out.println("잔액부족");
		}
		else {
			user.getAccount().setBalance(user.getAccount().getBalance() - money);
			System.out.println("출금 완료");
			user.setCashAmount(user.getCashAmount()+money);
		}
		System.out.println(user.toString());
		System.out.println(user.getAccount().toString());
		
	}

	public void transfer(int money, User from, User to) {
		if(from.getAccount().getBalance()>=money) {
			from.getAccount().setBalance(from.getAccount().getBalance()-money);
			to.getAccount().setBalance(to.getAccount().getBalance()+money);
			System.out.println(from.toString());
			System.out.println(from.getAccount().toString());
			System.out.println(to.toString());
			System.out.println(to.getAccount().toString());
		}
		else {
			System.out.println("잔액부족");
			
		}
	}
	
}