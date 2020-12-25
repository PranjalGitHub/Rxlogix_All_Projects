package Programs;

public class MaxNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {12,3,5,7,8,1,10};
		int MaxNumber = a[0];
		
		for(int i = 0;i<a.length;i++) {
			if(MaxNumber<a[i]) {
				MaxNumber = a[i];
			}
		}
		System.out.println(MaxNumber);
	}

}
