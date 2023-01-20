package array2D;

public class MoreAbout2DArrays {

	public static void main(String[] args) {
//		int[][] arr = new int[3][5];
//		
//	    System.out.println(arr[0][0]);   // 0

	    
	    int[][] arr = new int[4][];
//	    System.out.println(arr);             // Reference Id
//	    System.out.println(arr.length);      // prints 4
//	    System.out.println(arr[2]);          // Null 
//	    System.out.println(arr[2].length);   // Null Pointer Exception
	    
//	    for(int i=0; i<arr.length; i++) {
//	    	System.out.println(arr[i]);    // prints null
//	    }
	    
//	    for(int i=0; i<arr.length; i++) {
//	    	arr[i] = new int [5];  
//	    }
//	    
//	    System.out.println(arr[0][2]);    // prints 0
	    
	    for(int i=0; i<arr.length; i++) {    // Jagged Arrays
	    	arr[i] = new int [i+2];  
	    }
	    
	    for(int i=0; i<arr.length; i++) {
	    	for(int j=0; j<arr[i].length; j++) {
	    		System.out.print(arr[i][j]);
	    	}
	    	 System.out.println();
	    }
	    
	    
	}

}
