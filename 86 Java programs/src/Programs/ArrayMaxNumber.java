package Programs;

public class ArrayMaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {2,4,5,6,7,1};
		int max= a[0];
		for (int i=0;i<a.length;i++) {
			if(a[0]<a[i])
				max= a[i];
		}
		
		System.out.println(max);
		
	}

}
