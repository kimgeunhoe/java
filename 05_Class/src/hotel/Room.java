package hotel;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Room {
	private String roomNum;
	private User user = new User();
	private boolean empty;
	private String checkInTime;
	private String checkOutTime;
	Scanner sc = new Scanner(System.in);
	
	public Room() {
		
	}

	public Room(int i, int j) {
		roomNum = (j < 9) ? Integer.toString(i+1) + "0" + Integer.toString(j+1): Integer.toString(i+1) + Integer.toString(j+1);
		empty = true;
	}
	
	void getRoomInfo() {
		String check = empty==true ? "빈방 " : "사용 중";
		System.out.print(roomNum + "호 " + check + "\t");
	}

	String getTime() {
		SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return time.format(new Date());
	}
	
	void checkIn() {
		if(empty==false) {
			System.out.println("이미 사용 중인 방입니다.");
		}
		else {
			//user = new User();
			System.out.println("사용자의 신상");
			System.out.print("이름: ");
			String name = sc.next();
			System.out.print("나이: ");
			int age = sc.nextInt();
			System.out.print("성별(M/W): ");
			char gen = sc.next().charAt(0);
			user.setUserInfo(name, age, gen);
			empty = false;
			checkInTime = getTime();
			checkOutTime = "";
			System.out.println(roomNum + "호 입실이 완료되었습니다.");
		}
	}
	
	void checkOut() {
		if(empty==true) {
			System.out.println("이미 빈 방입니다.");
		}
		else {
			System.out.println(roomNum + "호 퇴실이 완료되었습니다.");
			user.delUserInfo();
			empty = true;
			checkInTime = "";
			checkOutTime = getTime();
		}
	}
	
	void getRoomInfoDetail() {
		System.out.print("방정보\n" + roomNum + "호. ");
		if(empty==true) {
			if(checkOutTime==null) {
				System.out.println("사용이력이 없습니다.");
			} 
			else {
				System.out.println("빈 방. 퇴실시간: " + checkOutTime);
			}
		}
		else {
			System.out.println("사용 중. 입실시간: " + checkInTime);
		}
	}
	
	void getUserInfo() {
		user.getUserInfo();
	}
}