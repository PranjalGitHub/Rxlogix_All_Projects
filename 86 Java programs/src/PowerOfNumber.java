
public class PowerOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int base = 10;
		
		int power =3;
		long result=1;

		
while (power !=0) {
	result =result*base;
	--power;
}

System.out.println(result);
}

}
