package FinalPrograms;

public class ArrayMaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,112,9,5,6,7};
		int max=a[0];
		int SecondMax=a[0];
		for (int i = 0;i<a.length;i++) {
			if(max < a[i])
				 max = a[i];

		}
	System.out.println(max);	
	}

}
