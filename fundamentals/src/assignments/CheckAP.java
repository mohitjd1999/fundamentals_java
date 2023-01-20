package assignments;
import java.util.Scanner;

public class CheckAP {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
        
		    int n = sc.nextInt();
	        int arr[] = new int[n];
	        
	        for(int i=0; i<n; i++){
	            arr[i] = sc.nextInt();
	        }
	        
	        int d1 = arr[1] - arr[0];
	        boolean flag = true;
	       
	        
	        for(int i=2; i<n; i++) {
	        	
	        	int d2 = arr[i] - arr[i-1];
	        	
	        	if(d1 == d2 ) {
	        		flag = true;
	        	}else {
	        		 flag= false;
	        		 break;
	        	}
	        }
	        System.out.println(flag);
	        
	        
	}

}
