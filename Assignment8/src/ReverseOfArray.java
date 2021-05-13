import java.util.Scanner;
public class ReverseOfArray {
			public static int[] getReverse(int []arr) {
	    	int result[] = new int[arr.length];
	    	int j = 0;
				for(int i = arr.length-1; i >= 0; i--)
				{
					result[j] = arr[i];
					j++;
				}
				
			return result;	
			}
			public static void main(String[] args) {
				int []arr = new int[10];
				Scanner s = new Scanner(System.in);
				System.out.println("Enter Ten Values");
				for(int i = 0; i< arr.length; i++)
				{
					arr[i] =s.nextInt();
					}
			int rev[] =	getReverse(arr);
				System.out.println("Reverse Of Array");
				for(int i = 0; i< rev.length; i++)
				{
					System.out.println(rev[i]);

					}
			}
}

		
	


