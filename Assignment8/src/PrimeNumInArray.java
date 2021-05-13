import java.util.Scanner;
public class PrimeNumInArray {
	public static String getPrime(int []arr) {
				String prime = "";
	          for(int i = 0; i< arr.length; i++)
				{
					Boolean b =true ;

					for (int j = 2; j < arr[i] ; j++) 
					{
						if (arr[i] % j == 0)
						b = false ;
					}
					 if (b)
			          {
			        	prime += arr[i] + " ";  
			          }
				}
			return prime;	
			}
			public static void main(String[] args) {
				int []arr = new int[10];
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter Ten Values");
				for(int i =0; i< arr.length; i++)
				{
					arr[i] =sc.nextInt();
					}
				System.out.println(getPrime(arr));

			}

		}



	


