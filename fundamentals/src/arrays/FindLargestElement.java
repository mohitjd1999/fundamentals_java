package arrays;
import java.util.Scanner;

public class FindLargestElement {
	
	public static int LargestElement(int arr[]){ 
		int max = Integer.MIN_VALUE;              // -infinity = -2147483647    
		for(int i=0; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
			
		}
		System.out.println("Largest Element of array is " + max);
		return max;
	}
	
	public static int []takeInput() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int []arr = new int [n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		
		return arr;	
	}

	public static void main(String[] args) {
		
		int []arr = takeInput();
		
		LargestElement(arr);
		
	}

}
