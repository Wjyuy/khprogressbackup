package question06;

public class BabySum {
	public static void main(String[] args) {
		int babyArray[][]=new int[120][5];
		int sum=0;
		for (int i = 0; i < babyArray.length; i++) {
			for (int j = 0; j < babyArray[i].length; j++) {
				babyArray[i][j]=(i+1)*100+(j+1);
				sum+=babyArray[i][j];
//				System.out.println(babyArray[i][j]);
			}
		}
		System.out.println("10년간 5개 나라의 총 신생아수는 "+sum);
	}
}
