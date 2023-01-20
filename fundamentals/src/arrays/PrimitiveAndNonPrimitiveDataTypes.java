package arrays;

public class PrimitiveAndNonPrimitiveDataTypes {
	
//	public static int primitive(int increment) {
//		increment = increment+1;
//		
//		return increment;
//	}
	
	
	public static void printArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
	
	
	
	public static void incrementArray(int input[]) {
		//input = new int[7];
		for(int i=0; i<input.length; i++) {
			input[i] = input[i]+1;
		}
	}

	public static void main(String[] args) {
//		int increment = 10;
//
//		primitive(increment);
//		System.out.println(increment);            // 10 
		
		int []arr = {1,2,3,4,5};
		
		incrementArray(arr);
		printArray(arr);
		
		
		
	}
	
	

}
