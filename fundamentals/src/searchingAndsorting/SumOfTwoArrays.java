package searchingAndsorting;
import java.util.Scanner;

public class SumOfTwoArrays {
	
	public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {

	        int k = output.length-1;
	        int carry=0, val=0;

           for(int i=arr1.length-1,j =arr2.length-1;    i>=0||j>=0;   i--,j--){
	        	
        	    if(i>=0 && j>=0) {
        	    	val= arr1[i] + arr2[j] + carry;
    	        	if(val>9) {
    	        		val= val-10;
    	        		carry =1;
    	        	}else {
    	        		carry=0;
    	        	}
        	    }
        	    
        	    else if(i>=0) {
        	    	val = arr1[i] + carry;
        	    	if(val>9) {
    	        		val= val-10;
    	        		carry =1;
    	        	}else {
    	        		carry=0;
    	        	}
        	    }
        	    
        	    else if(j>=0) {
        	    	val = arr2[j] + carry;
        	    	if(val>9) {
    	        		val= val-10;
    	        		carry =1;
    	        	}else {
    	        		carry=0;
    	        	}
        	    }
        	    
        	    output[k] = val;
        	    k--;
        	   
           } 
        	    if(k==0) {
        	    	output[k] = carry;
        	    }
   }
           
           


	       
	
	public static void printArray(int []arr) {
		for(int element : arr) {
			System.out.print(element + " ");
		}
		
		System.out.println();
	}
	

	public static int []takeInput(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int []arr = new int [n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		return arr;
		
	}
	
	
	public static void main(String[] args) {
		int arr1[] = takeInput();
		
		int arr2[] = takeInput();
	
		
		int output[] = new int[1 + Math.max(arr1.length, arr2.length)];
		
		sumOfTwoArrays(arr1, arr2, output);
		
		printArray(output);
		
	}

}
