package basic;
import java.util.Arrays;
import java.util.Collections;

public class SortMethod {

	public static void main(String[] args) {
		Integer[] intArr = new Integer[12];
		//int[] intArr = new int[12];
		
		for(int i=0; i<intArr.length; i++) {
			intArr[i] = new Integer((int)Math.floor(Math.random()*100 + 1));
			//intArr[i] = (int)Math.floor(Math.random()*100 + 1);
			System.out.print(intArr[i] + " ");
		}
		System.out.println();
		
		Arrays.sort(intArr);
		for (int i : intArr) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		//객체여야 사용가능
		Arrays.sort(intArr, Collections.reverseOrder());
		for (Integer i : intArr) {
			System.out.print(i + " ");
		}
	}

}