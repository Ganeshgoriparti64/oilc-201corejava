import java.util.Scanner;
    public class SumOfFactors {
		   public static int findFactors(int num) {
			   int sum = 0;
	     for(int i = 1; i <= num; i++)
		     {
		    if(num % i == 0)
		    	sum = sum + i;
		       }
		     return sum;
		   }
	  public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter A Number");
		 int num = sc.nextInt();
		System.out.println( findFactors(num));
               }
                            
}



