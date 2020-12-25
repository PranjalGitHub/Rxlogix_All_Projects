package Programs;

public class LargestElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a[] = {"Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC"};
		
		String LargeElement = a[0];
		System.out.println(a[2].length());
		for (int i =0;i<a.length;i++) {
			if(LargeElement.length()<a[i].length()) {
				LargeElement = a[i];
			}
				
			}
			System.out.println(LargeElement);
		}
	}


