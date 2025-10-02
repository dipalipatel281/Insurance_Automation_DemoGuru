
public class largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Java Program to print the largest element in an array
		
		int[] element = {2, 12, 56, 32, 1, 10, 54, 98};
        int max = element[0];

        for (int i = 1; i < element.length; i++) {
            if (element[i] > max) {
                max = element[i];
            }
        }

        System.out.println(max);
		
	}
	}
