package arrays;
import java.util.Scanner;

public class InputOfArraysUsingFunction {
	
	public static void printOutput(int[] arr) {
		int n = arr.length;
		
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]);
		}
	}
	
	public static int[] takeInput() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int []arr = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Enter the array on " + i + " ith position");
			
			arr[i] = sc.nextInt();
		}
		
		sc.close();

		return arr;
	}
	
    public static void main(String[] args) {
	   
	   int[] arr = takeInput();
	   
	   printOutput(arr);
	
   }
}
