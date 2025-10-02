
public class classobjectdemo {

public static void main(String[] args) {
		// TODO Auto-generated method stub

		objectdemo d1 = new objectdemo ();
        objectdemo d2 = new objectdemo ();
        objectdemo d3 = new objectdemo ();
        
        d1.name = "Dipali Patel"; 
        d1.var = "Virginia" ;
        
        d2.name = "Dipali Patel"; 
        d2.var = "Kenya" ;
        
        d3.name = "Java"; 
        d3.var = "Testing" ;
        
        System.out.println (d1.name + " lives " + "in " + d1.var);
        
        System.out.println (d2.name + " was " + "born in " + d2.var);
        
        System.out.println (d3.name + " " + d3.var);
        
		
	}

}
