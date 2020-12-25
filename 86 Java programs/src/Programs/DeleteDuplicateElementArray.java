package Programs;

import java.util.Arrays;

public class DeleteDuplicateElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,2,2,3,5,4,5,9,6,7,9};
		int n = a.length;
//outer loop is for each traversing each element
// inner loop is for comparing each element with next element
// if both are same then replace the next element with the last element of array		
		for  (int i =0;i<n-1;i++) {
			for (int j=i+1;j<n;j++) {
				if(a[i]==a[j]) {
					a[j]=a[n-1];
					n--;
				}
			}
		}

		for (int i=0;i<n;i++)
			System.out.print(a[i]+"  ");
		
		
	}

}
