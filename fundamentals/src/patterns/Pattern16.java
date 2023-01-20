package patterns;
import java.util.Scanner;

public class Pattern16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i=1;
        while(i<=n){
            int spaces=1;
            while(spaces<=n-i){
                System.out.print(' ');
                spaces++;
            }
            int j=1;
            while(j<=i){
                System.out.print(j);
                j++;
            }
            
            System.out.println();
            i++;
        }
		
		
//		for(int i=1; i<=n; i++) {
//			
//		 for(int j=1; j<=n-i; j++) {             // using for loop
//			  System.out.print(' ');
//		 }
//	     for(int k=1; k<=i; k++) {
//				System.out.print(k);
//		 }
//			System.out.println();
//		}
          
		sc.close();
	 }	
	
   
}
