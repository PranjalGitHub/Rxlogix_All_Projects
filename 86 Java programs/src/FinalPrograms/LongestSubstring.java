package FinalPrograms;

public class LongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "Learning programming by writing programsdddddd";
		
		String words[] = a.split(" ");
		int MaxLengthSubstring = words[0].length();
		String MaxSubstring = words[0];


		System.out.println(words[0].length());
		
		for (int i=0;i<words.length;i++)
			if(MaxLengthSubstring<words[i].length())
			{
				MaxLengthSubstring = words[i].length();
				
				
				MaxSubstring = words[i];
		
			}
		
		System.out.println(MaxSubstring);
	}

}
