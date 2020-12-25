package October;

import java.util.HashMap;

public class CharOccurenceInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Programmming is fun";
	s = 	s.replaceAll(" ", "");
		char[] letters = s.toCharArray();
		
		HashMap<Character,Integer> hmap = new HashMap<Character,Integer>();
		
		for(char i:letters) {
			if(hmap.containsKey(i))
					hmap.put(i, hmap.get(i)+1);
			else hmap.put(i, 1);
		}
		
		System.out.println(hmap);
		
		
	}

}
