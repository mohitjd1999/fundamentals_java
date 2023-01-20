package arrays;
import java.util.Scanner;

public class PrintAllPairs {
	
	public static void PrintPairs(int arr[]) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				System.out.print("("+ arr[i] + ","+ arr[j] + ")");
			}
			System.out.println();
		}
		
	}
	
	public static int []takeInput() {
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
		
		PrintPairs(arr);
		
	

	}

}
