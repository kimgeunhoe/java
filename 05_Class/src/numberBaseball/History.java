package numberBaseball;

public class History {
	private int count = 0;
	private String process = "";
	private String playTime = "";
	
	public History(int count, String process, String playTime) {
		this.count = count;
		this.process = process;
		this.playTime = playTime;
	}

	public History() {}

	@Override
	public String toString() {
		return "시도횟수: " + count + "회\n게임내용: " + process + "\n플레이타임: " + playTime;
	}
	
}
