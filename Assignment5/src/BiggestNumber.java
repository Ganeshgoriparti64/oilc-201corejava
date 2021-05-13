public class BiggestNumber {
	public static void main(String[] args) {
		if(args.length != 5) 
		{
			System.out.println("Please Enter Five Arguments");
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
			nextNum = Integer.parseInt(args[3]);
			
			if(big < nextNum)
			{
				big = nextNum;
			}
			nextNum = Integer.parseInt(args[4]);
			if(big < nextNum)
			{
				big = nextNum;
			}
			System.out.println("Biggest Number is = "+ big);
		}
		catch(Exception e)
		{
			System.out.println("Please enter Integer values only");
		}
		
	}
}


