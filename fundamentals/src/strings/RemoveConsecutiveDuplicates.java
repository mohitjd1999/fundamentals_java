package strings;
import java.util.Scanner;

public class RemoveConsecutiveDuplicates {
	
   public static String removeConsecutiveDuplicates(String str) {
        
        
        char ch = str.charAt(0);
        String Output = String.valueOf(ch);
        
		for(int i=1; i<str.length(); i++){
            if(str.charAt(i-1) != str.charAt(i)){
                Output += str.charAt(i);
            }
        }
        
        return Output;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println(removeConsecutiveDuplicates(str));

	}

}
