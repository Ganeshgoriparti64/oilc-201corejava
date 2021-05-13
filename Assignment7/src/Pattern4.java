
public class Pattern4 {
	static String output = "";
		static String pattern4() {
			for(int i = 1; i <= 5; i++) {
				for(int j = 1;j <= i;j++) {
					output += j + " ";
				}
				output += "\n";
			}
			return output;
		}
		public static void main(String[] args) {
			System.out.println(pattern4());
		}

	}

		



	

