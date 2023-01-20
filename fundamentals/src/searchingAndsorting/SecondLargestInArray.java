package searchingAndsorting;
import java.util.Scanner;

public class SecondLargestInArray {
	
	public static int largest(int arr[]) {

		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(max1< arr[i]) {
				max2 = max1;
				max1 = arr[i];
			}else if(max1 == arr[i]) {
				
			}
			else {
				if(max2 < arr[i]) {
					max2 = arr[i];
				}
			}
		}
		
		return max2;
	}
	
//	public static void printArray(int arr[]) {
//		for(int element: arr) {
//			System.out.print(element + " ");
//		}
//	    System.out.println();
//	}

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
		int arr[] = takeInput();
		
		
		System.out.println(largest(arr));
		
		
	}

}
