package Number_Practice;

import String_Practice.A;

public class B extends A{

	public static void main(String[] args) {
		
	B b = new B();
	b.public_method();
	b.protected_method();
	b.default_method();
	b.private_method();
	
	
	A a = new A();
	a.public_method();
	
	
	
	A a1 = new B();
	a1.public_method();
	
	
	

	}
	
	public void public_method() {
		System.out.println("public b");
		
	}
	
	protected void protected_method() {
		
		System.out.println("protected_B");
	}

	void default_method() {
		
		System.out.println("default_b");
	}
	
	private void private_method() {
		
		System.out.print("b_private");
	}
	

}
