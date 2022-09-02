package quiz.bank;

import java.util.Scanner;

public class Banker_filtering {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		User me = null;
		User you = null;
		User an = null;
		
		BankAccount acc1 = null;
		BankAccount acc2 = null;
		
		int menu = 0;
		boolean flag = true;
		int money = 0;
		while(flag) {
			System.out.println("\n============뱅킹 시스템=============");
			System.out.print("1:계좌개설 / 2.입금 / 3.출금 / 4.무기명계좌개설 / etc.종료 ");
			menu = sc.nextInt();
			System.out.println("-------------------------------------");
			
			switch(menu) {
			case 1:
				acc1 = new BankAccount();
				me = new User("park", 10000);
				me.setAccount(acc1);
				System.out.println("계좌 개설 완료");
				System.out.println(me.toString());
				System.out.println(me.getAccount().toString());

				acc2 = new BankAccount();
				you = new User("you", 50000);
				you.setAccount(acc2);
				System.out.println(you.toString());
				System.out.println(you.getAccount().toString());
				break;
			case 2:
				System.out.print("입금할 금액: ");
				money = sc.nextInt();
				if(me.getCashAmount()<money) {
					System.out.println("현금부족");
					System.out.println(me.toString());
					System.out.println(me.getAccount().toString());
				}
				else {
					me.getAccount().saving(money);
					System.out.println("입금 완료");
					me.setCashAmount(me.getCashAmount()-money);
					System.out.println(me.toString());
					System.out.println(me.getAccount().toString());
				}
				break;
			case 3:
				System.out.print("출금할 금액: ");
				money = sc.nextInt();
				if(me.getAccount().getBalance()<money) {
					System.out.println("잔액부족");
					System.out.println(me.toString());
					System.out.println(me.getAccount().toString());
				}
				else {
					me.getAccount().withdraw(money);
					System.out.println("출금 완료");
					me.setCashAmount(me.getCashAmount()+money);
					System.out.println(me.toString());
					System.out.println(me.getAccount().toString());
				}
				break;
			case 4:
				an = new User();
				break;
			default:
				flag = false;
				System.out.println("=============뱅킹시스템 종료==============");
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

}