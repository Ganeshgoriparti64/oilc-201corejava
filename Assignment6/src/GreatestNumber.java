import java.util.Scanner;
public class GreatestNumber {
	    public static void main(String[] args) {
	    	 System.out.println("Enter Two  Numbers");
	     	 Scanner sc =new Scanner(System.in);
	 		 int num1 = sc.nextInt();
	 		 int num2 = sc.nextInt();
	        System.out.println(getGreatest(num1, num2));
	    }
	    public static int getGreatest(int num1, int num2) {
	    	int result = 0;
	    	if(num1 < 0 || num2 < 0 )
	    	  {
	    		result = -1;
	    	  }
	    	else if (num1 == 0 || num2 == 0)
	    	  {
	    		result = -2;
	    	  }
	    	else if(num1 > num2)
	    	   {
				result = num1;
	    	   }
				else
				{
				result = num2;
	            }
	    	return result ;
	}
}



