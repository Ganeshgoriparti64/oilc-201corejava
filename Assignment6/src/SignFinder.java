import java.util.Scanner;
public class SignFinder {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(findSign(num));
	}
		    public static int findSign(int num) {
		    	int result = 0 ;
		    	if (num == 0)
		    	{
		    		result = 0 ;
		    	}
		    	else if (num > 0  )
		    	{
		    		result = 1 ;
		    	}
		    	else 
		    	{
		    		result = -1 ;
		    	}
		    	return result ;
		    }
		}

	


