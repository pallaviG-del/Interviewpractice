import String_Practice.A;

public class C extends A{
	
	C(){
		
		
	}

	
	public static void main(String[] args) {
		
		A a = new A();
	
		a.public_method();
		
		
		A a1 = new C();
		a1.public_method();
		//a1.protected_method();
		
		C c = new C();
		c.protected_method();
		c.public_method();
		

	}
	
public void public_method() {
		
		System.out.println("public_C");
	}


 void m() {
	
	System.out.println("c-m1");
}
}
