
public class EvenOrOdd {
	static String evenOddCheck(int number) {
		String str ;
		if(number % 2 == 0)
			str = "Even Number";
		else
			str = "Odd Number";
		return str;
	}
	public static void main(String[] args) {
		try {
			int number = Integer.parseInt(args[0]);
			System.out.println(evenOddCheck(number));
		}
		catch(Exception e) {
			System.out.println("Error");
		}

	}

}
