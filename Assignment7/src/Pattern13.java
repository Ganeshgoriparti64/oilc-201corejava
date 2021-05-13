	import java.util.Scanner;
public class Pattern13 {
		static String createStarPattern(int num) {
			String result = "";
			
			for(int i = 1; i <= num ;i++) {
				for(int j = 1;j <= i;j++) {
					result += "* ";     
				}
				result += "\n";
			}
			
			return result;
		}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter No Of Stars   ");
			int num = sc.nextInt();
			System.out.println(createStarPattern(num));
		}

	}


