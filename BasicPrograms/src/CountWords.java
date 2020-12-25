import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String original; int count = 0;
		Scanner in = new Scanner(System.in);
		original = in.nextLine();
		
		
		String words[] = original.split(" ");
		System.out.println(count = words.length);
	}

}
