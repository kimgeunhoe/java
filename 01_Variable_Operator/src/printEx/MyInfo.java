package printEx;
import java.util.Scanner;

public class MyInfo {

	public static void main(String[] args) {
		String name ="kim";
		int age = 27;
		float height = 165.0f;
		double weight = 64.0;
		char blood = 'A';
		boolean vachine = true; //1bit
		long asset = 0L;
		String description = "현재는 Smart Java수강 중";
		
		Scanner sc = new Scanner(System.in);
		
		//정보 입력 안내
		//입력받은 정보를 변수에 저장
		System.out.println("이름>");
		name = sc.nextLine(); //뉴라인 입력됨: 마지막 입력에 사용금지
		System.out.println("나이>");
		age = sc.nextInt();
		System.out.println("키>");
		height = sc.nextInt();
		System.out.println("몸무게>");
		weight = sc.nextInt();
		System.out.println("혈액형을 입력하세요>");
		blood = sc.next().charAt(0);
		System.out.println("백신여부>");
		vachine = sc.nextBoolean();
		System.out.println("자산>");
		asset = sc.nextLong();
		System.out.println("부가정보>");
		description = sc.next(); //뉴라인 입력 안됨
		
		//문자: %s, 정수: %d, 실수: %f
		System.out.printf("이름: %s, 나이: %d, 키: %f, 몸무게: %f, 혈액형: %c, vachine: %s, asset: %d, description: %s", name, age, height, weight, blood, vachine, asset, description);
		
	}

}
