package patterns;
import java.util.Scanner;

public class Pattern18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
//		int i=1;
//        while(i<=n){
//            int j=1;
//            while(j<=n-i+1){
//                System.out.print(n-i+1);
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
		
		
		for(int i=1; i<=n; i++) {
			
		 for(int j=1; j<=n-i+1; j++) {             // using for loop
			  System.out.print(n-i+1);
		 }
			System.out.println();
		}
          
		sc.close();
	 }	
	
   
}
