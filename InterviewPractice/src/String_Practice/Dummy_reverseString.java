package String_Practice;

import java.util.HashMap;
import java.util.Map;

public class Dummy_reverseString {

	public static void main(String[] args) {

		String str = "Ramya is cute and Ramya is smart";
		
		String[] s = str.split(" ");
		str = str.replace(" ", "");
		char[] c = str.toCharArray();
		
		Map<String, Integer> m = new HashMap<>();
		Map<Character , Integer> chrmap = new HashMap<>();
		
		for(String s1 : s) {
			
			m.put(s1, m.getOrDefault(s1, 0)+1);
			
		}
		
		for(Map.Entry<String, Integer> entry : m.entrySet()) {
			
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		for(char ch : c) {
			
			chrmap.put(ch, chrmap.getOrDefault(ch, 0)+1);
			
		}
		System.out.println(m);
		System.out.println(chrmap);
		
		
		
	}

}
