
public class Bubble {

	public static void main(String[] args) {	
	
		int [] matrix ={20, 10, 60, 5};//{10, 20, 60, 5}
		int temp;
		for (int i=0; i<matrix.length;i++) {
			
			for (int j=0;j<matrix.length-1;j++) {
				
				if(matrix[j]>matrix[j+1]) {
				temp=	matrix[j];
				matrix[j]= matrix[j+1];
				matrix[j+1] = temp;
					
				}
				
				
			}
			
			
		}
		
		
		  for (int k=0;k<matrix.length;k++) {
		  
		  System.out.print(matrix[k]+" ,"); }
		 
		
		
}

}