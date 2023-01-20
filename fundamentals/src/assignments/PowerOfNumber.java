package assignments;
import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int n = sc.nextInt();
        
        int pow = (int)Math.pow(x, n);
        System.out.println(pow);
        
        sc.close();
	}

}
