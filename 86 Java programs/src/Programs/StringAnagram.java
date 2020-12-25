package Programs;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "mary";
		String str2 = "army";
		
		char char1[]= str1.toLowerCase().toCharArray();
		char char2[]= str2.toLowerCase().toCharArray();
		
		Arrays.sort(char1);
		Arrays.sort(char2);
		
		if(Arrays.equals(char1,char2))
			System.out.println("Strings are anagram");
		
	}

}
