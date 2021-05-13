
  public class Wishing { 
	  
      public static void main(String[] args)  
      {
    String str = args[0].toUpperCase();
    String name = args[1];
    String result = " ";
   
     if (str.equals("AM"))
     {
     result = "Good morning"  + " " +name;
	}
    else if (str.equals("PM"))
    {
	result = "Good Evening"  + " " +name;

    }
     else
   {
	 result = "Enter Either  am or pm" ;
   } 
    System.out.println( result);
    }
    }

