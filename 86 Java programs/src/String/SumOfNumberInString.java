package String;

import org.apache.commons.lang3.StringUtils;

public class SumOfNumberInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "I123_Love_34_Programming1";
		int Newnum = 0;
		String [] k = a.split("_");
		for(int i = 0; i<k.length;i++) {
			
			if(StringUtils.isAlphanumeric(k[i])||StringUtils.isNumeric((k[i]))) {
				for (int j=i;j<k[i].length();j++) {
					if(Character.isDigit(k[i].charAt(j))) {
						
						int s = Integer.parseInt(String.valueOf(k[i].charAt(j)));
						
						Newnum = Integer.parseInt(Newnum + "" + s);
						System.out.println(Newnum);
					}
					
				}
				
			}
			
		}
	}
}

