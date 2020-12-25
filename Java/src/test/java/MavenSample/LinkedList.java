package MavenSample;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,2,3,4,6,6,7,8,9,9};
		int temp[] = {};
		for(int i =0; i<a.length-1;i++) {
			
			for (int j=0;j<a.length;j++) {
				
				if(a[j]!=a[j+1]) {
					temp[]=a[j];
				}
			}

			}
	

	}

}
