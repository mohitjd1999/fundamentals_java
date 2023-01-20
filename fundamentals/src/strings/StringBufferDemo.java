package strings;

public class StringBufferDemo {

	public static void main(String[] args) { 
		StringBuffer str = new StringBuffer("abc");        // Mutable 
		System.out.println(str);
		

		str.setCharAt(0, 'd');
		str.append("def");
		System.out.println(str + " " + str.length());
		
		String s = "d";                                  // Immutable
		for(int i=0; i<5; i++) {
			s += 'z';
		}
		
		System.out.println(s);
		
		str.append((char)('a' + 1));
		System.out.println(str);
	}
}
