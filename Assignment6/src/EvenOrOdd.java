import java.util.Scanner;
public class EvenOrOdd {
		    public static void main(String[] args) {
		        System.out.println("Enter a number");
		        Scanner sc = new Scanner(System.in);
		        int num = sc.nextInt();
		        System.out.println(isEvenOrOdd(num));
		    }

		    public static String isEvenOrOdd(int num) {
		    	String str =" ";
		    	if (num <= 0)
		    	{
		    		str = "Invalid Input" ;
		    }
		    	else if(num % 2 == 0)
		    	{
		    		str = "Even";
		}
		    	else 
		    	{
		    		str = "Odd";
		    	}
		    	return str ;
	}

}
