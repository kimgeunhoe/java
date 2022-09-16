package etc.enums;

import java.util.Scanner;

public class SeoulToWhere {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("목적지: ");
		String dest = sc.next();
		System.out.print("목적지까지 거리: ");
		int km = sc.nextInt();
		
		System.out.println(dest + "까지의 Bus요금은 " + Fares.BUS.fare(km));
		System.out.println(dest + "까지의 KTX요금은 " + Fares.KTX.fare(km));
		System.out.println(dest + "까지의 AIR요금은 " + Fares.AIR.fare(km));
	}

}
