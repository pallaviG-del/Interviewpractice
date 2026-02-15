package String_Practice;

public class PalindromString {

	public static boolean palindrom(String s) {
		
		
		String rev="";
		
		for(int i= s.length()-1; i>=0; i--) {
			
			rev = rev + s.charAt(i); 
						
		}
		
		return (s.equalsIgnoreCase(rev));
		
				
	}
	
	public static void main(String[] args) {
		
		String s = "RAR";
		
		boolean b = palindrom(s);
		
		if(b) 
			System.out.println("String is pandrom");
		else		
			System.out.println("String is not palindrom");
		
		
		

	}

}
