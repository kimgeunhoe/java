package hotel_t;

import java.util.Scanner;

public class Hotel {
	private Room[][] rooms;
	Scanner sc = new Scanner(System.in);
	
	public Hotel() {
		buildHotel();
	}

	private void buildHotel() {
		System.out.print("층: ");
		int floorCount = sc.nextInt();
		System.out.print("방: ");
		int roomCountPerFloor = sc.nextInt();
		rooms = new Room[floorCount][roomCountPerFloor];
		initializeRooms();
	}

	private void initializeRooms() {
		for(int i=0; i<rooms.length; i++) {
			for(int j=0; j<rooms[i].length; j++) {
				rooms[i][j] = new Room(makeRoomNumber(i, j), null, true, null, null);
			}
		}
	}

	private String makeRoomNumber(int f, int r) {
		return String.valueOf(f+1) + (r < 9 ? "0" : "") + String.valueOf(r+1);
	}	
	
//	public Hotel(int i, int j) {
//		rooms = new Room[i][j];
//		for(int k=0; k<i; k++) {
//			for(int m=0; m<j; m++) {
//				rooms[k][m] = new Room(k, m);
//			}
//		}
//	}

	public void goFrontDest() {
		int menu = 0;
		boolean flag = true;
		
		while (flag) {
			System.out.println("\n====================== 호텔 관리 메뉴 =====================");
			System.out.println("1:객실현황 2:입실 3:퇴실 4:객실상세조회 5:투숙객리스트 6:투숙객조회 Etc:종료");
			System.out.println("-------------------------------------------------------------");
			System.out.print(">>>>>>>>>>>>>>>>>>>>>>>> 메뉴 선택 >>>>>>>>>>>>>>>>>>>>>>>>>> ");
			menu = sc.nextInt();
			
			flag = choiceMenu(menu);
		}
		System.out.println("프로그램을 종료합니다");
	}

	private boolean choiceMenu(int menu) {
		switch (menu) {
		case 1:
			viewRoomsStatus();
//			for(int k=0; k<rooms.length; k++) {
//				for(int m=0; m<rooms[k].length; m++) {
//					rooms[k][m].getRoomInfo();
//				}
//				System.out.println();
//			}
			break;
		case 2:
			System.out.print("입실할 호수 입력: ");
			roomNumCheckIn(sc.next());
//			int[] arr = inputRoomNum();
//			
//			if(check(arr[0], arr[1])==true) {
//				rooms[arr[0]][arr[1]].checkIn();
//			}
			break;
		case 3:
			System.out.print("퇴실할 호수 입력: ");
			roomNumCheckOut(sc.next());
//			System.out.print("퇴실할 호수 입력: ");
//			arr = inputRoomNum();
//			
//			if(check(arr[0], arr[1])==true) {
//				rooms[arr[0]][arr[1]].checkOut();
//			}
			break;
		case 4:
			System.out.print("상세조회할 호수 입력: ");
			getRoomDetail(sc.next());
//			arr = inputRoomNum();
//			
//			if(check(arr[0], arr[1])==true) {
//				rooms[arr[0]][arr[1]].getRoomInfoDetail();
//			}
			break;
		case 5:
			getUserList();
//			System.out.print("투숙객 조회할 방 호수 입력: ");
//			arr = inputRoomNum();
//			if(check(arr[0], arr[1])==true) {
//				rooms[arr[0]][arr[1]].getUserInfo();
//			}
			break;
		case 6:
			System.out.print("투숙객 이름 입력: ");
			String name = sc.next();
			searchUser(name);
			break;
		default:
			return false;
		}
		return true;
	}

	private void searchUser(String name) {
		for (Room[] roomsArr : rooms) {
			for(Room room: roomsArr) {
				if(room.getUser()!=null) {
					if(name.equals(room.getUser().getName())) {
						System.out.println(room + " " + room.getUser());
					}
				}
			}
		}
	}

	private void getUserList() {
		System.out.println("투숙객리스트");
		for (Room[] roomsArr : rooms) {
			for(Room room: roomsArr) {
				if(!room.isEmpty()) {
					System.out.println(room.getRoomNum() + "호: " + room.getUser());
				}
			}
		}
	}

	private void getRoomDetail(String roomNum) {
		int[] fr = getIndexOfFloorAndRoom(roomNum);
		int floor = fr[0];
		int room = fr[1];
		System.out.println(rooms[floor][room]); //toString 메서드를 선언해놓으면 객체를 부를 때 자동으로 작동함
//		System.out.println(rooms[floor][room].toString());
	}

	private void roomNumCheckOut(String roomNum) {
		int[] fr = getIndexOfFloorAndRoom(roomNum);
		int floor = fr[0];
		int room = fr[1];
		
		if(!rooms[floor][room].isEmpty()) {
			rooms[floor][room].setEmpty(true);
			rooms[floor][room].setUser(null);
			rooms[floor][room].setCheckInTime(null);
			rooms[floor][room].setCheckOutTime("???");
			System.out.println(roomNum + "퇴실완료");
		}
		else {
			System.out.println(roomNum + "빈 방");
		}
	}

	private int[] getIndexOfFloorAndRoom(String roomNum) {
		int room = 0;
		int floor = Integer.parseInt(roomNum.substring(0, 1))-1;
		
		if(roomNum.charAt(1)=='0') {
			room = Integer.parseInt(roomNum.substring(roomNum.length()-1))-1;
		}
		else {
			room = Integer.parseInt(roomNum.substring(roomNum.length()-2))-1;
		}
		return new int[] {floor, room};
	}

	private void roomNumCheckIn(String roomNum) {
		int[] fr = getIndexOfFloorAndRoom(roomNum);
		int floor = fr[0];
		int room = fr[1];
		if(rooms[floor][room].isEmpty()) {
			rooms[floor][room].setEmpty(false);
			User user = getUserInfo();
			rooms[floor][room].setUser(user);
			rooms[floor][room].setCheckInTime("???");
			rooms[floor][room].setCheckOutTime(null);
			System.out.println(roomNum + "입실완료");
		}
		else {
			System.out.println(roomNum + "사용중");
		}
	}

	private User getUserInfo() {
		System.out.print("투숙객 정보 입력");
		System.out.print("이름: ");
		String name = sc.next();
		System.out.print("나이: ");
		int age = sc.nextInt();
		System.out.print("성별: ");
		char gen = sc.next().charAt(0);
		return new User(name, age, gen);
	}

	private void viewRoomsStatus() {
		for(int i=0; i<rooms.length; i++) {
			for(int j=0; j<rooms[i].length; j++) {
				System.out.print(rooms[i][j].getRoomNum() + "호: ");
				System.out.print(rooms[i][j].isEmpty() ? "빈방 " : "사용 중");
				System.out.print("\t");
			}
			System.out.println();
		}
	}

//	int[] inputRoomNum() {
//		Scanner sc = new Scanner(System.in);
//		int roomNum = sc.nextInt();
//		int[] arr = {roomNum/100-1, roomNum%100-1};
//		return arr;
//	}
//	
//	boolean check(int i, int j) {
//		if(!(i<rooms.length && j<rooms[0].length && i>=0 && j>=0)) {
//			System.out.println("존재하지 않는 방입니다.");
//			return false;
//		}
//		return true;
//	}
}