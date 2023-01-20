package assignments;
import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int length = String.valueOf(n).length();
        
        int temp=n, decimal=0;
        
        for(int i=0; i<length; i++){
            int rem = temp%10;
            
            decimal+= rem * (Math.pow(2,i));
            temp/=10;
        }

        System.out.print(decimal);

	}

}
