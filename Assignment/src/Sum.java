
public class Sum {
	public static void main(String[] args) {
				try {
					int[] arr = new int[args.length];
					int add=0;
					for(int i=0; i<arr.length; i++) {
						arr[i]=Integer.parseInt(args[i]);
						if(arr[i] <0)
						{
							System.out.println(10/0);
						}
						if(arr[i] != 0)
						{
							arr[i] = (arr[i]/10+1)*10;
					}
					}
					for(int i=0; i<arr.length; i++) {
						add = add+arr[i];
					}
					System.out.println(add);
				}
				catch(Exception e) {
					System.out.println("Error");
				}
			}
		}

	

