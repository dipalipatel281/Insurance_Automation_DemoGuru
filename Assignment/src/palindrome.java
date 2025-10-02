
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Program to check if number is palindrome or not
		
		int x,sum = 0,temp;
		int z = 101;
		temp = z;
		while (z>0) {
		     x=z%10;
		     sum = (sum*10)+x;
		z = z/10; }
		        if(temp==sum)   
		        System.out.println("Palindrome number ");   
		        else   
		        System.out.println("Not a Palindrome Number"); 
		
	}

}
