
public class OccurrenceCounter {
	static int getCount(int[] inputArray, int givenNumber) {
		int count = 0;
		for(int i = 0; i<inputArray.length; i++) {
			if(inputArray[i] == givenNumber) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] arr = {2, 8, 1, 12, 14, 2, 1, 10, -9, 2, 6};
		 int num = 2;
		 System.out.println(getCount(arr, num));
	}

}

