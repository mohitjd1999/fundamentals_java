package arrays;
import java.util.Scanner;

public class FindDuplicate {
	
	public static int Duplicate(int arr[]) {
		
		for(int i=0; i<arr.length; i++) {
			int count=0;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					 count++;
				}
			}
			
			if(count==1) {
				return arr[i];
			}
		}
		
		return -1;
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
		
		System.out.println(Duplicate(arr));
	}

}
