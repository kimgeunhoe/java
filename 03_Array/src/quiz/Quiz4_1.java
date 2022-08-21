package quiz;
import java.util.Scanner;

public class Quiz4_1 {
	static Scanner sc = new Scanner(System.in);
	static int[][] hotel;
	
	private static void initHotel() {
		System.out.print("층 개수: ");
		int floorCount = sc.nextInt();
		System.out.print("층당 방 개수: ");
		int roomCount = sc.nextInt();
		
		hotel = new int[floorCount][roomCount];
		
		for(int i=0; i<hotel.length; i++) {
			for(int j=0; j<hotel[i].length; j++) {
				hotel[i][j] = 0;
			}
		}
	}
	
	private static void printRooms() {
		for(int i=0; i<hotel.length; i++) {
			for(int j=0; j<hotel[i].length; j++) {
				System.out.print((i+1)+(j < 9 ? "0" : "")+(j+1)+"호 ");
				System.out.print(hotel[i][j]==0 ? "입실가능" : "사용중");
				System.out.print("\t");
			}
			System.out.println();
		}
	}
	
	private static void checkIn(String roomNum) {
		int floor = 0, room = 0;
		
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
	}
	
	private static void checkOut(String roomNum) {
		int floor = 0, room = 0;
		
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
	}
	
	public static void main(String[] args) {
		//Optional
		//호텔 예약 프로그램
		initHotel();
		
		int menu = 0;
		boolean flag = true;
		
		while(flag) {
			System.out.println("\n호텔 관리 메뉴");
			System.out.println("1.객실 현황  2.입실  3.퇴실  Etc.종료");
			System.out.print("메뉴 번호 입력: ");
			menu = sc.nextInt();
			
			String roomNum = "";
			
			switch(menu) {
			case 1:
				printRooms();
				break;
			case 2:
				System.out.print("입실할 방번호: ");
				roomNum = sc.next();
				checkIn(roomNum);
				break;
			case 3:
				System.out.print("입실할 방번호: ");
				roomNum = sc.next();
				checkOut(roomNum);
				break;
			default:
				flag = false;
				break;
			}
		}
	}

}
