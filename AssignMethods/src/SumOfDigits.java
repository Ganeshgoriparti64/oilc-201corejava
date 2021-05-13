
		public class SumOfDigits {
			public static String sumOfDigit(int firstnum, int secondnum) 
			{
				
				return "" +(firstnum + secondnum);
			}
			public static void main(String []args)
			{
			String str = args[0];
			int firstnum =  Integer.parseInt(String.valueOf(str.charAt(0)));
			int secondnum = Integer.parseInt(String.valueOf(str.charAt(1)));
			System.out.println(sumOfDigit(firstnum,secondnum));
		}
		}
		

			


	


