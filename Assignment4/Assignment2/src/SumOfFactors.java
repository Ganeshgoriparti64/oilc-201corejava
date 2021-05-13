
public class SumOfFactors {
	   public static void findSumFactors(int num) {
				   int sum=0;
			       for(int i=1; i <= num; i++) {
			           if(num % i == 0)
			        	   sum =sum + i;
			       }
	               System.out.print (+sum );

			   }

			   public static void main(String[] args) {
                      try
                      {
  				        int num = Integer.parseInt(args[0]);
  				        if(num < 0)
  				        {
  				        	System.out.println(10/0);
  				        }
  				       findSumFactors(num);
                      }
                 catch(Exception e)
                      {
                	 System.out.println("Error");
                      }
	}

}

	


