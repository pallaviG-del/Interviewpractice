package String_Practice;

public class Wipro_intrv_q {

	public static void main(String[] args) {

		// Input= aabbccddefg  o/p= aa,bb,cc,dd,e,f,g
		
		String str = "aabbccddefg";
		System.out.println(str.length());
		
		char[] ch = str.toCharArray();
		
		StringBuilder temp = new StringBuilder();
		StringBuilder result = new StringBuilder();
		
		temp.append(ch[0]);
		
		for(int i =1; i<str.length(); i++) {
			
			if(ch[i]==ch[i-1]) {
				temp.append(ch[i]);
				
							
			}else {
				
				result.append(temp).append(",");
				temp.setLength(0);
				temp.append(ch[i]);
			}
			
		}
		
		result.append(temp);
		System.out.println(result);
		
		
		
		
	}

}
