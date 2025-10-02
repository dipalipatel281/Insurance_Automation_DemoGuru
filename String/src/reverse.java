
public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Print Reverse of any string
		
		String name = "My name is Dipali";
        StringBuilder reversestring = new StringBuilder(name);
        reversestring.reverse();  
        String result = reversestring.toString();   
                System.out.println (result);
		
	}

}
