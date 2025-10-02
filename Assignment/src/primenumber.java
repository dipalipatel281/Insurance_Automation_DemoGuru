
public class primenumber {

		//Create a method which checks if number is prime number or not and its returns "true" if number prime and "false" if number is not a prime
		
        static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;

        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
        return true;
    }
        public static void main(String[] args) {
                // TODO Auto-generated method stub

                if (isPrime(2))
            System.out.println(" true");
        else
            System.out.println(" false");
		
	}

}

