import java.util.Scanner;
public class AlarmClock {
		static String ringAlarm(int day, String time) {
			String output = "";
			if((day >=0 && day <=6) && ((time.equalsIgnoreCase("true")) || (time.equalsIgnoreCase("false")))){
				if((day == 0) || (day == 6)){
					if(time.equalsIgnoreCase("true"))
						output = "off";
					else
						output = "10:00";
				}
				else{
					if(time.equalsIgnoreCase("true")) {
						output = "10:00";
					}
					else
						output = "7:00";
				}
			}
			else {
				output = "Invalid Inputs";
			}
			
			return output;
		}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter two values");
			int day = sc.nextInt();
			String time = sc.next();
			
			System.out.println(ringAlarm(day, time));
		}
	}
