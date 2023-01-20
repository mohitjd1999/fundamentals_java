package arrays;
import java.util.Scanner;

public class SwapAlternate {
	
	public static void Swap(int arr[]) {
		
		for(int i=0; i<arr.length-1; i+=2) {
			int temp = arr[i];
			arr[i] = arr[i+1];
			
			arr[i+1] = temp;
		}
		
		
		for(int element: arr) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
	
	public static int []takeInput(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		return arr;
	}
	

	public static void main(String[] args) {
		
		int arr[] = takeInput();
		
		Swap(arr);
		
	

	}

}
