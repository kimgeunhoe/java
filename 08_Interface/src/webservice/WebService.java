package webservice;

import java.util.Scanner;

public class WebService implements Service {
	private DataBase mysql;
	private DataBase oracle;
	private DataBase db;
	private Scanner sc = new Scanner(System.in);
	private String id;
	private String pwd;
	private String nickname;
	private int grade;
	private int userIdx = -1;
	private boolean flag = true;
	private boolean bool;
	
	public WebService() {
		mysql = new MySQL();
		oracle = new Oracle();
		menu();
	}
	
	private void setDbms() {
		System.out.print("사용할 데이터베이스 선택 1.MySQL 2.Oracle ");
		db = sc.nextInt() == 1 ? mysql : oracle;
	}

	private void menu() {
		while(flag) {
			System.out.print("1.회원가입 2.로그인 3.회원수정 4.회원탈퇴 etc.종료 ");
			
			switch(sc.nextInt()) {
			case 1:
				register();
				break;
			case 2:
				login();
				break;
			case 3:
				edit();
				break;
			case 4:
				resign();
				break;
			default:
				flag = false;
				System.out.println("프로그램 종료");
				break;
			}
		}
	}

	@Override
	public void register() {
		bool = true;
		System.out.println("회원가입");
		setDbms();
		System.out.print("아이디: ");
		id = sc.next();
		for(int i=0; i<db.getNum(); i++) {
			if(id.equals(db.getMember()[i].getId())) {
				System.out.println("중복된 아이디입니다.\n회원가입 실패\n");
				bool = false;
				break;
			}
		}
		
		if(bool) {			
			System.out.print("비밀번호: ");
			pwd = sc.next();
			System.out.print("닉네임: ");
			nickname = sc.next();
			System.out.print("grade: ");
			grade = sc.nextInt();
			System.out.println("회원가입" + (db.insert(id, pwd, nickname, grade) ? "완료" : "실패"));
			System.out.println();
		}
	}

	@Override
	public void login() {
		System.out.println("로그인");
		setDbms();
		System.out.print("로그인\n아이디: ");
		id = sc.next();
		System.out.print("비밀번호: ");
		pwd = sc.next();
		userIdx = db.select(id, pwd);
		System.out.println("로그인" + (userIdx == -1 ? "실패" : "완료"));
		System.out.println();
	}

	@Override
	public void edit() {
		if(userIdx>=0 && userIdx<=db.getNum()) {			
			System.out.print(db.className() + "\nnickname: " + db.getMember()[userIdx].getNickname() + " (grade: " + db.getMember()[userIdx].getGrade());
			System.out.print(")\n회원정보수정\n비밀번호: ");
			pwd = sc.next();
			System.out.print("닉네임: ");
			nickname = sc.next();
			System.out.print("grade: ");
			grade = sc.nextInt();
			db.update(userIdx, pwd, nickname, grade);
			System.out.println("수정 완료\n");
		}
		else {
			System.out.println("로그인 후 이용해주세요.\n");
		}
	}

	@Override
	public void resign() {
		System.out.print(db.className() + "\nnickname: " + db.getMember()[userIdx].getNickname() + " (grade: " + db.getMember()[userIdx].getGrade());
		System.out.print(")\n회원탈퇴\n비밀번호: ");
		pwd = sc.next();
		
		if(userIdx>=0 && userIdx<=db.getNum()) {			
			db.delete(pwd, userIdx);
			System.out.println("탈퇴 완료\n");
		}
		else {
			System.out.println("로그인 후 이용해주세요.\n");
		}
	}
}
