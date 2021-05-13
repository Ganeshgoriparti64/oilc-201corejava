import java.util.Scanner;
public class FourPerLine {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		System.out.println(getFourPerLine(sc.nextInt()));
	}
	public static String getFourPerLine(int num) 
	{
		String result = "";
		
		if(num < 0) {
			result += -1;
		}
		else if(num == 0) {
			result +=-2;
		}
		else if(num > 99){
			result +=-3;
		}
		else{
			for(int i = 1;i <= num;i++) {
				if(i % 4==0) {
			 result += i+"\n";
				}
				else {
				result +=i+" ";
				}
			}
		}
		return result;
	}

}



