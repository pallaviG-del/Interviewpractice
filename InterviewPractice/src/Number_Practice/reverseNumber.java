package Number_Practice;

public class reverseNumber {

	static int  rev;
	public static void reverseNumber1(int i) {
		
		if (i==0) {
			
			return;
		}
		
		int rem= i%10; //6   4  2
		
		
		rev = (rev*10)+ rem; //6 64 642
		
		reverseNumber1(i/10); // 24 2  0
		
		
		
	}
	
	
	public static int reverse(int i) {
		
		int rev =0;
		int rem;
		
		
		while(i>0) {
			
			rem = i%10;
			
			rev = (rev*10)+rem;
			
			i= i/10;
			
		}
		
		return rev;
		
		
	}
	
	
	public static void main(String[] args) {
		 
		int i =242;
		int a = 357;
		
		reverseNumber1(i);
		
		reverse(a);
		System.out.println(reverse(a));
		System.out.println(rev);
		if(rev==i) {
			
			System.out.println(i + " is palindrom");
		}else {
			
			System.out.println("not palindrom");
		}
		
	}

}
