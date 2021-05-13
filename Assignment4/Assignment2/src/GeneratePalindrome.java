public class GeneratePalindrome {
	static String output="";
	static String getPolindromeList(int num) {
		int temp, rem, rev=0, sum;
		temp=num;
		output = output + temp ;
		while(num > 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		if(rev == temp)
			return output;
		output = output + "," + rev + ",";
		sum = temp + rev;
		return getPolindromeList(sum);
	}
	static boolean check(int num) {
		if((num < 100) || (num >= 1000)) {
			System.out.println("Error");
			return false;
		}
		else
			return true;
				
	}
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		if(check(num))
		 System.out.println(getPolindromeList(num));
	}

}

	


