package fundamentals;

 public class BitwiseOperators {
   public static void main(String[] args) {
	 int a=10, b=3;
	  
	 System.out.println(a & b);   // And
	 System.out.println(a | b);   // OR
	 System.out.println(a ^ b);   // EX-OR
	 System.out.println(~a);     // NOT/ Complement
	 
	 System.out.println(~(-20));
	 System.out.println(10^(-20));
	 
	 System.out.println(a<<1);  // Left-shift
	 System.out.println(a<<3);
	 
	 System.out.println(a>>1);  // Right-shift
	 System.out.println(a>>3);
	 
	 int c=10;
	 c+=++c-5/3+6*c;
	 System.out.println(c);
   }
 }
