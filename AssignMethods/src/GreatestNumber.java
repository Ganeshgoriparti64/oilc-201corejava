
public class GreatestNumber {
	public static String greatestNumber(int first,int second) 
	{
		if(first > second)
			return " " +first;
			else
			return " "  +second;
			}
	public static void main (String []args) {
				try {
					int first = Integer.parseInt(args[0]);
					int second = Integer.parseInt(args[1]);
					System.out.println(greatestNumber(first,second));
				}		
		catch(Exception e) {
		System.out.println("Error");
			}
}
}


						

					
	


