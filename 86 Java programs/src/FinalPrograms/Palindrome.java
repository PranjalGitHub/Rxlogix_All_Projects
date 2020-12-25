package FinalPrograms;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "madam";
		String revstr = "";
		
		for (int i =a.length()-1;i>=0;i--)
			revstr = revstr+a.charAt(i);
		
		System.out.println(revstr);
		if(a.equals(revstr))
			System.out.println("String is a Palindrome");
	}

}


