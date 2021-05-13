import java.util.Scanner;
public class SearchNumInArr {
	public static String searchElement(int[] arr, int key) {
		String res = "";
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] == key) 
			{
				res += key +  " Found At Position" +" "  +(i+1) +"\n" ;
			}
		}
		return res;
	}
			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				int arr[] = new int[10];
				System.out.println("Enter Ten Values Into An Array:");
				for (int i = 0; i < arr.length; i++)
				{
					arr[i] = sc.nextInt();
				}

				System.out.println("Enter  Value To Search:");
				int key = sc.nextInt();
				System.out.println(searchElement(arr, key));
			}

	}





