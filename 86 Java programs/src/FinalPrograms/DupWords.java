package FinalPrograms;

import java.util.ArrayList;
import java.util.List;

public class DupWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "Learning this programming by a this writing a the the programs";
		
		String words[] = a.split(" ");
		List<String> dup = new ArrayList<String>();
		
		for (int i =0;i<words.length-1;i++) {
			
			for (int j =i+1;j<words.length-1;j++) {
				
				if(words[i].equals(words[j])) {
					dup.add(words[i]);
				}
			} 
		}
		
		System.out.println(dup);
	}

}
