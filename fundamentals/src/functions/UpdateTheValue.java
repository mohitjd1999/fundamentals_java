package functions;


public class UpdateTheValue {
//	public static int increment(int n) {
//		n++;
//		return n;
//	}
//
//	public static void main(String[] args) {
//	 Scanner sc = new Scanner(System.in);
//	 int n=sc.nextInt();
//	 
//	 n = increment(n);
//	 
//	 System.out.println(n);
//
//	 sc.close();
//	}
	
	public static int func(int a){
	    a += 10;
	    return a;
	}

	public static void main(String[] args) {
	    int a = 5;
	    func(a);
	    System.out.println(a);
	}

}
