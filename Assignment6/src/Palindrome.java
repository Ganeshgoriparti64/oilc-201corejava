import java.util.Scanner;
public class Palindrome {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter any number");
		 int num = sc.nextInt();
		 System.out.println(isPalindrome(num));
	    }
	    public static int isPalindrome(int num) {
	         int result = 0;
	         int qu = num / 100;
	         
	         if(num <= 0) {
	        	 result = -1;
	         }
	         else if(qu == 0 || qu >= 10) {
	        	 result = -2;
	         }
	         else if ((num / 100) == (num % 10)) {
	        	 result = 1;
	         }
	         else {
	        	 result = 0;
	         }
	         return result;
	    }
}

	



