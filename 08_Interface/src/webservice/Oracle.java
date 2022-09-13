package webservice;

public class Oracle implements DataBase {
	private Member[] member;
	private int num = 0;
	
	
	public Oracle() {
		member = new Member[10];
	}

	public Member[] getMember() {
		return member;
	}

	public int getNum() {
		return num;
	}

	public String className() {
		return "Oracle";
	}
	
	@Override
	public boolean insert(String id, String pwd, String nickname, int grade) {
		if(num<=9) {
			System.out.print(className());
			member[num++] = new Member(id, pwd, nickname, grade);
			return true;
		}
		else {
			System.out.println("정원초과입니다");
			return false;
		}
	}

	@Override
	public int select(String id, String pwd) {
		for(int i=0; i<num; i++) {
			if(id.equals(member[i].getId())) {
				if(pwd.equals(member[i].getPwd())) {					
					System.out.println("Oracle 로그인 성공");
					return i;
				}
			}
		}
		System.out.println("존재하지 않는 아이디거나 비밀번호가 틀렸습니다.");
		return -1;
	}

	@Override
	public void update(int userIdx, String pwd, String nickname, int grade) {
		System.out.print(className());
		member[userIdx].update(pwd, nickname, grade);
	}

	@Override
	public void delete(String pwd, int userIdx) {
		if(pwd.equals(member[userIdx].getPwd())) {
			for(int i=userIdx; i<num; i++) {
				member[i] = member[i+1];
				member[num] = null;
				num--;
				System.out.println("Oracle에서 회원 정보를 삭제하였습니다");
			}
		}
		else {
			System.out.println("비밀번호가 틀렸습니다.");
		}
	}

}
