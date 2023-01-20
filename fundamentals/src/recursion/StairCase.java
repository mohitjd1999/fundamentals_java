package recursion;
import java.util.Scanner;

public class StairCase {
	
	public static int staircase(int n) {
		
		 if(n<0){
             return 0;
         }

         if(n==0){
              return 1;
         }

         return staircase(n-1) + staircase(n-2) + staircase(n-3);     

	}

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      
        
        System.out.println(staircase(n));
        

	}

}
