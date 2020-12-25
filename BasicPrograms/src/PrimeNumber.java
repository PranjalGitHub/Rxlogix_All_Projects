import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		n = s.nextInt();
		
		if(n%2==1)
			System.out.println("Number is prime");
	}

}
