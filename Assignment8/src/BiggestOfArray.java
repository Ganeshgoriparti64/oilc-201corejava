import java.util.Scanner;
public class BiggestOfArray {
	public static int getBiggest(int []arr) {
		int bigNum = arr[0];
		for(int i =0; i< arr.length; i++)
		{
			if (bigNum < arr[i])
			{
				bigNum = arr[i];
			}
			}

	return bigNum;	
	}
	public static void main(String[] args) {
		int []arr = new int[10];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Ten Values");
		for(int i =0; i< arr.length; i++)
		{
			arr[i] =s.nextInt();
			}
		System.out.println(getBiggest(arr));

	}

}
