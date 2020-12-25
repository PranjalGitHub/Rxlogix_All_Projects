
public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long num = 7383832318032324248l;
		int count = 0;
		
		while (num != 0)
		{
			num = num/10;
			++count;
		}
		
		System.out.println(count);
	}

}
