
public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Java Program to print the duplicate elements of an array

		int[] values = { 2, 4, 6, 8, 2, 10, 4, 14, 2 };
		for (int i = 0; i < values.length; i++) {
			for (int j = i + 1; j < values.length; j++) {
				if (values[i] == values[j]) {

					System.out.println(values[j]);
				}

			}
		}
	}
}