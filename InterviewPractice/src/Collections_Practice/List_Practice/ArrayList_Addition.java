package Collections_Practice.List_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList_Addition {

	public static void main(String[] args) {
		List<Integer> l= new ArrayList<>(Arrays.asList(10,20,30));
		List<Integer> l1 =new ArrayList<>( Arrays.asList(10,20,50,60,80,10));
		List<Integer> result = new ArrayList<>();
	
		//with ternury operator
		int x = Math.max(l.size(),l1.size());
		
		for(int i=0; i<x; i++) {
			
			int p = (i<l.size())? l.get(i):0;
			int q = (i<l1.size())? l1.get(i) :0;
			
			result.add(p+q);
						
		}
		
		System.out.println(result);
		
		
		
		//with loops --- comment above code
				
		if(l.size()>l1.size()) {
			for(int i = 0; i<l1.size();i++) {
			result.add(l.get(i)+l1.get(i));
			}
			
			result.addAll(l.subList(l1.size(), l.size()));
			
		}else {
			
			for(int i = 0; i<l.size();i++) {
				result.add(l.get(i)+l1.get(i));
				}
				
				result.addAll(l1.subList(l.size(), l1.size()));
			
		}		
		System.out.println(result);
		
		
		

	}

}
