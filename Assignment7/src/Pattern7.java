
public class Pattern7 {
	static String output = " ";
	static String pattern7() {
		for(int i = 5; i >= 1; i--) {
			for(int j = i;j >= 1;j--) {
				output += j + " ";
			}
			output += "\n";
		}
		return output;
	}
	public static void main(String[] args) {
		System.out.println(pattern7());
	}
}

