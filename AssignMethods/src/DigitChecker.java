
public class DigitChecker {
			public static String digitChecker(String str) {
						String s1 = (String.valueOf(str.charAt(0)));
						String s2 = (String.valueOf(str.charAt(1)));
						int firstnum = Integer.parseInt(s1);
						int secondnum = Integer.parseInt(s2);
						return "  " +(firstnum - secondnum);
					}
			
			public static void main(String[] args) {
				String str=args[0];
          System.out.println( digitChecker(str));
				}	

	}


