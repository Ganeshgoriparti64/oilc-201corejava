
public class Rounder {
	public static void main(String[] args) {
				try {
					int number=Integer.parseInt(args[0]);
					if(number < 0) {
						System.out.println(10/0);
					}
					else
					if(number%2 == 0)
					{
						System.out.println((number/10+1)*10);
					}
					else 
					{
						System.out.println(number);
				}
				}
				catch(Exception e) {
					System.out.println("Error");
				}
			}
}

		



