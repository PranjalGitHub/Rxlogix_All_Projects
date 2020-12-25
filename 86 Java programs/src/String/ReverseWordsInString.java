package String;

public class ReverseWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "I Love programming";
		String Newstr ="";
		String[] a = str.split(" ");
		
		
		for (int i=a.length-1;i>=0;i--) {
			 Newstr =  Newstr + a[i]+" ";
		}
		
		System.out.println(Newstr);
	}

}
