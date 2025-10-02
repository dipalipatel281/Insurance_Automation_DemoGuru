import java.util.ArrayList;

public class remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


        ArrayList <String> list2 = new ArrayList <> ();
        
        list2.add("Virginia");
        list2.add("New York");
        list2.add("Florida");
        list2.add("Las Vegas");
        list2.add("Chicago");
        
        System.out.println(list2);
        
        list2.remove("Florida");
        
        System.out.println(list2);
		
	}

}
