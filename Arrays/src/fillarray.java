import java.util.Arrays;

public class fillarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Fill Array
		
        String[] fruits = {"Banana", "Orange", "Apple", "Mango"};
        Arrays.fill(fruits, "Kiwi");
         for (String i : fruits) {
              System.out.println(i);
		
	}
	}
}
