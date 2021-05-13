import java.util.Scanner;
public class BooleanValue {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Three Boolean values:");
		System.out.println(countBoolean(sc.nextBoolean(),sc.nextBoolean(),sc.nextBoolean()));
	}
	public static boolean countBoolean(boolean val1, boolean val2, boolean val3)
	{
		int count = 0;
		if(val1) {	
	    count++;
		}
		if(val2) {
		count++;
		}
		if(val3) {
		count++;
		}
		if(count >= 2) {
			return true;
		}
		else {
		return false;
		}
	}

}



