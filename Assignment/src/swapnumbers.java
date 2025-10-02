
public class swapnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Write a program to swap two numbers:
		   //Input  : m=9, n=5
		   //Output : m=5, n=9
		
        int m = 9;
        int n = 5;

        System.out.println("Before swapping: m = " + m + ", n = " + n);
        
        int temp = m;
        m = n;
        n = temp;

        System.out.println("After swapping: m = " + m + ", n = " + n);
		
	}

}
