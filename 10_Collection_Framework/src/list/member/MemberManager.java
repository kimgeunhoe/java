package list.member;

import java.util.ArrayList;

public class MemberManager {

	public static void main(String[] args) {
		ArrayList<Member> list = new ArrayList<>();
		MemberController mc = new MemberController();
		mc.processor(list);
	}

}
