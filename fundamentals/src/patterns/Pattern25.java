package patterns;
import java.util.Scanner;

public class Pattern25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1; i<=2*n; i+=2){
	           for(int j=i; j<=2*n; j+=2){
	               System.out.print(j);
	           }
	           
	           for(int j=1; j<i ; j+=2) {
	        	   System.out.print(j);
	           }
	           
	           System.out.println();
	        }
		
		sc.close();
	 }	
	
   
}
