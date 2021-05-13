
public class Pattern11 {
	static String output = "";
		static String pattern11() {
			for(int i = 1; i <= 5; i++) {
				for(int j = 1;j <= 5;j++) {
					if(i == 1 || i == 5) {
						output += "*";
					}
					else if(j == 1 || j==5) {
						output += "*";
					}
					else {
						output += " ";
					}
				}
				output += "\n";
			}
			return output;
		}
		
		public static void main(String[] args) {
			System.out.println(pattern11());
		}

	}

	


