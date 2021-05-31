package matrix;

import java.util.Random;

public class matrix {

	double[][] matrix = new double[50][10];

	
	
	public static void main(String[] args) {
		matrix mat = new matrix();
		
		mat.matrixmaken();
		
		
	}
	
	
	public void matrixmaken() {
		

		Random r=new Random();
		
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				
				matrix[i][j]=r.nextInt(20);
				System.out.print(matrix[i][j] + ", ");
			}
			System.out.println();
		}
	}
}