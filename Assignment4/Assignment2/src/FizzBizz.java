
public class FizzBizz {

		public	static String getOutputString(int num) {
				if((num % 3 == 0) && (num % 5 == 0))
					return "FizzBizz";
				else if(num % 3 == 0)
					return "Fizz";
				else if(num % 5 == 0)
					return "Bizz";
				else
					return ""+ num;
			}

			public static void main(String[] args) {
				int num = Integer.parseInt(args[0]);
				try {
					if(num <= 0)
						System.out.println(10/0);
					System.out.println(getOutputString(num));
				}
				catch(Exception e) {
					System.out.println("Error");
				}
			}

		}

	


