package assignments;
import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        
//        int a=0,b=1;
//        System.out.print(b+ " ");
//        
//        for(int i=2; i<=n; i++){
//            int c=a+b;
//            System.out.print(c + " ");
//            
//            a=b;
//            b=c;   
//        }
        
        int a=0,b=1,c=0;
        
        if(n>1) {
        	for(int i=2; i<=n; i++){
                c=a+b;
                
                a=b;
                b=c;   
            }
        }else {
        	c=1;
        }
		
        System.out.print(c);
        sc.close();
	}

}
