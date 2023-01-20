package strings;
import java.util.Scanner;

public class PrintAllSubstrings {
	
	public static void substrings(String str) {

//		for(int i=0; i<str.length(); i++) {
//			for(int j=i+1; j<=str.length(); j++) {
//				System.out.print(str.substring(i,j));
//			}
//			System.out.println();
//		}
		
		
		for(int len=1; len<=str.length(); len++) {
			int length = len;
			for(int i=0; i<=str.length()-len; i++) {
				System.out.println(str.substring(i, length));
				length++;
			}
			
			
		}


	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		substrings(str);

	}

}
