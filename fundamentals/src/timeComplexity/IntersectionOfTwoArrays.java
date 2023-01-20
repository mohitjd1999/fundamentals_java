package timeComplexity;

import java.util.Scanner;

public class IntersectionOfTwoArrays {
  public static int arrayEquilibriumIndex(int[] arr){  
        
        int i=0, leftSum=0 ;
        int output = -1;
		while(i<arr.length){
            int j=arr.length-1, rightSum=0;
             while(j>i){
                 rightSum+= arr[j];
                 j--;
             }
            
            if(leftSum == rightSum){
               output = i; 
            }
            
            i++;
            leftSum += arr[i-1];
        }
        
        return output;
	}
		
		public static int []takeInput(){
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			
			int arr[] = new int [n];
			
			for(int i=0; i<arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			
			return arr;
		}
		
		

			public static void main(String[] args) {

				int arr[] = takeInput();
				
				System.out.println(arrayEquilibriumIndex(arr));
			}

}
