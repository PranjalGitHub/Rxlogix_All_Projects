import java.util.Scanner;

public class EvenOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
		
		if (n%2==0)
			System.out.println("Number is even");
		if (n%2!=0)
			System.out.println("Number is odd");
	}

}
