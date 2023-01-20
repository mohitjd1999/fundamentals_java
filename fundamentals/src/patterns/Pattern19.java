package patterns;
import java.util.Scanner;

public class Pattern19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
//		 int i=1;
//	        while(i<=n){
//	            int spaces=1;
//	            while(spaces<=n-i){
//	                System.out.print(' ');
//	                spaces++;
//	            }
//	            int stars=1;
//	            while(stars<=i){
//	                System.out.print('*');
//	                stars++;
//	            }
//	            int moreStars=i-1;
//	            while(moreStars>=1){
//	                System.out.print('*');
//	                moreStars--;
//	            }
//	            
//	            System.out.println();
//	            i++;
//	        }
//		
		
		for(int i=1; i<=n; i++) {
			
		 for(int spaces=1; spaces<= n-i; spaces++) {             // using for loop
			  System.out.print(' ');
		 }
		 for(int star=1; star<=i; star++) {
			 System.out.print('*');
		 }
		 for(int moreStars=i-1; moreStars>=1; moreStars--) {
			 System.out.print('*');
		 }
			System.out.println();
		}
          
		sc.close();
	 }	
	
   
}
