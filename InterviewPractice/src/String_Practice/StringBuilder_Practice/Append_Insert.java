package String_Practice.StringBuilder_Practice;

public class Append_Insert {

	public static void main(String[] args) {
	
		StringBuilder sb= new StringBuilder("Java");
		sb.append("selenium");
		//sb.insert(1, "hello");
		sb.insert(0, sb, 1, 3);
		
		String s = "iss iss 098765";
		
		System.out.println(s.replaceAll("[^0-9]", ""));
		
		
		System.out.println(sb);

	}

}
