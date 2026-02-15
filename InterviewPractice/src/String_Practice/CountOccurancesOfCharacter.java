package String_Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountOccurancesOfCharacter {

	public static void main(String[] args) {

		String name = "Pallavii";
		
		reverseUsingMap(name);
		System.out.println(name.length());
		char[] ch = name.toCharArray();
		System.out.println(ch.length);
		
		boolean[] b = new boolean[ch.length];
		
		
		for(int i =0; i<ch.length; i++) {
			
			int count=1;
			
			if(b[i])
			{
				continue;
			}
			
			for(int j =i+1 ; j<ch.length ; j++) {
				
				if(ch[i]==ch[j]) {
					count++;
					
					b[j]=true;
					
				}
			}
			if(count>1) {
				
				System.out.println(ch[i] + "is duplicate");
			}
			
			System.out.println(ch[i]+":"+count);
			
		}
		
	}
	
	
	public static void reverseUsingMap(String str) {
		
		Map<Character, Integer> map = new HashMap<>();
		
		
		for(char c : str.toCharArray()) {
			
			map.put(c, map.getOrDefault(c, 0)+1);
			
		}
		
		Set<Map.Entry<Character, Integer>> entry1 = map.entrySet();
		
			System.out.print("Set:");
			
			System.out.println(entry1);
		
		
		
		for(Map.Entry<Character,Integer> entry : map.entrySet()) {
	
			
			System.out.println(entry.getKey() + " : " +  entry.getValue());
			
		}
		System.out.println(map);
		
		
		
	}

}
