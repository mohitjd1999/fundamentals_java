package recursion;

import java.util.Scanner;

public class CheckPalindrome {
	
	

	public static boolean checkPalindrome(String input) {
		
        return helper(input,0);
	}
	
     private static boolean helper(String input, int start) {	
		
		if(input.length() <= 1){
			return true;
		}
		
		if(input.charAt(start) != input.charAt(input.length()-1)) {
			return false;
		}
		
		boolean smallans = checkPalindrome(input.substring(start+1, input.length()-1));
		
		return smallans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		System.out.println(checkPalindrome(input));
		

	}

}
