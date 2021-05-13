import java.util.*;
public class Pattern12 {
			static String display(int rows) {
				String result = "";
				for(int i = 1;i <= rows;i++) {
					int count = i;
					for(int j = 1;j <= i;j++) {
						result += count+" ";
						count  = count + i;
					}
					result += "\n";
				}
				
				return result;
			}

			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter  No Of Rows ");
				int rows = sc.nextInt();
				System.out.println(display(rows));
			}

		}

	


