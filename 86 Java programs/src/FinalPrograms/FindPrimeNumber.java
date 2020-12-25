package FinalPrograms;

import java.util.Scanner;

public class FindPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = true;
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		for (int i=2;i<num/2;i++) {
			if(num%i==0) {
				flag= false;
				break;
			}
			
		}
		if(flag==true)
			System.out.println("Number is prime");
		else System.out.println("Number is not prime");
		
		
	}

}
