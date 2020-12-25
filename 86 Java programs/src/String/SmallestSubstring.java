package String;

public class SmallestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "ddI Love Programming lk";
		String smallestsub = "";		
		String[] k = str.split(" ");
		String small = k[0];
		String large  = k[0];
		System.out.println(k.length);
		
		for(int i =0;i<=k.length-1;i++) {
			if (small.length()>=k[i].length())
				small = k[i];
		}
		
		System.out.println(small);
	}

}
