package Collections_Practice.MapPractice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class GetSecondKeyValue {

	public static void main(String[] args) {
		
		String s = "Hello";
		int count=0;
		
		Map<Character, Integer> map = new LinkedHashMap<>();
		Map<Character, Integer> map1 = new HashMap<>();
		map1.put('a', 1);
		map1.put('c',1);
		map1.put('b', 3);
		
		
		System.out.println("map1:" +" "+map1);
		
		
		for(char c: s.toCharArray()) {
			
		map.put(c,map.getOrDefault(c,0)+1);
			
		}
		
		System.out.println(map);
		
		for(Map.Entry<Character,Integer> entry : map.entrySet()) {
			count++;
			if(count ==1) {
				
				System.out.println(entry.getKey() + " : "+ entry.getValue());
				
			}
			
		}
		
		

	}

}
