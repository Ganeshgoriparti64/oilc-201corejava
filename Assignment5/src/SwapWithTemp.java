import java.util.Scanner;
public class SwapWithTemp {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter two values");
          int firstNum = s.nextInt();
          int secondNum = s.nextInt();
          int temp = firstNum  ;
          firstNum = secondNum ;
          secondNum = temp ;
  		System.out.println("Swapping Two Numbers With Temporary Variable  \n" + "FirstNum = " + firstNum + "\n" + "Secondnum = " + secondNum);

	}

}



	

