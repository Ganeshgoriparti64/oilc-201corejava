import java.util.Scanner;
		public class SmallestOfArray {
			public static int getSmallest(int []arr) {
				int smallNum = arr[0];
				for(int i =0; i< arr.length; i++)
				{
					if (smallNum > arr[i])
					{
						smallNum = arr[i];
					}
					}

			return smallNum;	
			}
			public static void main(String[] args) {
				int []arr = new int[10];
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter Ten Values");
				for(int i =0; i< arr.length; i++)
				{
					arr[i] =sc.nextInt();
					}
				System.out.println(getSmallest(arr));

			}

		}

	


