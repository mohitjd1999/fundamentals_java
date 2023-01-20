package assignments;
import java.util.Scanner;

public class MaximumNumber {
	
	 public static int max_number(int n){     
	        int max = 0;
	        for (int i = 1; i < n; i *= 10) {
	            max = Math.max(max, n % i + n / (i * 10) * i);
	        }
	        return max;
	    
	        
	    }    

//		
//		for(int i=0; i<arr.length; i++) {
//			for(int j=i+1; j<arr.length; j++) {
//				if(arr[i] < arr[j]) {
//					int temp = arr[j];
//					arr[j] = arr[i];
//					arr[i] = temp;
//					
//				}
//			  
//			}
//			System.out.print(arr[i]);
	 
		
//		for(int element : arr) {
//			System.out.print(element);
//		}
//	}
	
	
//	public static int []takeInput() {
//		Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//	        
//		int arr[] = new int[n];
//		
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//		
//		return arr;
//	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(max_number(n));


	}

}
