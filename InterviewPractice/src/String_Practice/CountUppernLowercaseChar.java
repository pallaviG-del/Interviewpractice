package String_Practice;

public class CountUppernLowercaseChar {

	public static void main(String[] args) {
		 String name ="Pal%%la2V3i";
	        
	        char[] ch = name.toCharArray();
	        
	        System.out.println(ch[2]);
	        
	        int uppercase = 0;
	        int lowercase = 0;
	        int specailchr = 0;
	        int number =0;
	        
	        for(int i =0; i< ch.length ; i++){
	        if(ch[i]>='A' && ch[i]<='Z'){
	        	
	        	uppercase++;
	        }
	        else if(ch[i]>= 'a' && ch[i]<= 'z'){
	        	
	        	lowercase++;
	        	
	        }
	        
	        else if (ch[i]>= '0' && ch[i] <= '9') {
	        	
	        	number++;
	        }
	        else {
	        	
	        	specailchr++;
	        }
	        }
	        
	        System.out.println("uppercass"+ uppercase);
	        System.out.println("lowecase"+ lowercase);

	        System.out.println("number"+ number);
	        System.out.println("specialchar"+ specailchr);


	}

}
