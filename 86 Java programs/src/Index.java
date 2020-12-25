
public class Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] matrix ={{10, 20, 30, 40}, {15, 25, 35, 45}, {27, 29, 37, 48},{32, 33, 39, 50}};
		
		for (int i = 0;i<matrix.length;i++) {
			
			for (int j = 0; j<matrix.length;j++) {
				
				if(matrix[i][j] == 33) {
					
					System.out.println(i+","+j);
				}
				
				
			}
		}
		
		
		
		
	}

}
