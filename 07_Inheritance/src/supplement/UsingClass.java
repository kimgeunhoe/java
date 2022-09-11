package supplement;

public class UsingClass {

	public static void main(String[] args) {
		//자바프로그래밍을 시작하기 위한 시작 버튼 역할
		ClassArch ca = new ClassArch();
		System.out.println(ca);
		System.out.println(ca.prop1);
		System.out.println(ca.prop2);
		System.out.println(ca.prop3);
		System.out.println(ca.prop4);
		System.out.println(ca.makeSir());
		ca.addProp2(1000);
		
		ClassArch ca2 = new ClassArch("kim", 100, true, 1.0);
		System.out.println(ca2);
		System.out.println(ca2.makeSir());
		ca2.addProp2(1000);
	}

}
