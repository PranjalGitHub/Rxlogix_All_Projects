package PracticePrograms;

public class FirstTwoMaxArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,2,5,6,3,7,9,4,10};
		int firstmax=0;
		int secondmax=0;
		
		for(int i=0; i<a.length;i++) {
			for (int j=0;j<a.length;j++) {
				if(a[i]<a[j])
					firstmax = a[j];
			}
		}
		for(int i=0; i<a.length;i++) {
			for (int j=0;j<a.length;j++) {
				if(a[i]<a[j]&&a[j]!=firstmax)
					secondmax = a[j];
			}
		}
		System.out.println(firstmax);
		System.out.println(secondmax);
	}

}
