package question05;

public class ReturnArray2 {
	public static void main(String[] args) {
		int[] array2=makeArray();
		for (int i = 0; i < array2.length; i++) {
			array2[i]=array2[i]+100;
		}
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i]+" ");
		}
	}
	public static int[] makeArray() {
		int[] array=new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i]=i+1;
		}
		return array;
	}
}
