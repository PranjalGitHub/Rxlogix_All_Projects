package FinalPrograms;
import java.util.HashMap;
import java.util.Map;

public class CharOccurence2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Pranjal is learning Automatioin";
		
		char letters[] = s.toCharArray();
		
		Map<Character,Integer> hmap = new HashMap<Character,Integer>();
		
		for (char c :letters) {
			
			if(hmap.containsKey(c)) {
				hmap.put(c, hmap.get(c)+1);
			}
			else hmap.put(c, 1);
		}
		
		System.out.println(hmap);
		
	}

}
