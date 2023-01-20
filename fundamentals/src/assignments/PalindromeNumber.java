package assignments;
import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);
        
        int n = sc.nextInt();
        int length = String.valueOf(n).length();
        
        int temp=n, rev=0, j=10;
        for(int i=1; i<=length; i++){
            int rem = temp%10;
            
            rev = rev*j +rem;
            
            temp/=10;
        }
        
        if(n==rev){
            System.out.print("true");
        }else{
            System.out.print("false");
        }
	}

}
