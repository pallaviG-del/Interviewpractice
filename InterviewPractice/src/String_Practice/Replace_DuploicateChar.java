package String_Practice;

import java.util.HashMap;
import java.util.Map;

public class Replace_DuploicateChar {

	public static void main(String[] args) {
	  
		String name = "Pallavii";
		
	
		StringBuilder strbldr = new StringBuilder();
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(char ch : name.toCharArray()) {
			
		//	int count = 0;
			map.put(ch, map.getOrDefault(ch, 0)+1);
			
			if(name.indexOf(ch) == name.lastIndexOf(ch)) {
				strbldr.append(ch);
				
			}else {
				
				for(int i= 0; i<map.get(ch); i++ ) {
				
				strbldr.append("#");
				
				}
			}
			
			
			
			
		}
		
		System.out.println(strbldr.toString());
		
	}

}
