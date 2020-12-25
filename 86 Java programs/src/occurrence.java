import java.util.HashMap;

public class occurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[] = {1, 2, 3, 0, 1, 2, 3, 4, 2, 3, 0, 2, 5, 6};
		
		HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
		
		for ( int i:arr) {
			
			if(hmap.containsKey(i)){
				hmap.put(i, hmap.get(i)+1);
			}
			else hmap.put(i, 1);
		}
		
		System.out.println(hmap);
	}

}
