public class EvenList {
	static int x = 0;
	static int[] getEvenArray(int[] inputArray) {
		int[] newArray = new int[inputArray.length];
		if(inputArray.length > 10) {
			return null;
		}
		for(int i = 0; i < inputArray.length; i++) {
			if(inputArray[i] % 2 == 0) {
				newArray [x] = inputArray[i];
				x++;
			}
		}
		return newArray;
	}
	public static void main(String[] args) {
		int[] a = {1, 34, 65, 15, 3, 181, 20, 90, 104, 11};
		int[] evenNumbers = getEvenArray(a);
		if(evenNumbers == null)
			System.out.println(evenNumbers);
		else {
			for(int i = 0; i < x; i++) {
				System.out.println(evenNumbers[i]);
			}
		}
	}
}
		
	



	

