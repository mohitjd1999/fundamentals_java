package strings;
import java.util.Scanner;

public class ReverseEachWord {
	
	public static String reverseEachWord(String str) {
		String reverseString = "";
		for(int i=0; i<str.length(); i++) {
			
			if(str.charAt(i) == ' ') {
				System.out.print(reverseString + " ");
				reverseString = "";
			}else {
				reverseString = str.charAt(i) + reverseString;
			}
			
		}		
		
		return reverseString;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println(reverseEachWord(str));
		

	}

}
