package timeComplexity;

import java.util.Scanner;
public class FindMaximumSubarraySum {

//    public static int Substring(int arr[]){
        
//        int max = Integer.MIN_VALUE;
//        for(int i=0; i<arr.length-1; i++){
//            int sum = arr[i] + arr[i+1];
//            
//            if(sum>max){
//                max = sum;
//            }
//        }
//        
//        return max;
    	
    	
    	 public static int Substring(int arr[], int n, int k){
    	      
    	        if (n < k)
    	        {
    	           System.out.println("Invalid");
    	           return -1;
    	        }
    	        int res = 0;
    	        for (int i=0; i<k; i++)
    	           res += arr[i];
    	      
    	        int curr_sum = res;
    	        for (int i=k; i<n; i++)
    	        {
    	           curr_sum += arr[i] - arr[i-k];
    	           res = Math.max(res, curr_sum);
    	        }
    	      
    	        return res;
    	    }

    	    
    	    
    	    public static void main(String[] args) {
    			Scanner sc = new Scanner(System.in);
    	        
    	        int n = sc.nextInt();
    	        
    	        int k = sc.nextInt();
    	        
    	        int arr[] = new int[n];
    	        
    	        for(int i=0; i<arr.length; i++){
    	            arr[i] = sc.nextInt();
    	        }

    	        
    	        System.out.println(Substring(arr, n, k));
    	    }
    	}
