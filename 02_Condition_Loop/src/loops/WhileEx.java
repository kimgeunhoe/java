package loops;

public class WhileEx {

	public static void main(String[] args) {
		//1부터 20까지 합 구하기 while이용하기
		int i = 1;
		int sum = 0;
		while(i <= 20) {
			sum += i;
			i++;
		}
		System.out.printf("1부터 20까지 합: %d", sum);
		System.out.println("");
		
		//1부터 100까지 홀수의 합 구하기 do while이용하기
		int j = 0;
		int odd = 0;
		do {
			j++;
			if(j%2 == 1) {
				odd += j;
			}
		}while(j < 100);
		System.out.printf("1부터 100까지의 홀수의 합: %d", odd);
	}

}
