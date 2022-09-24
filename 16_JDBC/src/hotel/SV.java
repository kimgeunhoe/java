package hotel;

import java.util.List;

public interface SV {
	void buildHotel();
	void makeroom(int f, int r);
	List<Room> roomList();
	int checkIn(String rno, String guest_name, String guest_tel, int guest_age, int guest_gen);
	int checkOut(String rno);
	Room detail(String rno);
	List<Room> userList();
	Room searchUser(String guest_name);
}
