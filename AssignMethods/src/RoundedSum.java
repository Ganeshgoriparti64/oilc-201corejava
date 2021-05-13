	
public class RoundedSum {
	static int sum=0;
	 public static String roundedSum(int n) {
			if(n != 0) {
				int rem = n % 10;
				if(rem >= 5) {
					n=(n/10+1)*10;
				}
				else if((rem < 5) && (rem > 0)) {
					n = (n / 10) * 10;
				}
			}
			return "" + (sum + n);
		}
	public static void main(String[] args) {
		int[] arr=new int[args.length];
		try {
			for(int i=0; i<arr.length; i++) {
				arr[i]=Integer.parseInt(args[i]);
				if(arr[i] < 0)
				{
					System.out.println(10/0);
				}
				sum = Integer.parseInt(roundedSum(arr[i]));
			}
			System.out.println(sum);
		}
		catch(Exception e) {
			System.out.println("Error");
		}
	}
}



