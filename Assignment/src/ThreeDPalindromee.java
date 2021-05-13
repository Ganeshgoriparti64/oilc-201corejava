
public class ThreeDPalindromee {

	public static void threedPalindrome(String str)
	{
	int size=str.length();
	String reverse = "";
	reverse = reverse  +str.charAt(size-1) + str.charAt(size-2) + str.charAt(size-3);
	System.out.println(str.equals(reverse));
	} 
    public static void main(String[] args) {
	String str=args[0];
		threedPalindrome(str);		
		

	}

}
