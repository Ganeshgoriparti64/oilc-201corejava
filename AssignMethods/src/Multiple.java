public class Multiple {
	public static String  multiply (int number)
	{
		 number = (((number/100)+1)*100);
				return  "" +number;
			}
	public static void main(String [] args)
	{
		int number=Integer.parseInt(args[0]);
      System.out.println(multiply(number));
	}
	
}

	




