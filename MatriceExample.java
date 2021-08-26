public class MatriceExample {
    public static void main(String[] args) {
        // 2-D array
		int[][] matrix = new int[3][3];
		// initializing array
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				// assigning random numbers
				matrix[i][j] = (int)(Math.random() * 10);
			}
		}
		// Displaying array elements
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
        }
    }
}
