package fundamentals;

import java.util.Scanner;

public class DataTypes {
  public static void main(String[] args) {
//	    int a = 30;
//	    short s = 15;
//	    byte b = 4;
//	    long l = 115;
//	    double d = 3.99999;
//	    float f = 3.99f;
//	    
//	    String S = "Hello";
//	    char ch = 'a';
//	    boolean b1 = false;
	    
	    Scanner sc = new Scanner(System.in);
	    String str = sc.next();
	    int ab = sc.nextInt();
	    System.out.println(str + " " + ab);
	    
		sc.close();
  }
}
