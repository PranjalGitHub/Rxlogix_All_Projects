package String;

import java.util.List;

public class RemoveSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "I      love    programming     ";
		
		String newstr = str.replaceAll("\\s+", " ").trim();
			System.out.println(newstr);
			
		}
		
		
	
	
}


