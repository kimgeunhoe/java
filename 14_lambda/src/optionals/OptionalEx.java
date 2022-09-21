package optionals;

import java.util.Optional;

public class OptionalEx {
	
	public static void main(String[] args) {
		//Java8 이상
		//데이터를 변수에 저장할 때나 연산의 결과를 리턴받을 때 null여부를 판단하여 NullPointException발생을 사전에 필터링함
		
		Optional<String> option = Optional.ofNullable("빈 값이 아니에요");
		System.out.println(option);
		System.out.println(option.get());
		System.out.println(option.isPresent());
//		System.out.println(option.isEmpty()); //isEmpty는 11버전부터
		
		Optional<String> option2 = Optional.empty();
		System.out.println(option2.orElse("빈 옵셔널 객체이므로 값을 세팅함"));
		System.out.println(option2.orElseGet(String::new));
	}
}
