package set;

import java.util.HashSet; //정수형이면 자동정렬?, 실수형는 안되는듯
import java.util.Set;

public class SetEx1 {

	public static void main(String[] args) {
		Set set = new HashSet();
		int count = 0;
		int rnum;
		while(set.size()<10) {
			rnum = (int)(Math.random()*10+1);
			System.out.println(rnum);
			set.add(rnum);
			count++;
		}
		System.out.println(set + "\ncount: " + count);
	}

}
