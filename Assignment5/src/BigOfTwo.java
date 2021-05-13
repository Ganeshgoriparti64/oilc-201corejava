
public class BigOfTwo {
		public static void main(String[] args) {
			if(args.length != 2) {
				System.out.println("Please Enter Two Arguments Only");
				return;
			}
			try {
				int big = Integer.parseInt(args[0]);
				int nextNum = Integer.parseInt(args[1]);
				if(big < nextNum)
				{
					big = nextNum;
				}  
				System.out.println("Big Of Two = " +big);
			}
			catch(Exception e) {
				System.out.println("Please Enter Integer Values Only");
			}
		}
	}





