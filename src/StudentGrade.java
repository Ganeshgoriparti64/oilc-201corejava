import java.util.Scanner;
public class StudentGrade {
	
		public static boolean isPass(int[] sub) {
			boolean b = true;
			for(int i = 0;i < sub.length;i++) {
				if(sub[i] < 35) {
					b = false;
					break;
				}
			}
			
			return b;
		}
		public static void displayMarks(int[] sub) {
			System.out.println("Student Marks are:");
			for(int i = 0;i < sub.length;i++) {
				System.out.print(sub[i]+" ");
			}
		}
		
		public static int total(int[] sub) {
			int total = 0;
			for(int i = 0;i < sub.length;i++) {
				total += sub[i];
			}
				
			return total;
		}
		
		static String findGrade(int[] sub) {
			int total = total(sub);
			int avg;
			String result = "";
			avg = total / sub.length;
				
			if(avg >= 75) {
				result += " Grade- A";
			}
			else if(avg >= 60 && avg < 75) {
				result += " Grade-B";
			}
			else if(avg >=50 && avg < 60) {
				result += " Grade-C";
			}
			else {
				result += " Grade-D";
			}
			
			return result;
		}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int[] sub = new int[5];
			System.out.println("Enter Subject Marks");
			
			for(int i = 0;i < sub.length;i++) {
				sub[i] = sc.nextInt();
			}
			
			if(isPass(sub)) {
				displayMarks(sub);
				System.out.println("\nTotal: " + total(sub));
				System.out.println("Grade : " + findGrade(sub));
			}
			else {
				System.out.println("FAIL");
			}
		}

	}



