package quiz;

public class Quiz3 {

	public static void main(String[] args) {
		//Q3. 아래와 같은 출력문을 만들어보세요
		//ABCDEFGHIJKLMNOPQRSTUVWXYZ
		//ABCDEFGHIJKLMNOPQRSTUVWXY
		//ABCDEFGHIJKLMNOPQRSTUVWX
		//ABCDEFGHIJKLMNOPQRSTUVW
		//ABCDEFGHIJKLMNOPQRSTUV
		//..........
		//......
		//AB
		//A
		for(int n = 91; n >= 65; n--) {
			for(int i=65; i < n; i++) {
				System.out.print((char)i);
			}
			System.out.println();
		}
	}
}