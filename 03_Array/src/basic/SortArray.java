package basic;

public class SortArray {

	public static void main(String[] args) {
		int[] intArr = new int[12];
		//intArr에 랜덤정수를 넣고 순차정렬과 역정렬을 구현해보세요
		int temp = 0;
		
		for(int i=0; i<intArr.length; i++) {
			intArr[i] = (int)Math.floor(Math.random()*100 + 1);
			System.out.print(intArr[i] + " ");
		}
		System.out.println();
		
		for(int i=0; i<intArr.length-1; i++) {
			for(int j=i+1; j<intArr.length; j++) {
				if(intArr[i] > intArr[j]) {
					temp = intArr[i];
					intArr[i] = intArr[j];
					intArr[j] = temp;
				}
			}
		}
		
		for(int i=0; i<intArr.length; i++) {
			System.out.print(intArr[i] + " ");
		}
		System.out.println();
		
		for(int i=0; i<intArr.length-1; i++) {
			for(int j=i+1; j<intArr.length; j++) {
				if(intArr[i] < intArr[j]) {
					temp = intArr[i];
					intArr[i] = intArr[j];
					intArr[j] = temp;
				}
			}
		}
		
		for(int i=0; i<intArr.length; i++) {
			System.out.print(intArr[i] + " ");
		}
	}

}
