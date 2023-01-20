package patterns;
import java.util.Scanner;

public class Pattern23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i=1;
        while(i<=n){
            int spaces=1;
            while(spaces<=i-1){
                System.out.print(' ');
                spaces++;
            }
            int stars=1;
            while(stars<=n){
                System.out.print('*');
                stars++;
            }
            System.out.println();
            i++;
        }
		
          
		sc.close();
	 }	
	
   
}
