package Programs;

import java.util.Arrays;

public class DeleteElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,2,3,4,5,6,7};
		int DelElement = 3;
		
		for (int i=0;i<a.length;i++) {
			if(a[i]==DelElement) {
				for (int j=i;j<a.length-1;j++) {
					a[j]=a[j+1];
				}
				break;
			}
		}
		for(int i =0;i<a.length-1;i++) {
			System.out.println(a[i]);
		}
	}

}
