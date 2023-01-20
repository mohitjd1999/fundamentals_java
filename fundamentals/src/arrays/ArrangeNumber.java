package arrays;
import java.util.Scanner;

public class ArrangeNumber {
	
	public static void arrange(int []arr, int n) {
		if(n%2==0) {
			int firsthalf =1;
			for(int i=0; i<n/2; i++) {
				arr[i] = firsthalf ;
				firsthalf+=2;
			}
			
			int secondhalf = n;
			for(int i=n/2; i<n; i++) {
				arr[i] = secondhalf;
				secondhalf-=2;
			}
			
		}else {
			int firsthalf =1;
			for(int i=0; i<=n/2; i++) {
				arr[i] = firsthalf ;
				firsthalf+=2;
			}
			
			int secondhalf = n-1;
			for(int i=n/2+1; i<n; i++) {
				arr[i] = secondhalf;
				secondhalf-=2;
			}
		}
	

	}
	
	public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
	
	public static int []takeInput(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int []arr = new int [n];
		
		sc.close();
		return arr;
	}
	
	public static void main(String[] args) {
		
		int arr[] = takeInput();
		int n = arr.length;
		arrange(arr, n);
		printArray(arr);
		
	}	

}
