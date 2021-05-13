import java.util.Scanner;
public class ArmstrongInRange {
static String getArmstrong(int first, int second)
		    for(int i = first  ; i < second; i++) {
		      int count = 0;
		      int result = 0;
		      int originalNumber = i;
		      while (originalNumber != 0) {
		        originalNumber /= 10;
		        count++;
		      }

		      originalNumber = i;

		      while (originalNumber != 0) {
		        int remainder = originalNumber % 10;
		        result += Math.pow(remainder, count);
		        originalNumber /= 10;
		      }

		      if (result == i)
		        System.out.print(i + " ");
		      }
		  }
		  public static void main(String[] args) {
			  System.out.println("Enter Two Numbers");

		}


