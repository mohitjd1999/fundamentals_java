package patterns;
import java.util.Scanner;

public class Pattern20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
//		int i=1;
//        while(i<=n){
//        	int spaces=1;
//        	while(spaces<=n-i) {
//        		System.out.print(' ');
//        		spaces++;
//        	}
//            int j=1;
//            while(j<=i){
//                System.out.print(j);
//                j++;
//            }
//            int k=i-1;
//            while(k>=1) {
//            	System.out.print(k);
//            	k--;
//            }
//            
//            System.out.println();
//            i++;
//        }
		
		
		for(int i=1; i<=n; i++) {
			
		 for(int spaces=1; spaces<= n-i; spaces++) {             // using for loop
			  System.out.print(' ');
		 }
		 for(int num=1; num<=i; num++) {
			 System.out.print(num);
		 }
		 for(int dec=i-1; dec>=1; dec--) {
			 System.out.print(dec);
		 }
			System.out.println();
		}
          
		sc.close();
	 }	
	
   
}
