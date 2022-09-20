import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaEx1 {

	public static void main(String[] args) {
		//Java8부터 지원하는 표현식
		//전체 코드에서 적극적으로 활용되지는 않음
		//일부 메서드 구현의 편리성을 위해 사용하는 편
		//가독성이 낮은 편이여서 아직 자바 개발자드렝게 큰 호응은 없는 편
		
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		
		for (Integer n : numbers) {
			System.out.println(n);
		}
		System.out.println("====");
		
		numbers.forEach((n) -> {
			System.out.println(n);
		});
		
		Consumer<Integer> method = (n) -> {System.out.println(n);};
		numbers.forEach(method);
	}

}
