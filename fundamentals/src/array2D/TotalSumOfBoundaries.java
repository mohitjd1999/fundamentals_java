package array2D;
import java.util.Scanner;

public class TotalSumOfBoundaries {

    public static void totalsum(int[][] mat){
		int rows = mat.length;
		 int sum = 0;
    	
		for(int i=0; i<rows; i++){
            for(int j=0; j<mat[i].length; j++){
               
                if(i==j || (i+j) == rows-1){
                    sum+= mat[i][j];
                    System.out.println(i + " " + j + " " + sum);
                }
                else if (i==0|| j==0|| i==(rows-1)|| j==(mat[i].length-1)) {
                	sum+= mat[i][j];
                	System.out.println(i + " " + j + " " + sum);
                }

            }
        }
		
		System.out.println("The result is " + sum);
         
    }
	
	
	public static int[][] takeInput(){
       Scanner sc = new Scanner(System.in);
		
		int rows = sc.nextInt();
	    int columns = sc.nextInt();
	    
	    int arr[][] = new int [rows][columns];
	    
	    for(int i=0; i<rows; i++) {
	    	for(int j=0; j<columns; j++) {
	    		arr[i][j] = sc.nextInt();
	    	}
	    }
	    
	    return arr;
	}

	public static void main(String[] args) {
		int[][] input = takeInput();
		
		totalsum(input);       
	}

}
