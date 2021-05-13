
public class Sum {
	static int num = 0;
	static String sumArgs(int k) {
			if(k != 0) 
			{
				k= (k/ 10 + 1) * 10;
			}
			return "" + (num + k);
	}
	public static void main(String[] args) {
		int[] arr = new int[args.length];
		try {
			for(int i = 0 ; i < arr.length; i++) {
				arr[i] = Integer.parseInt(args[i]);
				if(arr[i] < 0)
					System.out.println(10 / 0);
				num = Integer.parseInt(sumArgs(arr[i]));
			}
			System.out.println(num);
		}
		catch(Exception e) {
			System.out.println("Error");
		}
	}

}


	


	


