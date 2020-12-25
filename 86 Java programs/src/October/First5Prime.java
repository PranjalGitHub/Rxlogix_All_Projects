package October;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class First5Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num =3;
boolean flag = true;

		for (int i = 1;i<10;i++) {
			for (int j=2;j<i/2;j++) {
				if(i%j==0) {
					flag=false;
				break;}
				
				}
			if (flag=true)
				System.out.print(i+" ");
			}	
		
	}

}
