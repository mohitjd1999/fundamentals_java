package assignments;
import java.util.Scanner;

public class AllPrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       
//        int temp=0;
//        for(int i=2;i<=n;i++){
//        	for(int j=2;j<=i-1;j++){
//        		if(i%j==0){
//        			temp=temp+1;
//        		}
//        	}
//        	if(temp==0){
//        		System.out.println(i);
//        	}
//        	else{
//        		temp=0;
//        	}
//        }
        
        int temp=0, i=2;
        while(i<=n) {
        	int j=2;
        	while(j<=i-1) {
        		if(i%j ==0) {
        			temp++;
        		}
        		j++;
        	}
        	
        	if(temp==0) {
        		System.out.println(i);
        	}else {
        		temp=0;
        	}
        	i++;
        }
        
        sc.close();
        
	}

}
