package patterns;
import java.util.Scanner;

public class Pattern22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
//		int i=1;
//		int n1=(n+1)/2;
//        while(i<=n1){
//            int spaces=1;
//            while(spaces<=n1-i){
//                System.out.print(' ');
//                spaces++;
//            }
//            int stars=1;
//            while(stars<=2*i-1){
//                System.out.print('*');
//                stars++;
//            }
//            System.out.println();
//            i++;
//        }
//        
//		
//		int n2=n1-1;
//		int j=n2;
//        while(j>=1){
//            int spaces=n2-j+1;
//            while(spaces>=1){
//                System.out.print(' ');
//                spaces--;
//            }
//            int stars=2*j-1;
//            while(stars>=1){
//                System.out.print('*');
//                stars--;
//            }
//            System.out.println();
//            j--;
//        }
		
		int n1=(n+1)/2;
		for(int i=1; i<=n1; i++) {
			for(int spaces=1; spaces<=n1-i; spaces++) {
				System.out.print(' ');
			}
			for(int stars=1; stars<=2*i-1; stars++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		int n2=n1-1;
		for(int j=n2; j>=1; j--) {
			for(int spaces=n2-j+1; spaces>=1; spaces--) {
				System.out.print(' ');
			}
			for(int stars=2*j-1; stars>=1; stars--) {
				System.out.print('*');
			}
			System.out.println();
		}
          
		sc.close();
	 }	
	
   
}
