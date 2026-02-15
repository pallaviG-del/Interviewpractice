package String_Practice;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		String name = "pppaalllvviii";
		
		char[] c = name.toCharArray();
		
		Set<Character> ch = new LinkedHashSet<Character>();
		
		for (char e : c) {
			
			ch.add(e);
		}
		
		StringBuilder sb = new StringBuilder();
		for(Character ech : ch) {
		sb.append(ech);
		}
		String ss = sb.toString();
		
		System.out.println(ss);
		
	
		
		
	}
}
