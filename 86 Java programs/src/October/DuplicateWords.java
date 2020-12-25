package October;

import java.util.HashMap;
import java.util.Set;

public class DuplicateWords{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s = "I am learning learning java java programming";
		String a[] = s.split(" ");
		
HashMap<String,Integer> hmap = new HashMap<String,Integer>();

for(String i:a) {
	if(hmap.containsKey(i)) {
		hmap.put(i, hmap.get(i)+1);
	
	}
	else hmap.put(i, 1);
}


for(String  word:hmap.keySet()) {
	if(hmap.get(word)>1) {
		System.out.println(word+" "+hmap.get(word));
	}
}

}
	}



