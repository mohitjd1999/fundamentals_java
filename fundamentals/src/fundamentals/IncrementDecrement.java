package fundamentals;

public class IncrementDecrement {

	public static void main(String[] args) {
//		int a=40;
//		int b=a++;  //a=a+1, b=40
//		int c=++a   //a=a+1, c=a
//		
//		System.out.println(a);  // 42
//		System.out.println(b);  // 40
//		System.out.println(c);  // 42
		
        int a=60, b=80;
//        if(a++>60 && b++>80) {                 // a=60, b=80 and after first statement is false, it will not consider second
//        	System.out.println("Inside If");
//        }else {
//        	System.out.println("Inside else");
//        }
//        
//        System.out.println("a= " + a + ",b= " + b); // a=61, b=80
	
	 if(++a>60 && b++>80) {                 // a=61, b=80 and after first statement is true, it will consider second statement
    	System.out.println("Inside If");
     }else {
    	System.out.println("Inside else");
     }
    
     System.out.println("a= " + a + ",b= " + b); // a=61, b=81
     
     
     
     
}

}
