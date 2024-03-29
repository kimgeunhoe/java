package files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;

public class ObjectStreamOfFile {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = null;
		ObjectOutputStream oos = null;
		
		oos = new ObjectOutputStream(new FileOutputStream("obj.dat"));
		LocalDateTime now = LocalDateTime.now();
		System.out.println("생성시간: " + LocalDateTime.now());
		oos.writeObject(now);
		oos.flush();
		System.out.println("객체 만들기 완료");
		
		System.out.println("객체 읽기 시작");
		ois = new ObjectInputStream(new FileInputStream("obj.dat"));
		System.out.println((LocalDateTime)ois.readObject());
		System.out.println("객체확인시간: " + LocalDateTime.now());
		System.out.println("객체 출력 완료");
		
		if(oos!=null) {
			oos.close();
		}
		if(ois!=null) {
			ois.close();
		}
	}

}
