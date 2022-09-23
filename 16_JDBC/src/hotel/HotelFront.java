package hotel;

import java.util.List;
import java.util.Scanner;

public class HotelFront {
	private Scanner sc = new Scanner(System.in);
	private Service svc = new Service();
	private int r;
	
	public HotelFront() {
		svc.buildHotel();
		makeRoom();
		useHotel();
	}

	private void makeRoom() {
		System.out.print("층: ");
		int f = sc.nextInt();
		System.out.print("층당 방: ");
		r = sc.nextInt();
		svc.makeroom(f, r);
	}

	private void useHotel() {
		int menu = 0;
		boolean flag = true;
		
		while (flag) {
			System.out.print("\n1:객실현황 2:입실 3:퇴실 4:객실상세조회 5:투숙객리스트 6:투숙객조회 Etc:종료 ");
			menu = sc.nextInt();
			
			flag = choiceMenu(menu);
		}
		System.out.println("프로그램을 종료합니다");
	}

	private boolean choiceMenu(int menu) {
		switch (menu) {
		case 1:
			roomlist();
			break;
		case 2:
			checkIn();
			break;
		case 3:
			checkOut();
			break;
		case 4:
			detail();
			break;
		case 5:
			getUserList();
			break;
		case 6:
			userInfo();
			break;
		default:
			return false;
		}
		return true;
	}

	private void userInfo() {
		System.out.print("투숙객 이름 입력: ");
		Room room = svc.searchUser(sc.next());
		if(room!=null) {
			System.out.println(room.getGuest_name() + "님\n사용 중인 방: " + room.getRno() + "호\n연락처: " + room.getGuest_tel() + "\n나이: " + room.getGuest_age() 
			+ "세\n성별: " + (room.getGuest_gen()==1 ? "남" : "여") + "\n입실시간: " + room.getCheck_in_time());
		}
		else {
			System.out.println("해당 고객님은 투숙 중이 아닙니다.");
		}
	}

	private void getUserList() {
		List<Room> list = svc.userList();
		System.out.println("고객님 리스트");
		for (Room room : list) {
			if(room.getIs_empty()==1) {
				System.out.print(room.getRno() +"호: " + room.getGuest_name() + "님\n");
			}
		}
	}

	private void detail() {
		System.out.print("상세조회할 호수 입력: ");
		Room room = svc.detail(sc.next());
		if(room.getIs_empty()==0) {
			if(!(room.getCheck_in_time()==null && room.getCheck_out_time()==null)) {
				System.out.println(room.getRno() + "호\n빈 방. 퇴실시간: " + room.getCheck_out_time());
			}
			else {
				System.out.println(room.getRno() + "호\n빈 방. 사용 이력이 없습니다.");
			}
		}
		else {
			System.out.println(room.getRno() + "호\n사용중. 입실시간: " + room.getCheck_in_time());
		}
	}

	private void checkOut() {
		System.out.print("퇴실할 호수 입력: ");
		System.out.println("퇴실" + (svc.checkOut(sc.next())==1 ? "성공" : "실패"));
	}

	private void checkIn() {
		System.out.print("입실할 호수 입력: ");
		String rno = sc.next();
		System.out.println("고객님 정보 입력");
		System.out.print("이름: ");
		String guset_name = sc.next();
		System.out.print("전화번호: ");
		String guset_tel = sc.next();
		System.out.print("나이: ");
		int guset_age = sc.nextInt();
		System.out.print("성별(남성:1, 여성: 2): ");
		int guset_gen = sc.nextInt();
		int isOk = svc.checkIn(rno, guset_name, guset_tel, guset_age, guset_gen);
		System.out.println("입실" + (isOk==1 ? "성공" : "실패"));
	}

	private void roomlist() {
		int count = 0;
		List<Room> list = svc.roomList();
		for (Room room : list) {
			System.out.print(room.getRno() +"호 " + (room.getIs_empty()==0 ? "빈방 " : "사용중") + "\t");
			count++;
			if(count==r) {
				System.out.println();
				count = 0;
			}
		}
	}
}