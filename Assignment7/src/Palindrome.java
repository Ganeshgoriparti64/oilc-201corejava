	  import java.util.Scanner;
       public class Palindrome {
			  public static String reverse(int num) 
			  {
			    int temp = num, reverse = 0;
			    String result =" ";
			    while(temp != 0)
			    {
			      int rem = temp % 10;
			      reverse = (reverse * 10) + rem;
			      temp = temp / 10;
			    }
			    if (num == reverse)
			    {
			    	
			result += "Palindrome";
			  }
			    else 
			    {
			    	result += "Not A Palindrome";
			    }
			    return result;
			  }
			  
	    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("Enter A Number");
	    	System.out.println(reverse(sc.nextInt()));
	    }
	}






