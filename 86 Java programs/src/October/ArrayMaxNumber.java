package October;

public class ArrayMaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,112,9,5,6,7};
int max = a[0];
		for(int i =0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(max<a[j])
					max = a[j];
			}
		}
		System.out.println(max);
		
	}

}
