package quiz;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		//테스트에 참여할 인원수를 입력
		//1번째 사람의 이름을 입력
		//1번째 사람의 국어점수
		//1번째 사람의 영어점수
		//1번째 사람의 수학점수
		//2, 3반복
		
		//이름 국어 영어 수학 총점 평균
		//ㅁㅁ 88  88  88  88  88
		Scanner sc = new Scanner(System.in);
		System.out.print("인원수: ");
		int num = sc.nextInt();
		String[][] arr = new String[num][4];
		
		for(int i=0; i<num; i++) {
			System.out.printf("%d번째 사람 이름: ", i+1);
			arr[i][0] = sc.next();
			System.out.printf("%d번째 사람 국어점수: ", i+1);
			arr[i][1] = sc.next();
			System.out.printf("%d번째 사람 영어점수: ", i+1);
			arr[i][2] = sc.next();
			System.out.printf("%d번째 사람 수학점수: ", i+1);
			arr[i][3] = sc.next();
		}
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		
		for(int i=0; i<num; i++) {
			int sum = Integer.parseInt(arr[i][1]) + Integer.parseInt(arr[i][2]) + Integer.parseInt(arr[i][3]);
			System.out.printf("%s\t%s\t%s\t%s\t%d\t%f", arr[i][0], arr[i][1], arr[i][2], arr[i][3], sum, (float)sum/3);
			System.out.println();
//			DecimalFormat df = new DecimalFormat("#.##");
//			System.out.println(df.format((float)sum/3));
			
//			int rank = 1;
//			for(int r=0; r<num; r++) {
//				if(sum[i] < sum[r]) {
//					rank++;
//				}
//			}
//			System.out.println(rank); //처음에 배열에 저장했으면 이런 식으로 순위 작성 가능
		}
	}

}
