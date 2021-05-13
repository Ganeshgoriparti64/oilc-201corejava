import java.util.Scanner;
public class NaturalNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		System.out.println(getNaturalNumbers(sc.nextInt(), sc.nextInt()));
	}
	public static String getNaturalNumbers(int num1, int num2) {
		String result = " ";
		if (num1 < 0 || num2 < 0) {
			result += -1;
		} else if (num1 == 0 || num2 == 0) {
			result  +=  -2;
		}
		
		else {
			for(int i = num1; i <= num2; i++)
				result = result + i + " ";
			}
			return result;
	}

}



