package creation;

public class Quiz1_1 {

	public static void main(String[] args) {
		//랜덤으로 정수 5개를 배열에 담는 메서드
		//그 배열을 전달받아 평균을 연산하는 메서드
		//정수 5개와 연산 결과를 출력하는 메서드
		//main메서드에는 어떠한 연산식도 있으면 안됨
		//메서드간 데이터 전달 및 호출만 있어야함
		
		print(arrAvg(makeArr()));	
	}

	private static void print(double avg) {
		System.out.println(avg);
	}

	private static double arrAvg(int[] arr) {
		double sum = 0;
		for (int i : arr) {
			sum += i;
		}
		return (double)sum/arr.length;
	}

	private static int[] makeArr() {
		int[] intArr = new int[5];
		for(int i=0; i<5; i++) {
			intArr[i] = (int)(Math.random()*11);
			System.out.print(intArr[i] + " ");
		}
		System.out.println();
		return intArr;
	}

}
