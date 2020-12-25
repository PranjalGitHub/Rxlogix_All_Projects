package FinalPrograms;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 937373;
		int count=0;
		while (num!=0) {
			num = num/10;
			count++;
		}
		System.out.println(count);
	}

}
