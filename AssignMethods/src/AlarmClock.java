

public class AlarmClock {
	 public static String Timings(int num, boolean b) {
		if((num == 0)||(num == 6)){
			if(b)
				return "off";
			else
				return "10:00";
		}
		else{
			if(b)
			{
				return "10:00";
			}
			else
				return "7:00";
		}
	}
	public static void main(String[] args) {
		try{
			int num=Integer.parseInt(args[0]);
			if((num  < 0)||(num > 6))
				System.out.println(10/0);
			String str=args[1];
			boolean b=true;
			if(str.equals("true")||str.equals("false"))
				b=Boolean.parseBoolean(str);
			else
				System.out.println(10/0);
			System.out.println(Timings(num,b));
		}
		catch(Exception e) {
			System.out.println("Error");
		}
	}
}

