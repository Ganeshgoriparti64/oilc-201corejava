
public class FillMultiples {
	static int[] getMultiplesArray(int number) {
		int k= 1;
		int[] newArray = new int[10];
		if(number <= 0) {
			return null;
		}
		else {
			for(int i = 0;i < newArray.length;i++) {
				newArray[i] = number * k;
				k++;
			}
			return newArray;
		}
	}

	public static void main(String[] args) {
		int num = 6;
		int[] output = getMultiplesArray(num);
		if(output == null)
			System.out.println("null");
		else {
			for(int i = 0;i < output.length; i++) {
				System.out.print(output[i]+" ");
			}
		}
	}
}
