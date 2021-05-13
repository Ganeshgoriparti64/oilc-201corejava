public class EvenFinder {
	public static void main(String[] args) {
		try {
			int number=Integer.parseInt(args[0]);
			System.out.println(number%2 == 0);
	}
		catch(Exception e)
		{
			System.out.println("ERROR");
		}
	}
}
