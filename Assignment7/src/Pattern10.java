
public class Pattern10 {
	static String result = "";
	static String pattern10() {
		for(int i = 1; i <= 5; i++) {
			for(int j = 1;j <= 5;j++) {
				result += "*";
			}
			result += "\n";
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(pattern10());
	}

}




