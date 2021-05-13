import java.util.Scanner;
public class SumOfDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number ?");
		int num = sc.nextInt();
	    System.out.println(getSumOfDigits(num));
	}

	static int getSumOfDigits(int num)	{
		int result = 0;
		if(num < 0) {
			result = -1;
		}
		else if(num >= 0 && num <= 10) {
			result = -2;
		}
		else if(num <= 99) {
			result = (num % 10) + (num / 10);
		}
		else {
			result = -3;
		}
		return result;
	}
}
