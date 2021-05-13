import java.util.Scanner;
public class MultiplesOf100 {
	    public static void main(String[] args) {
	    	System.out.println("Enter The  Number");
	    	Scanner sc =new Scanner(System.in);
			  int num = sc.nextInt();
	        System.out.println(getNextMultipleOf100(num));
	    }
	    public static int getNextMultipleOf100(int num) {
	    	int result = 0;
	    	if(num <= 0)
	    	{
	    		result = -1;
	    	}
	    	else {
	    		result = ((num/100)+1) * (100);
	    	}
	    	return result;
	    }
	}


