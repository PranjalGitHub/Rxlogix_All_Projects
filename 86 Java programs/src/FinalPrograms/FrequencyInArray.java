package FinalPrograms;

public class FrequencyInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str[] = {"this","this","cover","letter"};
		int count = 1;
		
		for(int i =0;i<str.length;i++) {
			for (int j = i+1;j<str.length;j++) {
				if (str[i]==str[j])
					count++;
				
			}
			System.out.println(str[i]+"   "+count);
		
		
		
	}
		

}
}
