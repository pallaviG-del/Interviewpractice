package String_Practice;

public class PrintLeftTraingle {

	public static void printLfttrangle(int k) {
		
		for(int i=0; i<k; i++) {
			
			for (int b=0; b<(k*2)-2-(2*i); b++) {
				
				
				System.out.print(" ");
			}
			for (int b=0; b<=i; b++) {
				
				
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
	}
	public static void main(String[] args) {
		int i =10;
		printLfttrangle(i);

	}

}
