package Programs;

import java.util.HashMap;

public class CharOccurrence {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Learning automation is a fun";
		
	char strarray[]=	str.toCharArray();
	
	HashMap<Character,Integer> hmap = new HashMap<Character,Integer>();
	
	for( char i :strarray) {
		
		if(hmap.containsKey(i)) {
			hmap.put(i, hmap.get(i)+1);
		}
		else hmap.put(i,1);
	}
		System.out.println(hmap);
		
	}
}
