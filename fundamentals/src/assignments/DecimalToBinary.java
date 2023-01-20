package assignments;
import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        

        long i=1, binary=0;
        while(n>0){
           long rem = n%2;
           
           binary += rem*i;
           i*=10;
        		   
            n/=2;
        }
        
        System.out.print(binary);
        sc.close();
	}

}
