package strings;
import java.util.Scanner;

public class StringPalindrome {
	
	public static boolean palindrome(String str) {
		
		boolean palindrome = true;
		
		int length = str.length();
		

			for(int i=0; i<str.length()/2; i++) {
				if(str.charAt(i) == str.charAt(length-1)) {
					palindrome = true;
				}else {
					palindrome = false;
		            return palindrome;
				}
				
				length--;
			}

		
//		String reverseString = "";
//		
//		for(int i=str.length()-1; i>=0; i--) {
//			reverseString += str.charAt(i);
//		}
//		
//		if(str.equals(reverseString)) {
//			palindrome = true;
//		}else {
//			palindrome = false;
//		}

	
		return palindrome;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println(palindrome(str));

	}

}
