import java.util.HashSet;
import java.util.Set;

public class HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.util.HashMap<String, String> hmap1 = new java.util.HashMap<String, String>();
		
		
		hmap1.put("k1", "a");
		hmap1.put("k2", "b");
		
		java.util.HashMap<String, String> hmap2 = new java.util.HashMap<String, String>();
		
		hmap2.put("k1", "a");
		hmap2.put("k3", "a");
		
		HashSet<String> s = new HashSet<String>(hmap1.values());
		System.out.println(s);
		s.retainAll(hmap2.values());
		System.out.println(s);
		
		
	}

}
