
	import java.util.Scanner;
	public class ReverseOrder {
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Two Values");
			System.out.println(getNumbersInRanges(sc.nextInt(),sc.nextInt()));
			
		}
		public static String getNumbersInRanges(int firstNum , int secondNum) 
		{
			String result ="";
			if(firstNum <0 || secondNum <0) {
				result += -1;
			}
			else if(firstNum ==  secondNum) {
				result += -2;
			}
			else if(firstNum < secondNum) {
				result += -3;
			}
			else if(firstNum- secondNum == 1) {
				result += -4;
			}
			else 
			{
				for(int i = firstNum - 1;i > secondNum;i--) 
				{
					result += i+" ";
				}
			}
			
			return result;
		}

	}


