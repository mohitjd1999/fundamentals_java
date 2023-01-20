package recursion;

import java.util.Scanner;

public class CheckNumberInArray {
	
	public static boolean checkNumber(int input[], int x) {

        if(x==input[0]){
            return true;
        }
        
        if(input.length==1 ){
            return false;
        }
        
        // if(x==input[0]){
        //     return true;
        // }
          
        int[] smallArray = new int [input.length-1];
        
        for(int i=0; i<smallArray.length; i++){
            smallArray[i] = input[i+1];
        }
        
        boolean isCheckNumber = checkNumber(smallArray, x);
        
        return isCheckNumber;
		
	}
  
  public static int[] takeInput() {
	  Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();
	  
	  int arr[] = new int[n];
	  
	  for(int i=0; i<arr.length; i++) {
		  arr[i] = sc.nextInt();
	  }
	  
	  return arr;
  }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int []arr = takeInput();
		
		int x = sc.nextInt();
		
		System.out.println(checkNumber(arr, x));
		
	}

}
