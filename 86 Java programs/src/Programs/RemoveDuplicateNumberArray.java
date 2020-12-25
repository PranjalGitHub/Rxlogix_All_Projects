package Programs;

public class RemoveDuplicateNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a [] = {2,34,6,8,2,3,7,8};
		int temp[] = new int[10];
		int count = 0;
		for(int i=0;i<a.length;i++) {
			
			for (int j=0;j<a.length;j++) {
				if (a[i]!=a[j])
				 {temp[count] = a[i];
				count++;
				}
			}
		}
		for(int i=0;i<temp.length;i++)
			System.out.println(temp[i]);
		
	}

}
