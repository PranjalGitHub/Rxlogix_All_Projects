package PracticePrograms;

public class LongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "Programming is fun";
		String unique = "";
		String words[] = a.split(" ");
		
		for (int i=0;i<words.length;i++) {
			
			for(int j=0;j<words[i].toCharArray().length;j++) {
				
				for (int k =0;k<words[j].toCharArray().length;j++) {
				if(words[j].charAt(k)!=words[j].charAt(k)) {
					unique = words[i];
				}
			}
		}
	}
System.out.println(unique);
}
}
