package FinalPrograms;

import java.util.HashMap;

public class CharOccurrenceInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "Learning this this programming by a writing a the the programs";
		
		char[] strArray = a.toCharArray();
		
	HashMap<Character, Integer> Hmap= new HashMap<Character, Integer>();  
	
	for(char i :strArray ){
		if(Hmap.containsKey(i)) {
			Hmap.put( i, Hmap.get(i)+1);
		}
		 else
         {
             //If char 'c' is not present in charCountMap,
             //putting 'c' into charCountMap with 1 as it's value

			 Hmap.put( i, 1);
         }
	}
	
	System.out.println(a+"  : "+Hmap);
			
		}
		
	}

