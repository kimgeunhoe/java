package hotel;

import java.util.Scanner;

public class Hotel {
	private Room[][] rooms;	

	public Hotel(int i, int j) {
		rooms = new Room[i][j];
		for(int k=0; k<i; k++) {
			for(int m=0; m<j; m++) {
				rooms[k][m] = new Room(k, m);
			}
		}
	}

	public void goFrontDest() {
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		boolean flag = true;
		
		while (flag) {
			System.out.println("\n====================== 호텔 관리 메뉴 =====================");
			System.out.println("1:객실현황 2:입실 3:퇴실 4:객실상세조회 5:투숙객조회 Etc:종료");
			System.out.println("-------------------------------------------------------------");
			System.out.print(">>>>>>>>>>>>>>>>>>>>>>>> 메뉴 선택 >>>>>>>>>>>>>>>>>>>>>>>>>> ");
			menu = sc.nextInt();
			
			flag = choiceMenu(menu);
		}
		System.out.println("프로그램을 종료합니다");
		
	}

	private boolean choiceMenu(int menu) {
		Scanner sc = new Scanner(System.in);
		
		switch (menu) {
		case 1:
			for(int k=0; k<rooms.length; k++) {
				for(int m=0; m<rooms[k].length; m++) {
					rooms[k][m].getRoomInfo();
				}
				System.out.println();
			}
			break;
		case 2:
			System.out.print("입실할 호수 입력: ");
			int[] arr = inputRoomNum();
			
			if(check(arr[0], arr[1])==true) {
				rooms[arr[0]][arr[1]].checkIn();
			}
			break;
		case 3:
			System.out.print("퇴실할 호수 입력: ");
			arr = inputRoomNum();
			
			if(check(arr[0], arr[1])==true) {
				rooms[arr[0]][arr[1]].checkOut();
			}
			break;
		case 4:
			System.out.print("상세조회할 호수 입력: ");
			arr = inputRoomNum();
			
			if(check(arr[0], arr[1])==true) {
				rooms[arr[0]][arr[1]].getRoomInfoDetail();
			}
			break;
		case 5:
			System.out.print("투숙객 조회할 방 호수 입력: ");
			arr = inputRoomNum();
			if(check(arr[0], arr[1])==true) {
				rooms[arr[0]][arr[1]].getUserInfo();
			}
			break;
		default:
			return false;
		}
		return true;
	}

	int[] inputRoomNum() {
		Scanner sc = new Scanner(System.in);
		int roomNum = sc.nextInt();
		int[] arr = {roomNum/100-1, roomNum%100-1};
		return arr;
	}
	
	boolean check(int i, int j) {
		if(!(i<rooms.length && j<rooms[0].length && i>=0 && j>=0)) {
			System.out.println("존재하지 않는 방입니다.");
			return false;
		}
		return true;
	}
}