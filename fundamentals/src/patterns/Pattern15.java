package patterns;
import java.util.Scanner;

public class Pattern15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
//		int i=1;                            // using while loop
//		while(i <= n) {
//			int j=1;
//			while(j <= n-i) {
//				System.out.print(' ');
//				j++;
//			}
//			int k=1;
//			while(k <=i) {
//				System.out.print('*');
//				k++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		for(int i=1; i<=n; i++) {
			
		 for(int j=1; j<=n-i; j++) {             // using for loop
			  System.out.print(' ');
		 }
	     for(int k=1; k<=i; k++) {
				System.out.print('*');
		 }
			System.out.println();
		}
          
		sc.close();
	 }	
	
   
}
