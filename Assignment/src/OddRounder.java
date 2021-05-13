
public class OddRounder {
	public static void main(String[] args) {
				try{
					int number=Integer.parseInt(args[0]);
					if(number < 0) {
						System.out.println(10/0);
					}
					if(number%2==0)
						System.out.println("Even Number");
					else
						System.out.println(((number/10)+1)*10);
				}
				catch(Exception e) {
					System.out.println("Error");
				}
			}

		}

	

