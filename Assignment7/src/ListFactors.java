   import java.util.Scanner;
    public class ListFactors {
		   public static String findFactors(int num) {
			String result = " ";
		     for(int i = 1; i <= num; i++)
		     {
		    if(num % i == 0)
            result += i +" "     ;
		       }
		     return result;
		   }
	  public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter A Number");
		 int num = sc.nextInt();
		System.out.println( findFactors(num));
               }
                            
}





