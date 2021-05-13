import java.util.Scanner;
 public class DigitChecker {
			    public static void main(String[] args) {
			    	System.out.println("Enter a number");
			    	Scanner sc =new Scanner(System.in);
			        System.out.println(getDiffOfDigits(sc.nextInt())) ;
			    }
			    public static int getDiffOfDigits(int num)
			    {   
			    	int result = 0;
			    	if (num >= 10 && num <= 99)
			    	{
			    	 result =  num / 10 - num  % 10 ;
			    	}
			    else if (num > 99)
			    {
			    	result = -2;
			    }
			    else if( num >= 0 && num <= 9)
			    {
			    	result = -1;
			    }   	
		return result;
			    }
		}

	


