package arrays;
import java.util.Scanner;

public class ReturnArraySum {
	
	public static int sum(int arr[]){
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		
		return sum;
	}
	
	public static int []takeinput() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int []arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		return arr;
	}

	public static void main(String[] args) {
		
		int []arr = takeinput();
		
		System.out.println(sum(arr));

	}

}
