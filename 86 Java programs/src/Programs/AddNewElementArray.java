package Programs;

import java.util.Arrays;

public class AddNewElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,2,3,4,5,6,7};
		int n = a.length;
		int temp[] = new int[n+1];
		for (int i = 0; i<a.length;i++) {
			temp[i]=a[i];
		}
		temp[n] = 60;
		System.out.println(Arrays.toString(temp));
		
	}

}
