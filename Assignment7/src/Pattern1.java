
public class Pattern1 {
	static  String output = "";
	static String pattern1() {
		for(int i = 1; i <= 5; i++) {
			for(int j = 1;j <= 5;j++) {
				output += i + " ";
			}
			output += "\n";
		}
		return output;
	}
	
	public static void main(String[] args) {
		System.out.println(pattern1());
	}

}
