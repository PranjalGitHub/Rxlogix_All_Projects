package Programs;

import java.util.HashMap;

public class CharOccurenceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String  a= "Automation is a fun";
		char l[] = a.toCharArray();
		
		HashMap<Character,Integer> hmap = new HashMap<Character,Integer>();
		
		for (char i : l) {
			if(hmap.containsKey(i)) {
				hmap.put(i, hmap.get(i)+1);
			}
			else hmap.put(i, 1);
		}
		System.out.println(hmap);
	}

}
