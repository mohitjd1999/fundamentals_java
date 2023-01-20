package fundamentals;

public class DataTypeStorage {
     public static void main(String[] args) {
		int min = Integer.MIN_VALUE;
		int max = Integer.MAX_VALUE;
		
		System.out.println("Minimum Integer value is " + min );
		System.out.println("Maximum Integer value is " + max );
		
		char ch = 'a';                  // (ASCII value of a=97, b=98, c=99) 
		System.out.println(ch + 3);
		
		int i = ch;                     // char to int
		ch = (char)i;                   // int to char (use typecasting)
		
		ch = (char)(ch+1);              
		
		short s = 17; 
		int b =s;
		s = (short)b;                  // int to short
		
		int c = (int)10.6;             // double to int
		
		float f = 1.7f;                // double to float
		float fl = (float)3.999;
		
		System.out.println(4 + 4);      // integer values
		System.out.println(4 + 4.5);    // int + float/double
		System.out.println(4.1 + 4.79);  // float/double + double
		
	
	
	}
}
