package oracle;

public class WebService implements Service{
	private Oracle oracle;
	
	public WebService() {
		oracle = new Oracle();
	}

	@Override
	public void register(Member info) {
		boolean isOk = oracle.insert(info);
		System.out.println("회원가입 " + (isOk ? "완료" : "실패"));
	}

	@Override
	public void login(Member info) {
		boolean isOk = oracle.select(info);
		System.out.println("로그인 " + (isOk ? "완료":"실패"));
	}

	@Override
	public void edit(Member info) {
		boolean isOk = oracle.update(info);
		System.out.println("회원수정 " + (isOk ? "완료":"실패"));
	}

	@Override
	public void resign(String email) {
		boolean isOk = oracle.delete(email);
		System.out.println("회원탈퇴 " + (isOk ? "완료" : "실패"));
	}

	@Override
	public Member[] getList() {
		return oracle.selectList();
	}

	@Override
	public Member getMember(String email) {
		return oracle.select(email);
	}
}
