import java.util.Scanner;
public class LeastNumber {
	public static void main(String[] args) {
        System.out.println("Enter Two  Numbers");
    	Scanner sc =new Scanner(System.in);
		        int num1 = sc.nextInt();
		        int num2 = sc.nextInt();
		        System.out.println(getLeastNum(num1, num2));
		    }

		    public static int getLeastNum(int num1, int num2) {
		    	int result = 0;
		    	if(num1 < 0 || num2 < 0 )
		    	  {
		    		result = -1;
		    	  }
		    	else if (num1 == 0 || num2 == 0)
		    	  {
		    		result = -2;
		    	  }
		    	else if(num1 < num2)
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


