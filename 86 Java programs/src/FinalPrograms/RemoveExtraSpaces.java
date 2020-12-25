package FinalPrograms;

public class RemoveExtraSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "Learning     programming    by   writing    programs";
		
		String ReplacedString = a.replaceAll("\\s+"," ");
		
		System.out.println(ReplacedString);
	}

}
