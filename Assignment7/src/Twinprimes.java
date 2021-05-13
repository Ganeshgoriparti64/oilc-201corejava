import java.util.Scanner;
public class Twinprimes {
	static String getTwinPrimes(int num1, int num2) {
		String str = "";
		int[] arr = new int[50];
		int x = 0;
		for(int i = num1;i <= num2;i++) {
			boolean b = true;
			for(int j = 2;j < i;j++) {
				if(i % j == 0) {
					b=false;
					break;
				}
			}
			if(b) {
				arr[x] = i;
				x++;
			}
		}
		for(int i = 0; i < x;i++) {
			if(arr[i+1] - arr[i] == 2) {
				str = str + arr[i] + "," + arr[i+1] + ";";
			}
		}
		return str;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		boolean b = true;
		if((num1 < 1) || (num2 > 100) || (num1 >= num2)) {
			System.out.println("Error");
			b = false;
		}
		if(b) {
			System.out.print(getTwinPrimes(num1, num2));
		}
	}

}



