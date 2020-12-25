package Constructor;

public class ThisKeyword {

	int a;
	int b;
public ThisKeyword (int a, int b) {
this.a=a;
this.b=b;
}
public void sum () {
	 int sum = a+b;
	 System.out.println(sum);
}

		
public static void main(String[] args) {
			
	ThisKeyword tk = new ThisKeyword(28,10);
tk.sum();
	
			
		}

		
		
	}

