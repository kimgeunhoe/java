package list;

import java.util.ArrayList;

public class ArrayListEx2 {
	
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("String");
		list.add(new Integer(1));
		list.add(new Double(1.1));
		list.add(new Boolean(true));
		list.add(new Object());
		list.add(new String[] {"a", "b"});
		//지정할 때는 문제가 없지만 데이터를 꺼내서 사용할 떄 문제가 발생
		for(Object object : list) {
			if(object instanceof String) {
				
			}
			else if(object instanceof Integer) {
				
			}
		}
	}
}
