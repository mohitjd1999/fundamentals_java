package assignments;
import java.util.Scanner;

public class TermsOfAP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++){
            int series = 3*i+2;
            
            if(series % 4 ==0){
               n++;
               continue;
            }else{
                 System.out.print(series + " ");
            }
           
        }

	}

}
