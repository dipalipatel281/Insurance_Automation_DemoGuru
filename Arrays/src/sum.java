
public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Java Program to print the sum of all the items of the array
		
		int [] value = {2 , 4 , 6 , 8, 10 };
        int sum = 0;
        for (int k = 0 ; k<value.length ; k++) {
                sum = sum + value [k];
        }
        System.out.println(sum);
		
	}

}
