package functions;
import java.util.Scanner;

public class CheckFibonacciNumber {
	
	public static boolean checkMember(int n) {
		int a=0, b=1, c=0;
		boolean checkNo = false;
		if(n==0){
            return checkNo=true;
        }else{
            for(int i=0; i<=n; i++){
            c = a+b;
            
            if(n==c){
                return checkNo=true;
            }
            a=b;
            b=c;
         }
        }
	
		return checkNo;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		System.out.println(checkMember(n));

	}

}
