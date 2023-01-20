package assignments;
import java.util.Scanner;

public class SumOrProduct {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int C = sc.nextInt();
        
        int sum=0, factor=1;
        if(C==1){
        	for(int i=1; i<=N; i++){
                sum += i;
            }
            System.out.println(sum);
        }else if(C==2){
        	for(int i=N; i>=1; i--){
        		factor *= i;
        	}
        	System.out.println(factor);
        }else{
            System.out.println(-1);
        }

	}

}
