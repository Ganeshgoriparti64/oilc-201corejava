
import java.util.Scanner;
public class StackMenuDriven {

	static int top = -1;
	static int stack[] = new int[5];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println(menu());

			int choice = sc.nextInt();
			int num;

			switch (choice) {
			case 1:
				System.out.println("Enter Element to be pushed");
				num = sc.nextInt();
				System.out.println(push(num));
				break;
			case 2:
				System.out.println(pop());
				break;
			case 3:
				System.out.println(display(stack));
				break;
			case 4:
				System.exit(0);

			}
		}
	}

	public static String display(int[] stack) {
		String res1 = "";
		for (int i = 0; i < stack.length; i++) {
			res1 += " " + stack[i];
		}
		return res1;
	}

	public static String pop() {
		String res = "";

		if (isEmpty()) {
			res = "Stack is Empty";
		} else {
			int ele = stack[top];
			top--;
			res = ele + " is Poped Out";
		}
		return res;
	}

	public static boolean isEmpty() {
		boolean b = false;

		if (top == -1) {
			b = true;
		}
		return b;
	}

	public static String push(int ele) {
		String res = "";
		if (isFull()) {
			res = "Stack Is Full";
		} else {
			stack[++top] = ele;
			res = ele + " is Pushed into Stack";
		}
		return res;
	}

	public static boolean isFull() {
		boolean b = false;

		if (top == stack.length - 1) {
			b = true;
		}
		return b;
	}

	public static String menu() {
		String menu = "Menu Driven Application\n";
		menu += "1.Push\n";
		menu += "2.Pop\n";
		menu += "3.Display\n";
		menu += "4.Exit\n";
		menu += "Choose any Option";
		return menu;
	}

}


