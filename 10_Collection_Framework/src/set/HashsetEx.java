package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class User {
	String name;
	int age;
	
	User(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name + ": " + age;
	}
}

public class HashsetEx {

	public static void main(String[] args) {
		Set<User> set = new HashSet<>();
		
		set.add(new User("park", 44));
		set.add(new User("kim", 23));
		set.add(new User("lee", 56));
		
		System.out.println(set);
		
		Iterator<User> iterator = set.iterator();
		while(iterator.hasNext()) {
			User user = (User)iterator.next();
			System.out.println(user);
		}
		System.out.println("---------------");
		
		for(User user : set) {
			System.out.println(user);
		}
	}

}
