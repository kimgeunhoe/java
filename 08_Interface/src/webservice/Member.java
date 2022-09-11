package webservice;

public class Member {
	private String id;
	private String pwd;
	private String nickname;
	private int grade;
	
	public Member(String id, String pwd, String nickname, int grade) {
		this.id = id;
		this.pwd = pwd;
		this.nickname = nickname;
		this.grade = grade;
		System.out.println("에 회원정보를 입력하였습니다");
	}

	public void update(String pwd, String nickname, int grade) {
		this.pwd = pwd;
		this.nickname = nickname;
		this.grade = grade;
		System.out.println("에 회원정보를 수정하였습니다");
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
}
