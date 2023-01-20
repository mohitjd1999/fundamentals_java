package searchingAndsorting;
import java.util.Scanner;

public class CheckArrayRotation {
	
	 public static int arrayRotateCheck(int[] arr){
	        
	        int check = 0;
	    	for(int i=1; i<arr.length; i++){
	            if(arr[i-1] < arr[i]){
	               check =0;
	            }else{
	                check = i;
	                break;
	            }
	        }
	        
	        return check;
	    }
	


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
		
		
		System.out.println(arrayRotateCheck(arr));
		
		
	}

}
