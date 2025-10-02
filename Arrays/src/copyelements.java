
public class copyelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Java Program to copy all elements of one array into another array
		
		int[] array = {2, 4 , 6, 8 };
        for ( int i = 0 ; i<array.length ; i++ ) {
                System.out.println(array[i]);
                }
        int copyarray [] = new int[8]; {
        }
        for ( int i = 0 ; i<array.length ; i++ ) {
        copyarray [i] = array [i]; 
        }
        for ( int i = 0 ; i<array.length ; i++ ) {
        System.out.println(copyarray [i]); 
	}

}
}