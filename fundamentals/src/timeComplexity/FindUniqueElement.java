package timeComplexity;

import java.util.Scanner;
import java.util.Arrays;

public class FindUniqueElement {
	public static int findUnique(int[] arr) {
		Arrays.sort(arr);
        
        int output = -1;
        int i=0, j=1; 
        while(i<arr.length && j<arr.length){
           
            if(arr[i] == arr[j]){
                i+=2;
                j=i+1;
            }
            else if(arr[i] != arr[j]){
                output = arr[i];
            }
            
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
				
				System.out.println(findUnique(arr));
			}

}
