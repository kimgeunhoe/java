package quiz;

public class Method3 {

	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			System.out.print(fibo(i) + " ");
		}
		System.out.println("\n");
	}

	private static int fibo(int i) {
		if(i==0 || i==1) {
			return 1;
		}
		else {
			return fibo(i-2) + fibo(i-1);
		}
	}
}
