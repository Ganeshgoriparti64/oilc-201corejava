
public class Factorial {
	public static String calFactorial(int num) 
	{
		        int fact=1;
		        for(int i = 1; i <= num; i++)
		        {
		        fact = fact*i;
		        }
		        return " "+fact;
	}
		    	public static void main(String[] args) {
		    		try {
				        int num= Integer.parseInt(args[0]);
                      if(num < 0)
                      {
                    	  System.out.println(10/0);
                      }
                     System.out.println (calFactorial(num));
		    		}
		    	catch(Exception e)
		    	{
		    		System.out.println("Error");
		    		
		    	}

		 
		        }
		}
		 
	


