package webservice;

import java.util.Scanner;

public class WebApplication {

	public static void main(String[] args) {
		//이 곳에 웹서비스에 사용할 데이터베이스를 선택하는 메뉴를 만들고 데이터베이스의 선택에 따라 MySQL, Oracle을 연결되어 작동하는 구조
		//DataBase의 인터페이스에 정의된 register 메서드의 return type을 boolean으로 변경 후
		//register("아이디값[3자이상]")로 전달되면 정상작동 후 true 리턴, 아니면 false리턴을 하여 웹애플리케아션이 작동하도록 만들기
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("사용할 데이터베이스 선택 1.MySQL 2.Oracle ");
//		Service svc  = new WebService(sc.nextInt());
////		svc.register();
////		svc.login();
//		
//		System.out.print("이름 입력(3자리 이상): ");
//		svc.register(sc.next());
	}

}
