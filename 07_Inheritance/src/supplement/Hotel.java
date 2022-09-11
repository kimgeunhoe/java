package supplement;

public class Hotel {

	public static void main(String[] args) {
//		//테스트로 룸을 세팅해보자
//		Room room = new Room("1호실", true, null, null);
//		System.out.println(room); //출력결과는? 
//		
//		String roomNum = room.getRoomNum();
//		System.out.println(roomNum);
//		
//		String[] amenities = new String[3];
//		amenities[0] = "삼푸";
//		amenities[1] = "바디워시";
//		amenities[2] = "린스";
//		System.out.println("1: " + amenities); //출력결과는?
//		
//		room.setAmenities(amenities);
//		
//		for(String amenity: room.getAmenities()) {
//			System.out.println(amenity);
//		}
//		System.out.println("2: " + room.getAmenities()); //출력결과는?
		
		Room[] rooms = new Room[10];
		
		for(int i=0; i<rooms.length; i++) {
			rooms[i] = new Room(i+"호", true, null, null);
		}
		
		for (Room room : rooms) {
			System.out.println(room); //출력결과는?
			System.out.println(room.getRoomNum()); //출력결과는?
		}
		
		rooms[0].setUser(new User());
		System.out.println(rooms[0].getUser()); //출력결과는?
		
		User user1 = new User("kim", 34, "m", 0);
		User user2 = new User("lee", 36, "f", 1);
		User user3 = new User("park", 24, "f", 3);
		
		rooms[1].setUser(user1);
		rooms[2].setUser(user2);
		rooms[3].setUser(user3);
		
		rooms[3].getUser(); //출력결과는? 주소값
		System.out.println(rooms[3].getUser().getName()); //출력결과는?
	}

}
