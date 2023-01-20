package recursion;
import java.util.Scanner;

public class Strings {
	
	public static String replaceChar(String str, char a, char b) {
		if(str.length()==0) {
			return str;
		}
		
		String smallOutput = replaceChar(str.substring(1), a, b);
		
		if(str.charAt(0)==a) {
			return b + smallOutput;
		}else if(str.charAt(0)==b) {
			return a + smallOutput;
		}else {
			return str.charAt(0) + smallOutput;
		}
	}

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);
        
        System.out.println(replaceChar(str, a, b));
        

	}

}
