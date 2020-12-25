package FinalPrograms;

public class ArrayMaxNumberJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {2,8,7,1,10,2};
		
		int Max = a[0];
		
		for (int i =0;i<a.length;i++) {
			
			for (int j=i+1;j<a.length-1;j++) {
				if(Max<a[j])
					Max=a[j];
			}
		}
		System.out.println(Max);
		
		
	}

}
