
public class SignFinder {
		public static void main(String[] args) {
			try{
				int number = Integer.parseInt(args[0]);
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
			catch(Exception e) {
				System.out.println("Error");
			}
		}

	}
