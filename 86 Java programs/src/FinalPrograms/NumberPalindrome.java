package FinalPrograms;

public class NumberPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 19733;
		int num = a;
		int LastDigit =0;
		String ReversedDigit="";
		
		while (num!=0) {
			LastDigit = num%10;
		num = num/10;
		ReversedDigit = ReversedDigit+Integer.toString(LastDigit);
		}
		System.out.println(ReversedDigit);
	}

}
