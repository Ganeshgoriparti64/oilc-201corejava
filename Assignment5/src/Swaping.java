import java.util.Scanner;
public class Swaping {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter two values");
          int firstNum = s.nextInt();
          int secondNum = s.nextInt();
          firstNum = firstNum + secondNum ;
          secondNum = firstNum - secondNum ;
          firstNum = firstNum - secondNum ;
  		System.out.println("Swapping Two Numbers   \n" + "FirstNum = " + firstNum + "\n" + "Secondnum = " + secondNum);

	}

}
