package FinalPrograms;

public class FindDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "This this is a free free code";
		String repeatedword = "";
		
		String a[] = str.split(" ");
				for (int i=0;i<=a.length-1;i++) {
					if(a[0]==a[i]) {
						repeatedword = a[i];
						
					}
				}
				System.out.println(repeatedword);
		
	}

}
