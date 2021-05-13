public class OddRounder {
	static String oddRound(int number) {
		if(number<0) {
			return "Error";
		}
		if(number %2 == 0)
			return "Even Number";
		else {
			number = (number / 10 +1) * 10;
			return "" + number;
		}
	}
	public static void main(String[] args) {
		try {
			int number = Integer.parseInt(args[0]);
			System.out.println(oddRound(number));
		}
		catch(Exception e) {
			System.out.println("Error");
		}
	}
}

