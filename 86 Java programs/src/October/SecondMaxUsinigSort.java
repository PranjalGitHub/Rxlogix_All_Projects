package October;

import java.util.Arrays;

public class SecondMaxUsinigSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {6,2,62,5,1};
		int second;
		
		Arrays.sort(a);
		
		 second = a[(a.length-2)];
		 System.out.println(second);
	}

}
