package strings;

public class StringComparison {

	public static void main(String[] args) {
		int arr1[] = {1,2,3};
		int arr2[] = {1,2,3};
		
		if(arr1 == arr2) {
			System.out.println("Both are equal");
		}else {
			System.out.println("Both are unequal");
		}
		
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		
		System.out.println(str1 == str2);             // same references 
		System.out.println(str2 == str3);             // compares references
		System.out.println(str2.equals(str3));        // compares content 
		
	}

}
