
public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Print Fibonacci series in Java
		
		int n = 10; // Number of terms to print
	       int n1 = 0, n2 = 1;
	       for (int i = 1; i <= n; ++i) {
	           System.out.print(n1 + " ");
	           int nextTerm = n1 + n2;
	           n1 = n2;
	           n2 = nextTerm;
		
	}

}
}