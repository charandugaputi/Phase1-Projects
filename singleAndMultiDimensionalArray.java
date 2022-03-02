package javaPhase1;

public class singleAndMultiDimensionalArray {

	public static void main(String[] args) {
		
		int[] singleDimentional = {1,2,3,4,5,6,7,8,9};
		System.out.println("Elements in single dimentional array are ");
		for (int i=0;i<9;i++)
			System.out.print(singleDimentional[i]+ " ");
		
		int[][] multiDimentional = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println();
		System.out.println("Elements in multi dimentional array are ");
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(multiDimentional[i][j]+ " ");
			}
			System.out.println();
		}
	}

}