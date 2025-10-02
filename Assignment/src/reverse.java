
public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Print Reverse of any number
		
		int number = 5298, reverse = 0;
	     while (number !=0) {
	     int remainder = number % 10;
	        reverse = reverse * 10 + remainder;
	        number = number/10;
	                }
	    System.out.println ("Reverse number is " + reverse);
		
	}

}
