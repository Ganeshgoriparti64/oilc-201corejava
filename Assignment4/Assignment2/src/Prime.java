
public class Prime {
			public static boolean isPrime(int number)
			{
				for (int i = 2; i < number ; i++) {
					if (number % i == 0)
					{
						return false;
					}
				}
						return true;
			
			}

			public static void main(String[] args)
			{
				try
                {
			        int number = Integer.parseInt(args[0]);
			        if(number <= 0)
			        {
			        	System.out.println(10/0);
			        }
			      System.out.println( isPrime(number));
                }
           catch(Exception e)
                {
          	 System.out.println("Error");
                }
}
}

