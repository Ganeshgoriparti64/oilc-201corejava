
public class Pattern5 {
	static String output = "";
	static String pattern5() {
		for(int i = 1; i <= 5; i++) {
			for(int j = 1;j <= i;j++) {
				output += i + " ";
			}
			output += "\n";
		}
		return output;
	}
	
	public static void main(String[] args) {
		System.out.println(pattern5());
	}
}
