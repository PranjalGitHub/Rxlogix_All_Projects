import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String original, reverse = "";
		Scanner in = new Scanner(System.in);
		original = in.nextLine();
		
		for (int i=original.length()-1;i>=0;i--) {
			  reverse = reverse+original.charAt(i);
			  }
		System.out.println("Reverse of the string: " + reverse);
	}
	}
