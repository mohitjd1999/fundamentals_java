package recursion;
import java.util.Scanner;

public class ReplacePi {
	
	public static String removeChar(String str) {
		if(str.length()==0) {
			return "";
		}
		

		if(str.charAt(0)=='p' && str.charAt(1)=='i') {
			String smallOutput = removeChar(str.substring(2));
			return "3.14" + smallOutput;
		}else {
			String smallOutput = removeChar(str.substring(1));
			return str.charAt(0) + smallOutput;
		}
		
	}

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
//        char a = sc.next().charAt(0);
        
        System.out.println(removeChar(str));
        

	}

}
