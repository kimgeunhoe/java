package quiz;

import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {
		//Optional
		//호텔 예약 프로그램
		Scanner sc = new Scanner(System.in);
		System.out.print("층: ");
		int floorCount = sc.nextInt();
		System.out.print("층당 방 개수: ");
		int roomCount = sc.nextInt();
		
		int[][] hotel = new int[floorCount][roomCount];
		int menu = 0;
		boolean flag = true;
		
		for(int i=0; i<hotel.length; i++) {
			for(int j=0; j<hotel[i].length; j++) {
				hotel[i][j] = 0;
			}
		}
		
		while(flag) {
			System.out.println("\n호텔 관리 메뉴");
			System.out.println("1.객실 현황  2.입실  3.퇴실  Etc.종료");
			System.out.print("메뉴 번호 입력: ");
			menu = sc.nextInt();
			
			String roomNum = "";
			int floor = 0, room = 0;
			switch(menu) {
			case 1:
				for(int i=0; i<hotel.length; i++) {
					for(int j=0; j<hotel[i].length; j++) {
						System.out.print((i+1)+(j < 9 ? "0" : "")+(j+1)+"호 ");
						System.out.print(hotel[i][j]==0 ? "입실가능" : "사용중");
						System.out.print("\t");
					}
					System.out.println();
				}
				break;
			case 2:
				System.out.print("입실할 방번호: ");
				roomNum = sc.next();
				if(roomNum.length() > 3) { //호텔이 10층 이상이면
					floor = Integer.parseInt(roomNum.substring(0, 2))-1;
					room = Integer.parseInt(roomNum.substring(2))-1;
				} else {
					floor = Integer.parseInt(roomNum.substring(0, 1))-1;
					room = Integer.parseInt(roomNum.substring(1))-1;
				}
				if(hotel[floor][room]==0) {
					hotel[floor][room] = 1;
					System.out.println(roomNum + "호 입실완료");
				} else {
					System.out.println(roomNum + "호 사용중");
				}
				break;
			case 3:
				System.out.print("입실할 방번호: ");
				roomNum = sc.next();
				if(roomNum.length() > 3) { //호텔이 10층 이상이면
					floor = Integer.parseInt(roomNum.substring(0, 2))-1;
					room = Integer.parseInt(roomNum.substring(2))-1;
				} else {
					floor = Integer.parseInt(roomNum.substring(0, 1))-1;
					room = Integer.parseInt(roomNum.substring(1))-1;
				}
				if(hotel[floor][room]==1) {
					hotel[floor][room] = 0;
					System.out.println(roomNum + "호 퇴실완료");
				} else {
					System.out.println(roomNum + "호 빈 반");
				}
				break;
			default:
				flag = false;
				break;
			}
		}
	}

}
