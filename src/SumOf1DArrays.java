import java.util.Scanner;
public class SumOf1DArrays {
 public	static int[] sumOfArrays(int[] a, int[] b) {
		int[] result = new int[a.length];
		
		for(int i = 0;i < a.length;i++) {
			result[i] = a[i] + b[i];
		}
		
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		int[] b = new int[5];
		
		System.out.println("Enter" +"  "  +a.length +" " +"Numbers Into First Array ");
		
		for(int i = 0;i < a.length;i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter" +" "  +b.length +" " + "Numbers  Into Second Array");
		for(int i = 0;i < b.length;i++) {
			b[i] = sc.nextInt();
		}
		
		int[] sum = sumOfArrays(a, b);
		
		System.out.println("Result Array is:");
		for(int i = 0;i < sum.length;i++) {
			System.out.print(sum[i] + " ");
		}
	}

}



