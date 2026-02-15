package collections_Practice.Set_Practice;

import java.util.*;

public class Set_Basics {

	public static void main(String[] args) {
		Set<Character> s = new HashSet<>();
		List<Character> l = new ArrayList<>();
		Set<Character> s2 = new LinkedHashSet<>();
		
		String name = "Pallavi";
		
		for(char c : name.toCharArray()) {
			
			s.add(c);
			s2.add(c);
			l.add(c);
			
			
		}
		
		System.out.println(s);
		System.out.println(s2);
		
		Set<Character> lnkset =new LinkedHashSet<>(l);
		System.out.println(lnkset);
		
	}

}
