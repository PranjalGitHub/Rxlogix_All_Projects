package FinalPrograms;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 1111119991;
		int digits = 0;
		int SumOfDigit = 0;
		
		
		
		while(num!=0) {
			digits = num%10;
		num = num/10;
		SumOfDigit = SumOfDigit+digits;
		}
		
		System.out.println(SumOfDigit);
	}

}
