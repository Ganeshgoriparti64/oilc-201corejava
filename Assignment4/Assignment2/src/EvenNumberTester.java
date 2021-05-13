
public class EvenNumberTester {
	public static boolean isEven(int num) {
		if(num % 2 == 0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		try {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			if(num1 > num2) {
				int temp = num1;
				num1 = num2;
				num2 = temp;
			}
			if((num1 < 0) || (num2 < 0))
				System.out.println(10/0);
			for(int i = num1; i <= num2;i++) {
				if(isEven(i))
					System.out.print(i + " ");
			}
		}
		catch(Exception e) {
			System.out.println("Error");
		}
	}

}


					