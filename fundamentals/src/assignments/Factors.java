package assignments;
import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for(int i=2; i<n; ){
            if(n%i == 0){
                System.out.print(i + " ");
                i++;
            }else{
                i++;
            }
            
        }
        
        sc.close();
	}

}
