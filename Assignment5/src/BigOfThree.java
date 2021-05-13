
public class BigOfThree {
	public static void main(String[] args) {
		if(args.length != 3) {
			System.out.println("Please Enter Three Arguments Only");
			return;
		}
		try {
			int big = Integer.parseInt(args[0]);
			int nextNum = Integer.parseInt(args[1]);
			if(big < nextNum)
			{
				big = nextNum;
			}
			nextNum = Integer.parseInt(args[2]);
			if(big < nextNum)
			{
				big = nextNum;
			}
			System.out.println("Big Of Three = " +big);
		}
		catch(Exception e) {
			System.out.println("Please Enter Integer Values Only");
		}
	}
}



