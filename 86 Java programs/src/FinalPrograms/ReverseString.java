package FinalPrograms;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Pranjal";
		String revstr="";
		System.out.println(str.length());
		for (int i=str.length()-1;i>=0;i--)
			revstr = revstr+str.charAt(i);
		System.out.println("Reversed String is "+revstr);
		
		
		
	}

}
