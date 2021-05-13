
public class CheckArmStrong {
	public static  String  isArmStrong (int num) {	
		int i=num,r,sum=0;
		while(i>0)
		{
		r=i%10;
		sum=sum+(r*r*r*r);
		i=i/10;
		}
		if(num == sum)
		{
		return "Armstrong Number";
		}
		else
		{
		return "Not Armstrong Number";
		}
		}
		public static void main(String []args)
		{
			try
			{
				int num=Integer.valueOf(args[0]);
				int count=0;int temp=num;
				while(temp!=0)
				{
					temp=temp/10;
					count++;
				}
				if(num < 0 || count!=4 )
				{
					System.out.println(10/0);
				}
				
				System.out.println(isArmStrong(num)); //1634 
			}
			catch(Exception e)
			{
				System.out.println("Error");
			}			
		}
		}
		
	


