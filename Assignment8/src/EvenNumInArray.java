import java.util.Scanner;
public class EvenNumInArray {
	public static String getEven(int []arr) {
				String even = "";
	          for(int i =0; i< arr.length; i++)
				{
					if (arr[i] % 2 == 0 )
					{
						even  +=  arr[i]+ " " ;
					}
					}

			return even;	
			}
			public static void main(String[] args) {
				int []arr = new int[10];
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter Ten Values");
				for(int i =0; i< arr.length; i++)
				{
					arr[i] =sc.nextInt();
					}
				System.out.println(getEven(arr));

			}

		}

	



	


