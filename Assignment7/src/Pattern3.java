
public class Pattern3 {
	static String output = "";
	static String pattern3() {
		for(int i = 1; i <= 5; i++) {
			for(int j = 5;j >= 1;j--) {
				output += j + " ";
			}
			output += "\n";
		}
		return output;
	}
	
	public static void main(String[] args) {
		System.out.println(pattern3());
	}

}

	

