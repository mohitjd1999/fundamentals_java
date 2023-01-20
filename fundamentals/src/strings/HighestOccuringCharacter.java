package strings;
import java.util.Scanner;

public class HighestOccuringCharacter {
	
	public static char highestOccuringChar(String str) {
	       
        int arr[] = new int [256];
        
        char[] ch = str.toCharArray();
        
        char output = ' ';
        
		for(int i=0; i<str.length(); i++){
           arr[ch[i]]++;
        }
        
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
                output = (char)i;
            }
        	
        	
        }
        
        return output;
	}
        

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println(highestOccuringChar(str));

	}

}
