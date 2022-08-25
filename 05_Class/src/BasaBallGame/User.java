package BasaBallGame;

public class User {
	private String name;
	private int count; 
	private String time;
	
	public User(String name, int count, String time) {
		this.name = name;
		this.count = count;
		this.time = time;
	}

	
	@Override
	public String toString() {
		return "기록 [이름=" + name + ", 시도횟수=" + count + ", 걸린시간=" + time + "]";
	}
}
