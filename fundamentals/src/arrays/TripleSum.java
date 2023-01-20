package arrays;
import java.util.Scanner;

public class TripleSum {
	
	public static int TotalPairSum(int arr[], int x){ 
		int count=0;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				for(int k=j+1; k<arr.length; k++ ) {
					if(arr[i]+ arr[j] + arr[k] == x) {
						count++;
					}
				}
				
			}
		}
		return count;
	}
	
	public static int []takeInput() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int []arr = new int [n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		return arr;	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int []arr = takeInput();
		int x = sc.nextInt();
		
		System.out.print(TotalPairSum(arr, x));
		
	}

}
;