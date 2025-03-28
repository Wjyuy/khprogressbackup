package question04;

public class CoronaSum {
	public static void main(String[] args) {
		int[][] coronaArray= new int[12][3];
		int sum=0;
		for (int i = 0; i < coronaArray.length; i++) {
			for (int j = 0; j < coronaArray[i].length; j++) {
				coronaArray[i][j]=(i+1)*10+(j+1);
				sum+=coronaArray[i][j];
			}
		}
		System.out.println("1년 전체 코로나 환자수는 "+sum);
	}
}
