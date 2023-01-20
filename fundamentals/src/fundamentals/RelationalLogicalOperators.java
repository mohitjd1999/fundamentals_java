package fundamentals;

import java.util.Scanner;

public class RelationalLogicalOperators {
     public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
    	 int a = sc.nextInt();
    	 int b = sc.nextInt();
    	 
    	 System.out.println(a > b);   // greater than
    	 System.out.println(a < b);   // less than
    	 System.out.println(a == b);  // equal to 
    	 System.out.println(a != b);  // not equal to 
    	 System.out.println(a >= b);  // greater than and equal to 
    	 System.out.println(a <= b);  // greater than and equal to
		
    	 
    	 System.out.println(a>=10 && b>=0);  // AND operator
    	 System.out.println(a>=10 || b>=10); // OR operator
    	 
    	 System.out.println(!(a>b));         // NOT operator
    	   
    	 sc.close();
  
	}
}
