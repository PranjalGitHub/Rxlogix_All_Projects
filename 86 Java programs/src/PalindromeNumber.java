
public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 131;
		int rev = 0;
		int actualnum = num;
		
		while (num!=0) {
			int n = num%10;
			rev = rev*10+n;
			num = num/10; 
			}
		System.out.println(rev);
		if(rev==actualnum)
			System.out.println("Number is a palindrome");
		else 
			System.out.println("Number is not a palindrome");
	}

}
