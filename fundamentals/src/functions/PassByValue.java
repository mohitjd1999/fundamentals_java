package functions;

public class PassByValue {
	
//	public static void increment(int n) {
//		n++;
//		System.out.println(n);
//	}
//	
//	public static void main(String[] args) {
//		int n=10;
//		increment(n);
//		System.out.println(n);
//
//	}

	
	public static void func1(int a,int b)
	{
	    int ans=1;
	    for(int i=0;i<b;i++)
	    {
	        ans*=a;
	    }
	    System.out.print(ans);
	}
	public static void main (String[] args) {
	    func1(2,5);
	}
}
