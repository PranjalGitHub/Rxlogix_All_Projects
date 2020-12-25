package FinalPrograms;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 9;
		boolean flag = true;
		
		for (int i = 2;i<a/2;i++) {
			if(a%i==0)
				flag= false;
				break;
			
		}
			if(flag)
				System.out.println("No. is prime");
			else
				System.out.println("Not a prime");
				
		
		
		
	}

}
