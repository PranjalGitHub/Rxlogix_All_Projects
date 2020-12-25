import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		int count =0;
		
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
	
		while(n!=0) {
			n=n/10;
			count++;
		}
		
		System.out.println("digit of the numbers are: " +count);
		
	}

}
