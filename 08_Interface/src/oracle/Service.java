package oracle;

public interface Service {
	void register(Member member);
	void login(Member member);
	void edit(Member member);
	void resign(String email);
	
	Member[] getList();
	Member getMember(String email);
}
