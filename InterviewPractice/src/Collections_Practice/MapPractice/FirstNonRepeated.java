package Collections_Practice.MapPractice;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeated {

	public static void main(String[] args) {
		
		String s = "Pallavip";
		
		
		Map<Character, Integer> map = new HashMap<>();
		map.put('a', 2);
		
		for(char c : s.toLowerCase().toCharArray()) {
			
			map.put(c, map.getOrDefault(c,0)+1);
					
			
		}
			
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			
			//checking what getOrDefault returns if char is already available in map
			if(entry.getKey()=='a') {
			
			System.out.println("value for a: "+entry.getValue());}
		
			//1st non repeated char
			if(entry.getValue()==1) {
				
				System.out.println("1st non repeated character : "+ entry.getKey());
				
				break;
				
				
			}
			
		}
		

	}

}
