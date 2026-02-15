package String_Practice;

public class A {
	
public A() {
	
	
}
 	
	public static void main(String[] args) {
		
		A a = new A();
		a.private_method();
		a.default_method();
		
			

	}
	
	private void private_method() {
		
		System.out.println("private method_class A");
	}
	
	public void public_method() {
		
		System.out.println("public_A");
	}
	
	public static void static_method() {
		
		System.out.println("static A");
	}
	protected void protected_method() {
		
		System.out.println("protected_A");
	}

	void default_method() {
		
		System.out.println("default_a");
	}
	
	 void m() {
		
		System.out.println("m method-A");
	}
}
