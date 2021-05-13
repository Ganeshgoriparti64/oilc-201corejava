public class Palindrome {
	static boolean isPolindrome(int num) {
		int temp = num, rem ,sum = 0;
		while(num > 0) {
			rem = num % 10;
			sum = (sum * 10) + rem;
			num = num / 10;
		}
		if(sum == temp)
			return true;
		else
			return false;
	}
	static String check(boolean check) {
		if(check)
			return "true";
		else
			return "false";
	}
	public static void main(String[] args) {
		 try
         {
		        int num = Integer.parseInt(args[0]);
		        if(num < 0)
		        {
		        	System.out.println(10/0);
		        }
				System.out.println(check(isPolindrome(num)));
         }
         
    catch(Exception e)
         {
   	 System.out.println("Error");
         }
}

}
	



      