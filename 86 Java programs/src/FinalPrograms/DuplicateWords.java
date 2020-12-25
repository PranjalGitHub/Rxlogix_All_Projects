package FinalPrograms;

import java.util.ArrayList;
import java.util.List;

public class DuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Learning this this programming by a writing a the the programs";
		
		String words[] = a.split(" ");
		
		List<String> DupWord = new ArrayList();
		
		for (int i = 0; i<words.length-1;i++) {
			
			if (words[i].equals(words[i+1]))
				DupWord.add(words[i]);
				
			
		}
		
		System.out.println(DupWord);
		
		
		
		
		
	}

}
