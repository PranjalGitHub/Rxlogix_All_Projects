package Programs;

public class CharOccurrenceWithoutCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "learning automation is fun";
		str = str.replace(" ", "");
		char letters[] = str.toCharArray();
		
		for(int i = 0;i<letters.length;i++) {
			int count = 0;
			for(int j=0;j<letters.length;j++) {
				
				if (j<i&&(letters[j]==letters[i])) {
					break;
				}
				if(letters[i]==letters[j]) {
					count++;
					
				}
				
			}
			if (count>0)
			System.out.println("Occurrence of  "+letters[i]+" is "+count);
		}
		
	}

}
