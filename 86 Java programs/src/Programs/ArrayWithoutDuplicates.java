package Programs;

import java.util.HashMap;
import java.util.HashSet;

public class ArrayWithoutDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] = {2,34,6,8,2,3,7,8};
		
		HashSet<Integer> hset = new HashSet<Integer>();
		
		for(int i : a) {
			hset.add(i);
				}
		System.out.println(hset);
			}
}

	
