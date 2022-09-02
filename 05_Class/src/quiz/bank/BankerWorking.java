package quiz.bank;

import java.util.Scanner;

public class BankerWorking {
	Scanner sc = new Scanner(System.in);
	private Bank bank;
	private int money = 0, regCount = 0, idx = 0, limit = 0;
	private boolean flag = true;
	
	public BankerWorking() {
		bank = initUserCount();
		
		while(flag) {
			bankingProcess(printMenu());
		}
		System.out.println("프로그램 종료");
	}

	private void bankingProcess(int menu) {
		switch(menu) {
		case 1:
			makeAccount();
			break;
		case 2:
			deposit();
			break;
		case 3:
			withdraw();
			break;
		case 4:
//			an = new User(); //User에 디폴트 생성자 필수
			break;
		case 5:
			transfer();
			break;
		default:
			flag = false;
			System.out.println("=============뱅킹시스템 종료==============");
			break;
		}
	}

	private void transfer() {
		System.out.print("from: ");
		int from = sc.nextInt();
		System.out.print("to: ");
		int to = sc.nextInt();
		if(from<limit && to<limit && bank.getUsers()[from]!=null && bank.getUsers()[to]!=null && from!=to) {
			System.out.print("이체할 금액: ");
			money = sc.nextInt();
			bank.transfer(money, bank.getUsers()[from], bank.getUsers()[to]);
		}
		else {
			System.out.println("미개설 계좌번호이거나 없는 고객번호입니다.");
		}
	}

	private void withdraw() {
		System.out.print("인덱스 번호(0 ~ limit-1): ");
		idx = sc.nextInt();
		if(idx<limit && bank.getUsers()[idx]!=null) {
			System.out.print("출금할 금액: ");
			money = sc.nextInt();
			bank.withdraw(money, bank.getUsers()[idx]);
		}
		else {
			System.out.println("미개설 계좌번호이거나 없는 고객번호입니다.");
		}
	}

	private void deposit() {
		System.out.print("인덱스 번호(0 ~ limit-1): ");
		idx = sc.nextInt();
		if(idx<limit && bank.getUsers()[idx]!=null) {
			System.out.print("입금할 금액: ");
			money = sc.nextInt();
			bank.saving(money, bank.getUsers()[idx]);
		}
		else {
			System.out.println("미개설 계좌번호이거나 없는 고객번호입니다.");
		}
	}

	private void makeAccount() {
		if(regCount<limit) {					
			System.out.print("고객명 입력: ");
			String userName = sc.next();
			System.out.print("최초 입금액: ");
			int initBalance = sc.nextInt();
			bank.getUsers()[regCount] = new User(userName, initBalance, new BankAccount());
			regCount++;
		}
		else {
			System.out.println("고객 수 초과");
		}
	}
	
	private int printMenu() {
		System.out.println("\n============뱅킹 시스템=============");
		System.out.print("1:계좌개설 / 2.입금 / 3.출금 / 4.무기명계좌개설 / 5.이체 / etc.종료 ");
		int menu = sc.nextInt();
		System.out.println("-------------------------------------");
		return menu;
	}

	private Bank initUserCount() {
		System.out.print("고객의 수 입력: ");
		limit = sc.nextInt();
		return new Bank(limit);
	}
	
}
