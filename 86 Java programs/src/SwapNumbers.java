
public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 20;
	int temp = a;
	a = b;
	b = temp;
	
	System.out.println(a);
	System.out.println(b);
	
	//without temp variable
	int a1 = 10;
	int b1 = 20;
	
	a1 = a1+b1;
    b1 = a1-b1;
    a1 = a1-b1;
    System.out.println(a1);
    System.out.println(b1);
	
	
	
	
	}

}
