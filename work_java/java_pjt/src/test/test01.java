package test;

public class test01 {
	public static void main(String[] args) {
		int[][] intArray=new int[3][4];
		int sum=0;
		for (int col = 0; col < intArray.length; col++) {
			for (int row = 0; row < intArray[col].length; row++) {
				intArray[col][row]=(int)(Math.random()*10);
				sum+=intArray[col][row];
				System.out.print(intArray[col][row]+"\t");
			}
			System.out.println();
		}
		System.out.println("합은 "+sum);
	}
}
