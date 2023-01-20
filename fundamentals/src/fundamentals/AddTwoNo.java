package fundamentals;

import java.util.Scanner;

public class AddTwoNo {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first Number");
		int a = sc.nextInt();
		System.out.println("Enter the second Number");
		int b = sc.nextInt();
		
		int c = a+b;
		System.out.println("Result of a+b is " + c);
		
//		System.out.println("Enter a Word");
//		String str = sc.nextLine();
//		char ch = str.charAt(0);
//		System.out.println(ch);
		
		sc.close();
	}
}
