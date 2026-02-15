package String_Practice;

public class PrintRightTraingle {
	
	public static void printrighttraingle1(int k) {
		
		for(int a =0; a<k; a++) {
			
			
			for(int b = 0; b<=a; b++) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		int i =10;
		printrighttraingle1(i);

	}

}
