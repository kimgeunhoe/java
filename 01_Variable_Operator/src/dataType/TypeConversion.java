package dataType;

public class TypeConversion {
	
	public static void main(String[] args) {
		//타입변환의 필요성
		//형식과 크기가 달라 변환이 필요할 때가 있다
		//casting => 타입 변환의 방식
		//auto casting(자동형변환): widening casting
		//byte -> short -> char -> int -> long -> float -> double
		
		byte b1 = 1;
		short sh1 = b1; //묵시적 형변환
		char ch1 = (char)sh1; //명시적 형변환
		int i = ch1;
		long l = i;
		float f = l;
		double d = f;
		
		//Manual Casting(강제형변환): narrowing casting
		//자동형변환의 방향을 반대로 시도
		double d2 = 314.23456;
		float f2 = (float)d2;
		long l2 = (long)f2;
		int i2 = (int)l2;
		char ch2 = (char)i2; //실행했을 때 크기가 char의 범위를 초과할 경우 표기X
		short sh2 = (short)ch2;
		byte b2 = (byte)sh2;
		
		//문자를 숫자로
		String str = "1234567";
		int num = Integer.parseInt(str);
		System.out.println(str instanceof String); //reference type만 비교
		System.out.println(num);
		//System.out.println(num instanceof Integer); //변수 타입을 지정해서 만들기때문에 typeof가 필요없음
		System.out.println(new Integer(num) instanceof Integer);
		System.out.println(new Integer(str) instanceof Integer);
		
		//숫자를 문자로
		int num2 = 1231567;
		String str2 = String.valueOf(num2);
		String str3 = Integer.toString(num2);
	}
}
