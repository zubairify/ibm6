
public class ArraysDemo {

	public static void main(String[] args) {
		
		int[] ar = {10, 20, 30, 40, 50};
		
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
		
		for (int i : ar) {
			System.out.println(i);
		}
		
		int[][] jag = { {1, 2}, {3,4,5}, {6,7,8,9} };
		
		for (int i = 0; i < jag.length; i++) {
			for (int j = 0; j < jag[i].length; j++) {
				System.out.print(jag[i][j] + "\t");
			}
			System.out.println();
		}
		
		for (int[] row : jag) {
			for (int i : row) {
				System.out.print(i + "\t");
			}
			System.out.println();
		}
		
		int[] sort = {4, 2, 5, 3, 1};
		
	}
}
