import java.util.HashMap;

public class CountWordsHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "Programming is good";
int count=0;

String k[] = str.split(" ");
  HashMap <Integer, String> words = new HashMap<Integer, String>();
  
  for (int i=0;i<k.length;i++) {
	  words.put(i, k[i]);
  count++;
  }
  System.out.println(count);
	}


}
