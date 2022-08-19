package loops;

import java.util.Iterator;

public class Gugudan {

	public static void main(String[] args) {
		//구구단 중첩반복문
		//\t탭효과
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.printf("%d x %d = %d\t", j, i, j*i);
			}
			System.out.println("");
		}
	}

}
