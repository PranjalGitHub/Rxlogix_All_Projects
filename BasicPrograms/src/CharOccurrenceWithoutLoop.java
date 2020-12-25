import java.util.Scanner;

public class CharOccurrenceWithoutLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original; int count = 0;
		Scanner in = new Scanner(System.in);
		original = in.nextLine();
		
		original.replace("p", "z");
	    count = original.length() - original.replace("z", "").length();
		
	    System.out.println("The occurrence of letter p in String is :" +count);
		
	}

}
