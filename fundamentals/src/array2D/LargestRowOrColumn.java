package array2D;
import java.util.Scanner;

public class LargestRowOrColumn {

    public static void sum(int[][] mat){
	  
         int rows = mat.length;
         int max = Integer.MIN_VALUE;
         int cols;
         String str = " ";
         
         if(rows <= 0){
             System.out.print("row 0 " + max);
             return;
         }else{
             
             for(int i=0; i<rows; i++){
             int sum =0;
             for(int j=0; j<mat[i].length; j++){
                sum += mat[i][j];
             }
             
            if(max < sum){
                max = sum;
                str = "row " + i;
            }  
          }
             
         cols = mat[0].length;
         for(int j=0; j<cols; j++){
             int sum =0;
             for(int i=0; i<rows; i++){
                 sum += mat[i][j];
             }
             
           if(max < sum){
                max = sum;
                str = "column " + j;
            }  
         }
         
         System.out.print(str + " " + max);
             
         }        
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
		
		sum(input);       
	}

}
