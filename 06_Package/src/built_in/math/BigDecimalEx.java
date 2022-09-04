package built_in.math;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigDecimalEx {

	public static void main(String[] args) {
		//Math class를 좀 더 보완하기위해 만들어진 클래스
		//BigDecimal, BigInteger는 java.math패키지 소속
		//Math class는 java.lang패키지 소속
		BigDecimal bdc = new BigDecimal("123.456");
		System.out.println(bdc);
		
		BigInteger bit = BigInteger.ONE;
		System.out.println(bit);

		double db = Double.parseDouble("123.45");
		int i = Integer.parseInt("123");
		long l = Long.parseLong("12143565768");
	}

}
