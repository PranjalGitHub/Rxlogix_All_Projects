package Programs;

import java.util.HashMap;

public class WordOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Learning is a a this automation this is a fun";
		
		String words[] = str.split(" ");
		HashMap<String,Integer> hmap = new HashMap<String,Integer>();
		
		for(String i : words) {
			if(hmap.containsKey(i)) {
				hmap.put(i, hmap.get(i)+1);
			}
			else hmap.put(i, 1);
		}
		System.out.println(hmap);
	}

}
