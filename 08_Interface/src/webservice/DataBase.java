package webservice;

public interface DataBase {
	boolean insert(String id, String pwd, String nickname, int grade);
	int select(String id, String pwd);
	void update(int userIdx, String pwd, String nickname, int grade);
	void delete(String pwd, int userIdx);
	Member[] getMember();
	int getNum();
	String className();
}
