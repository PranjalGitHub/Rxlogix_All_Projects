package Programs;

public class RemoveAllExtraSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "learning    Automation    is      Fun";
		
		String words[] = str.split("\\s+");
		for (String i :words) {
			System.out.print(i+" ");
		}
	}

}
