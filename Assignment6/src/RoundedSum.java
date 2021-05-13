import java.util.Scanner;
public class RoundedSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Three Numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		System.out.println(sumOfRoundedValues(num1, num2, num3));
	}
	public static int round(int num) {
		if(num % 10 >= 5) {
			return ((num / 10) + 1) * 10;
		}
		else {
			return (num / 10) * 10;
		}
	}
	static int sumOfRoundedValues(int num1, int num2, int num3) {
		int result = 0;
		if(num1 <= 0 || num2 <= 0 || num3 <= 0) 
		{
			result = -1;
		}
		else {
			result = round(num1) + round(num2) + round(num3); 
		}
		return result;
	}
}


