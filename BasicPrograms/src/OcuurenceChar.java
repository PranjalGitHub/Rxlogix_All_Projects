import java.util.Scanner;

public class OcuurenceChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String original; int count = 0;
		Scanner in = new Scanner(System.in);
		original = in.nextLine();
		
		for (int i=0;i<original.length();i++) {
			if(original.charAt(i)=='a') {
				count++;
			}
			
		}
		System.out.println("The occurence of char 'A' in string is:" +count);
	}

}
