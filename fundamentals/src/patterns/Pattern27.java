package patterns;
import java.util.Scanner;

public class Pattern27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		 for(int i = 0; i < 2 * n - 1; i++) {
				for(int j = 0; j < 2 * n - 1; j++) {
					System.out.print(1+Math.max(Math.abs(n-i-1), Math.abs(n-j-1)) );
				}
				System.out.println();
			}
		 
		 
//		  for(int i=n; i>=1; i--){
//	           System.out.print(n);
//	           for(int j=i; j>=1; j--){
//	               System.out.print(i);
//	           }
//    
//	           System.out.println(n);
//	       }

		sc.close();
	}	


}
