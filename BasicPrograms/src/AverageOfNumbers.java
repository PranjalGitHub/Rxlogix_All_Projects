import java.util.Scanner;

public class AverageOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int average = 0;
		int b = 0;
		int sum = 0;
		for(int i = 1; i<=50; i++) {
			
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			sum = sum + a;
			
			average  = sum/i;
			 
			System.out.println("Average of the numbers is " + average);
		}
		
		;
	}

}
