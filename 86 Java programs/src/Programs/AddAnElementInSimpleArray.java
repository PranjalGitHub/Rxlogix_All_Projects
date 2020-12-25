package Programs;

import java.util.Arrays;

public class AddAnElementInSimpleArray {

	
	public static int[] addX(int n,int a[],int x) {
		
		int newarr[] = new int[n+1];
		
		for (int i = 0;i<a.length;i++) {
			newarr[i] = a[i];
		}
		
		newarr[n] = x; 
		
		return newarr;
	}
	
	public static void main(String[] args) {
		
		int givenarray[] = {1,2,4,5,6,7};
		int n = givenarray.length;
		int x = 50;
		System.out.println("InitialArray"+Arrays.toString(givenarray));
		int NewArray [] = AddAnElementInSimpleArray.addX(n, givenarray, x);
		System.out.println("NewArray"+Arrays.toString(NewArray));
		
	}
}
