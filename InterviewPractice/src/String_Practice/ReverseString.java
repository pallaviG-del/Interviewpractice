package String_Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ReverseString {
	
	public static String reverseString(String s) {
		
		String rev="";
		for(int i = s.length()-1 ; i>=0; i--) {
			
			rev = rev+s.charAt(i);
					
		}
		
		return rev;
		
	}

	public static void main(String[] args) {
		
		
		String name = "Hello Java";
		
		System.out.println("reverse function: "+ reverseString(name));
		
		StringBuilder sb = new StringBuilder();
		sb.append(name);
		sb.reverse();
		System.out.println(sb);
		
		String reversedstring = sb.toString();
		System.out.println(reversedstring);
		
		
		StringBuffer sbfr = new StringBuffer(name);
		sbfr.reverse();
		System.out.println(sbfr);
				
		String reversedsbfr = sbfr.toString();
		System.out.println(reversedsbfr);
		
		
		char[] arr = name.toCharArray();
		String s ="";
		char ch;
		for(int i=arr.length-1; i>=0; i--) {
			
			System.out.print(arr[i]);
			
			ch = arr[i];
			s= s+ch;
					
			
		}
		System.out.println("\n" + s);
		
		
		
		List<Character> l = new ArrayList<>();
		for (char c : arr) {
			
			l.add(c);
			
		}
		
		Collections.reverse(l);
		
		Iterator<Character> itr = l.iterator();
		System.out.print("with collections: ");
		
		while(itr.hasNext()) {
			
			System.out.print( itr.next());
			
		}
		
		
		
		

	}

}
