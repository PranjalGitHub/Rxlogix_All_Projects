package Programs;

public class CovertIntoCamelCasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "learning Automation is Fun";
		String Newstr = "" ; 
		
	String words[]	= str.split(" ");
		for(int i =0;i<words.length;i++) {
	   if(!Character.isUpperCase(words[i].charAt(0))) {
		 words[i] = words[i].replace(words[i].charAt(0), Character.toUpperCase(words[i].charAt(0)));
		 Newstr = Newstr + " "+words[i];
	   }
	   else Newstr = Newstr+" "+words[i];
	   }
		
		System.out.println(Newstr);
	}

}
