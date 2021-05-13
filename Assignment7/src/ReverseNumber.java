import java.util.Scanner;
public class ReverseNumber {
		  public static int reverse(int num) 
		  {
		    int reverse = 0;
		    while(num != 0)
		    {
		      int rem = num % 10;
		      reverse = (reverse * 10) + rem;
		      num = num / 10;
		    }
		return reverse;
		  }
    public static void main(String[] args) {
    	Scanner sc =new Scanner(System.in);
    	System.out.println("Enter A Number");
    	System.out.println(reverse(sc.nextInt()));
    }
}



