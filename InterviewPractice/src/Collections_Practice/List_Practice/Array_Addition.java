package Collections_Practice.List_Practice;

import java.util.Arrays;

public class Array_Addition {

	public static void main(String[] args) {
		int[] i = {10,20,30,40};
		int[] j = {10,20,40,50,60};
		int[] result;
		// with turnery operator
		int max = Math.max(i.length, j.length);
		result = new int[max];
		
		for(int a=0;a<max;a++) {
			
			int x = (a<i.length)? i[a] :0;
			int y =(a<j.length)? j[a] :0;
			
			result[a] = x+y;
		}
		
		System.out.println(Arrays.toString(result));
		
		//2nd type with loops --not recommended
		
		
		if(i.length>j.length) {
		result = Arrays.copyOf(j, i.length);
		
	for(int a=0; a<result.length;a++) {
			
			result[a] = i[a]+result[a];
			System.out.println(Arrays.toString(result));
			
		}
		
		}else {
			
			result = Arrays.copyOf(i, j.length);
			
			for(int a=0; a<result.length;a++) {
				
				result[a] = j[a]+result[a];
				
				
			}
		}
		
		System.out.println(Arrays.toString(result));
	
		
		
		
		
		

	}

}
