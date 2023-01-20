package functions;
import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 		int n = sc.nextInt();
		
    
       for(int i=1; i<=n; i++){
           for(int j=1; j<=n-i+1; j++){
               
               System.out.print(j);
             
           } 
           
           for(int star=1; star<i; star++) {
        	   System.out.print("**");
           }
           
           for(int j=n-i+1; j>=1; j--){
               System.out.print(j);
             
           } 
           
           System.out.println();
       }

	}

}
