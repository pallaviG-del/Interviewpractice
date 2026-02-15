package Collections_Practice.List_Practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class List_1st_pragram {

	public static void main(String[] args) {
		// Remove duplicates from arraylist ---"pallavi pallavi ramya ii oo oo Java" 
		// o/p  : "pallavi ramya ii java"
		
		
		String str = "pallavi pallavi ramya ii oo oo Java" ;
		
		String[] s = str.split(" ");
		
		List<String> l = new ArrayList<>();
		
		Set<String> set1 = new LinkedHashSet<>();
		Set<String> set = new HashSet<>();
		
		List<String> l1 = new ArrayList<>();
		l1.add("pallavi");
		l1.add("Ramya");
		
			
		
		for(String ss : s) {
			set1.add(ss);
			set.add(ss);
			
			l.add(ss);
		}
		
		System.out.println(l.indexOf("pallavi"));
		System.out.println(l.lastIndexOf("pallavi"));
		for(String s1 : l) {
			
			if(l.lastIndexOf(s1)==l.indexOf(s1)) {
				
				System.out.println(s1 + "   "+ "is not duplicate");
				break;
			}
		}
		
		System.out.println(l);
		System.out.println(l.getFirst());
		System.out.println(l.lastIndexOf("oo"));
		boolean b = l.containsAll(l1);
		boolean b1= l.contains(l1.get(0));
		
		l.addAll(l1);
		System.out.println(l);
		System.out.println(b1);
		System.out.println(b);
		System.out.println("list: "+l);
		System.out.println("Hash Set: " + set);
		System.out.println(" LinkedHash set1: " + set1);
		
		Set<String> st = new LinkedHashSet<>(l);
		
		System.out.println("linkedhash set l:"+st);
		
		String result = String.join(" ", st);
		System.out.println(result);
		
		
		

	}

}
