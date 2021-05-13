
public class BooleanValue {
	public static void main(String[] args) {
				String str[] = new String[args.length];
				Boolean[] b = new Boolean[str.length];
				try {
					for(int i=0;i<str.length;i++) {
						str[i] = args[i];
						if((str[i].equals("true"))||(str[i].equals("false"))){
							b[i] = Boolean.parseBoolean(str[i]);				
						}
						else
							System.out.println(10/0);
					}
					int count = 0;
					for(int i = 0; i <str.length; i++) {
						if(b[i]) {
							count++;
						}
					}
					if(count >= 2)
						System.out.println("true");
					else
						System.out.println("false");
				}
				catch(Exception e) {
					System.out.println("Error");
				}
			}
		}

	


