
public class SignFinder {
		public static void signFind(int number) {
				if(number > 0)
				{
					System.out.println("Positive Value");
				}
				else 
					if(number < 0) 
					{
					System.out.println("Negative Value");
					}
				else
				{
					System.out.println("Zero");
				}
		}
			public static void main(String[] args) {
			try{
				int number = Integer.parseInt(args[0]);
				signFind(number);
			}
			catch(Exception e) {
				System.out.println("Error");
			}
		}
		}
	


