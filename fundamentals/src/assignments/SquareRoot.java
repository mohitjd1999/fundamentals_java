package assignments;
import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
		for(int i=0; i<=n/2; i++){
            int root = i*i;
            if(root == n){
            	System.out.print(i);
            	return;
            }else if(root>n){
            	System.out.print(i-1);
            	return;
            }
        }

	}

}
