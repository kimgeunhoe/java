package hotel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Service implements SV{
	private Connection conn;
	private PreparedStatement pst;
	private String query = "";
	private int ck;
	
	public Service() {
		DatabaseConnector dbc = DatabaseConnector.getInstance();
		conn = dbc.getConnection();
	}
	
	@Override
	public void buildHotel() {
		System.out.println("호텔 시스템 시작");
		query = " create table if not exists room ("
				+ "rno varchar(4) primary key, "
				+ "guest_name varchar(100), "
				+ "guest_tel varchar(20), "
				+ "guest_age int(3), "
				+ "guest_gen tinyint(1), "
				+ "is_empty tinyint(1) default 0, "
				+ "check_in_time datetime, "
				+ "check_out_time datetime"
				+ ");";
		try {
			pst = conn.prepareStatement("drop table if exists room;");
			pst.executeUpdate();
			pst = conn.prepareStatement(query);
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void makeroom(int f, int r) {
		query = "insert into room (rno) values(?)";
		try {
			for(int i=1; i<=f; i++) {
				for(int j=1; j<=r; j++) {
					String rNum = String.valueOf(i) + (j < 10 ? "0" : "") + String.valueOf(j);
					pst = conn.prepareStatement(query);
					pst.setString(1, rNum);
					pst.executeUpdate();
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public List<Room> roomList() {
		query = "select rno, is_empty from room";
		List<Room> list = new ArrayList<>();
		try {
			pst = conn.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				list.add(new Room(rs.getString("rno"), rs.getInt("is_empty")));
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int checkIn(String rno, String guest_name, String guest_tel, int guest_age, int guest_gen) {
		ck = checkUseRoom(rno);
		if(ck==0) {
			query = "update room set is_empty = 1, guest_name = ?, guest_tel = ?, guest_age = ?, guest_gen = ?, check_in_time = now(), check_out_time = null"
					+ " where rno = ?";
			try {
				pst = conn.prepareStatement(query);
				pst.setString(1, guest_name);
				pst.setString(2, guest_tel);
				pst.setInt(3, guest_age);
				pst.setInt(4, guest_gen);
				pst.setString(5, rno);
				return pst.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		else if(ck==1) {
			System.out.println("이미 사용중인 방입니다.");
		}
		return 0;
	}

	@Override
	public int checkOut(String rno) {
		ck = checkUseRoom(rno);
		if(ck==1) {
			query = "update room set is_empty = 0, guest_name = null, guest_tel = null, guest_age = null, guest_gen = null, check_in_time = null, "
					+ "check_out_time = now() where rno = ?";
			try {
				pst = conn.prepareStatement(query);
				pst.setString(1, rno);
				return pst.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		else if(ck==0) {
			System.out.println("이미 빈 방입니다.");
		}
		return 0;
	}
	
	private int checkUseRoom(String rno) {
		query = "select * from room where rno = ?";
		try {
			pst = conn.prepareStatement(query);
			pst.setString(1, rno);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {				
				return rs.getInt("is_empty");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}

	@Override
	public Room detail(String rno) {
		query = "select rno, is_empty, check_in_time, check_out_time from room where rno = ?";
		try {
			pst = conn.prepareStatement(query);
			pst.setString(1, rno);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				return new Room(rs.getString("rno"), rs.getInt("is_empty"), rs.getString("check_in_time"), rs.getString("check_out_time"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Room> userList() {
		query = "select rno, is_empty, guest_name from room";
		List<Room> list = new ArrayList<>();
		try {
			pst = conn.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				list.add(new Room(rs.getString("rno"), rs.getInt("is_empty"), rs.getString("guest_name")));
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Room searchUser(String guest_name) {
		query = "select rno, guest_name, guest_tel, guest_age, guest_gen, check_in_time from room where guest_name = ?";
		try {
			pst = conn.prepareStatement(query);
			pst.setString(1, guest_name);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				return new Room(rs.getString("rno"), rs.getString("guest_name"), rs.getString("guest_tel"),
						rs.getInt("guest_age"), rs.getInt("guest_gen"),rs.getString("check_in_time"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}