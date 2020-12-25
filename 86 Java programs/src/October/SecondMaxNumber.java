package October;

import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

public class SecondMaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {6,2,62,5,1};
		
		int firstmax = a[0];
		int secndmax = a[0];
		
		for(int i=0;i<a.length;i++)
			for (int j=i+1;j<a.length;j++) {
				if(firstmax<a[j]) {
					firstmax=a[j];
				}
			}
		
		System.out.println(firstmax);
		
		Arrays.toString(a);
		a = ArrayUtils.remove(a, 2);
		System.out.println(Arrays.toString(a));
		
		
		for(int i=0;i<a.length;i++)
			for (int j=i+1;j<a.length;j++) {
				if(secndmax<a[j]) {
					secndmax=a[j];
				}
			}
		System.out.println(secndmax);
		
		
		
		
	}

}
