import java.util.Scanner;
	public class NoOfDigits {
		  public static int countDigits(int num) 
		  {
		    int count = 0;
		    while(num != 0)
		    {
		      num = num / 10;
		      count ++;
		    }
		return count;
		  }
    public static void main(String[] args) {
    	Scanner sc =new Scanner(System.in);
    	System.out.println("Enter A Number");
    	System.out.println(countDigits(sc.nextInt()));
    }
}






