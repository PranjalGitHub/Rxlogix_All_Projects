package October;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a ="Prpanjal";
		a = a.toLowerCase();
		int flag = 1;
		
		for (int i = 0;i<a.length()-1;i++) {
			for (int j=i+1;j<a.length();j++) {
				if(a.charAt(i)!=a.charAt(j))
					flag= 0;
				else {flag = 1;
				break;
				}
				
					
			}
		if (flag==0) {
			System.out.println(a.charAt(i));
			break;
		
			
		}

		
		}
}
}