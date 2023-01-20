package assignments;
import java.util.Scanner;

public class SumOfEvenAndOddNo {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int evenSum=0, oddSum=0;
        
        while(n>0) {
        	int rem = n%10;
        	int temp = n/10;
        	if(rem%2 ==0) {
        		evenSum+=rem;
        	}else {
        		oddSum+=rem;
        	}
        	
        	n=temp;
        }
        System.out.print(evenSum + " " + oddSum);
        
        sc.close();
	}

}
