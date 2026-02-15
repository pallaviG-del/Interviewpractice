package constructor_Practice;

public class Base_Class {
	
	Base_Class(){
		System.out.println("base class constructor");
		
	}

	public static void main(String[] args) {
		
		System.out.println("base class");
		
	//	Base_Class bc = new Base_Class();

	}

	
	
	final void abc() {
		
		System.out.println("parent abc");
	}
	
	public void nqr() {
		
		System.out.println("parent public nqr");
	}
	
	static void pqr() {
		System.out.println("static pqr parent");
		
	}
	
	public void sdf() {
		
		System.out.println("parent public sdf");
	}
	
}
