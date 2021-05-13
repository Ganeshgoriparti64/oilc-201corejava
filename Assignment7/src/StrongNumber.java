import java.util.Scanner;
public class StrongNumber {
	public static String checkStrong(int num)
	{
		int fact , sum = 0, temp = num;
		String result =" ";
		while(temp != 0)
		{	
			fact = 1;
			int rem = temp % 10;
			for(int i = 1 ; i <= rem ; i++)
			fact = fact * i;
			sum = sum + fact;
			temp = temp/10;
		}
		if(sum == num)
		{
			result += "Strong Number";
		}
		else
		{
			result += "Not a Strong Number";
	}
		return result;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");				
		System.out.println(checkStrong(sc.nextInt()));
}
}


