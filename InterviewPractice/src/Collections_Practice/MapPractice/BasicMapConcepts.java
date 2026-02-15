package Collections_Practice.MapPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class BasicMapConcepts {

	public static void main(String[] args) {
		
		Map<Character, Integer> map = new HashMap<>();
		map.put('a', 1);
		map.put('b', 2);
		map.put('c',3);
		//print map
		
		System.out.println(map);
		
		for (char key : map.keySet()) {
			
			if(map.get(key)==2) {
		    System.out.println("with keyset::"+key);}
		}
		
	for(Map.Entry<Character,Integer> entry :  map.entrySet()) {
		
				
		if(entry.getValue()==2) {
			
			System.out.println("with entry set: "+ entry.getKey());
		}
		
		
		
		
		
		
	}
		
		

	}

}
