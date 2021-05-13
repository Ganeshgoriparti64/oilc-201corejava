
public class Pattern8 {
			static String output = " ";
			static String pattern8() {
				int count = 1;
				for(int i = 1; i <= 5; i++) {
					count = i;
					for(int j = 1;j <= i;j++) {
						output += count + " ";
						count++;
					}
					output += "\n";
				}
				return output;
			}
			public static void main(String[] args) {
				System.out.println(pattern8());
			}
		}



	


