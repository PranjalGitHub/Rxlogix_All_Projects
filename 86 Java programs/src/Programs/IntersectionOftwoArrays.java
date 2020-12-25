package Programs;

public class IntersectionOftwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] inputArray1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};
		  
        String[] inputArray2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};
        
        String[] Intersect = new String[5];
        int count=0;
        
        for(int i=0;i<inputArray1.length;i++)
        	for(int j=0;j<inputArray2.length-1;j++) {
        		
        		if(inputArray1[i]==inputArray2[j]) {
        			Intersect[count] =inputArray1[i];
        			count++;
        		}
        	}
     for (int i = 0;i<Intersect.length;i++)
    	 System.out.println(Intersect[i]);

	}

}
