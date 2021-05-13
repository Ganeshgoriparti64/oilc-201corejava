
public class EvenFinder {
		public static String evenFinder(int number) {
			return" "	+(number%2 == 0);
		}
	public static void main(String[] args) {
		try {
			int number=Integer.parseInt(args[0]);
        System.out.println( evenFinder(number));
	}
		catch(Exception e)
		{
			System.out.println("ERROR");
		}
	}

}
