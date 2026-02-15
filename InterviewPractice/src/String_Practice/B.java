package String_Practice;

public class B  extends A{

	static String name;
	
	B(String name){
		
		int i=10;
		this.name =name;
		System.out.println(i +" : "+ name);
	}
	
	public static void main(String[] args) {
		
       A a = new A();
      // a.private_method();
       a.public_method();
       a.protected_method();
       a.default_method();
       
       A a1 = new B("pallavi");
       
       a1.default_method();
       a1.public_method();
       a1.protected_method();
     A.static_method();
     
     B b1 = new B("Ramya");
     b1.m();
     
     
      
//      int i = 1;
//      while (i <= 6) {
//    	  
//          if (i == 4) {
//           continue;}
//          i++;        
//          System.out.println(i);    
//      
//      }
//       
	}
	public static void static_method() {
		
		System.out.println("static B"+ name);
	}
	
	public void public_method() {
		
		System.out.println("public_B"+ ": "+ name);
	}
	
protected void protected_method() {
		
		System.out.println("protected_B");
	}
	
	
}
