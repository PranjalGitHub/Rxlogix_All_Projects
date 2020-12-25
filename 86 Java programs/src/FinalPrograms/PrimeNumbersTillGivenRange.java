package FinalPrograms;

public class PrimeNumbersTillGivenRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Range = 10;
		
		int num=0;
		
		for (int i=Range;i>=2;i--) {
			
		for  (int j =2;j<=Range/2;j++) {
			if(Range%j==0) {
				
				Range--;
			}
			else {System.out.println(Range+"is a prime");
			
			Range--;
		}
		}
	}

	}
}
