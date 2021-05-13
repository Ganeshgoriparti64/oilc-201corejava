import java.util.Scanner;
public class OddRounder {
	    public static void main(String[] args) {
	    	System.out.println("Enter The  Number");
	    	Scanner sc =new Scanner(System.in);
			  int num = sc.nextInt();
	        System.out.println(oddRounder(num));
	    }

	    public static int oddRounder(int num) {
	    	int result = 0;
	    	if (num < 0)
	    	{
	    		result = -1;
	        }
	    	else if (num == 0 )
	    	{
	    		result = -2;
	    	}
	    	else if (num % 2 == 0)
	    	{
	    		result = num;
	    	}
	    	else 
	    	{
	    		result = ((num/10)+1) * (10);
	    	}
	    	return result;

	} 


}
