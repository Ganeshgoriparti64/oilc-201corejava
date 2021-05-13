
public class Leastnumber {

	public static String leastNumber(int first,int second) 
	{
		if(first < second)
			return " " +first;
			else
				return " " +second;
			}
	public static void main (String []args) {
				try {
					int first = Integer.parseInt(args[0]);
					int second = Integer.parseInt(args[1]);
					System.out.println(leastNumber(first,second));
				}	
		catch(Exception e) {
		System.out.println("Error");
			}
}
}

