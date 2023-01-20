package strings;
import java.util.Scanner;

public class ReverseStringWordwise {
	
	public static String reverseEachWord(String str) {
		String reverseString = "";
		
		for(int i=str.length()-1; i>=0; i--) {
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
