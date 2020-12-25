package FinalPrograms;

public class LongestSubstringWithNoDuplicateChar {

	public static void main(String[] args) {

			String a = "Learning programming by writing programs";
			
			String words[] = a.split(" ");
			int MaxLengthSubstring = words[0].length();
			String MaxSubstring = words[0];
		

			System.out.println(words[0].length());
			
			for (int i=0;i<words.length;i++)
				if(MaxLengthSubstring<words[i].length())
				{
					MaxLengthSubstring = words[i].length();
					
					for(int j=i+1;j<words[i].length();j++)
						if(words[i].charAt(i)==words[i].charAt(i+1));
					MaxSubstring = words[i];
			
				}
		
			
			System.out.println(MaxSubstring);
		}
	}


