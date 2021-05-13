
public class OddPalindrome {
	static String getOddPalindromeList(int startNum, int endNum) {
		String s = "";
		for(int i = startNum;i <= endNum;i++) {
			int qu = i / 100;
			int rem = i % 10;
			if(qu == rem) {
				if(i % 2 != 0)
					if(s.length() == 0)
						s = s + i ;
					else
						s = s + "," + i;
			}
		}
		return s;
	}

	public static void main(String[] args) {
		int startNum = 100; 
		int endNum = 200;
		if((startNum < 100) || (endNum > 999) || (startNum > endNum)) {
			System.out.println("Error");
		}
		else
			System.out.println(getOddPalindromeList(startNum, endNum));
	}

}

	


