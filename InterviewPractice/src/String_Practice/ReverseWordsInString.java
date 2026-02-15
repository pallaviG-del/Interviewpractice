package String_Practice;

public class ReverseWordsInString {

	public static void main(String[] args) {
		
		String name = "Hello Java";
		String[] namearray = name.split(" ");
		
		System.out.println(namearray[1]);
		
		String reverse ="";
		
		for(String s : namearray) {
			
			for(int i=s.length()-1; i>=0; i--) {
				
				reverse = reverse+s.charAt(i);
				
				
				
			}
			
			
			reverse = reverse+" ";
			
					
		}
		
		System.out.println(reverse);
		
	}

}
