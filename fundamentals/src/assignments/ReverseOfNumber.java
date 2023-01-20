package assignments;
import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int length = String.valueOf(n).length();
        
        int temp = n, rev=0;
        
        if(n==0) {
        	System.out.print(n);
        }      
        else {
        	 for(int i=1; i<=length; i++){	
                 int rem = temp%10; 
                 temp/=10;
                 
                 rev = rev*10 + rem;
             }
        	 
        	 System.out.print(rev);
        }
        
       
        

	}

}
