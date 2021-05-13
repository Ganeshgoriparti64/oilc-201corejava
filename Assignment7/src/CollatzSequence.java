public class CollatzSequence{
			static String printCollatz(int n)
			{
				String res =" ";
				while (n != 1)
				{
					res += n + " ";
					if (n % 2 != 0)
						n = 3 * n + 1;
					else
						n = n / 2;
				}
			
				return res;
			}
			public static void main (String[] args)
			{
				System.out.println(printCollatz(6));
			}
		}

