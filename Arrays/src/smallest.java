
public class smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Java Program to print the smallest element in an array

		int[] element = { 17, 2, 12, 56, 32, 10, 54 };
		int smallelement = element[0];
		for (int j = 0; j < element.length; j++) {
			if (element[j] < smallelement)
				smallelement = element[j];
		}
		System.out.println(smallelement);
		
	}

}
