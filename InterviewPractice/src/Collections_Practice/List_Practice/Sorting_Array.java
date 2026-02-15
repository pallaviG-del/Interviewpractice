package Collections_Practice.List_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sorting_Array {

	public static void main(String[] args) {
		
		int[] i = {1,5,3,8,5,6};
		
		Arrays.sort(i);
		System.out.println(Arrays.toString(i));
		
		//Arrays.sort(i, Collections.reverseOrder());
		
		System.out.println(i[3]);
		
		List<Integer> l = new ArrayList<>();
		
		for(int i1 :i) {
			
			l.add(i1);
		}
		
		Collections.sort(l);
		
		Collections.sort(l, Collections.reverseOrder());
		
		System.out.println(l);
		
		

	}

}
