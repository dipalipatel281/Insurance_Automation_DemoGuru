import java.util.Arrays;
import java.util.Collections;

public class descending {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Java Program to sort the elements of an array in ascending order
	
		Integer a[] = { 2, 34, 76, 23, 3, 54, 89, 1 };
		Arrays.sort(a, Collections.reverseOrder());
		System.out.println(Arrays.toString(a));

	}

}