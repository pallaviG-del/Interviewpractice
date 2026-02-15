package constructor_Practice;

public class Constructor_Basics extends Base_Class{

	Constructor_Basics(int i){
		
		System.out.println("child constructor called");
		
	}
	
	public static void main(String[] args) {
		
	
		int i=15;
		
		Constructor_Basics cb = new Constructor_Basics(i);
		cb.abc();
		cb.nqr();
		cb.pqr();
		Base_Class bc = new Constructor_Basics(i);
		bc.abc();
		bc.nqr();
		bc.sdf();
		bc.pqr();
	
		bc.pqr();
		Constructor_Basics.pqr();
		
		Base_Class bc1 = new Base_Class();
		bc1.pqr();
		bc1.abc();
		bc1.nqr();
		

	}
	
	public void nqr() {
		
		System.out.println("child overriden nqr");
	}
	
	static void pqr() {
		
		System.out.println("child static pqr");
	}
	
	final void xyz() {
		System.out.println("child xyz");
		
		
	}
	
	public void ghj() {
		System.out.println("child public ghj");
		
	}

}
