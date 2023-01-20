package fundamentals;

import java.util.Scanner;

public class ConditionalOperators {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        int a, b;
         a = sc.nextInt();
         b = sc.nextInt();
        
         
         //if-else
        if(a>b) {
       	 System.out.println("a is greater than b");
        }else {
       	 System.out.println("b is greater than a");
        }
        
        
        // if-else if
        int x = 15;
        if(x <= 15){
            System.out.print("Inside if  ");
        }else if(x == 15){
            System.out.print("Inside else if  ");
        }
        System.out.println(x);
        
    	sc.close();
    }
}
              
