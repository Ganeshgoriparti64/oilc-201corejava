
public class Adder {
	public static int getSum(int num1, int num2) {
		return (num1 + num2);
	}
	static boolean validate(int number) {
		if(number > 0)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		try {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			if(validate(num1) && (validate(num2)) && (args.length == 2)) {
				System.out.println(getSum(num1, num2));
			}
			else
				System.out.println(10/0);
		}
		catch(Exception e) {
			System.out.println("Error");
		}
	}
}

	


