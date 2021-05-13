
public class RoundedSum {
	public static void main(String[] args) {
			int[] arr = new int[args.length];
			int sum = 0;
			try {
				for(int i=0; i<arr.length; i++) {
					arr[i]=Integer.parseInt(args[i]);
					if(arr[i] < 0)
						System.out.println(10/0);
					if(arr[i] != 0) {
						int rem;
						 rem = arr[i]%10;
						if(rem >= 5) {
							arr[i] = (((arr[i]/10)+1)*10);
						}
						else 
							if((rem<5) && (rem>0)) {
							arr[i] = ((arr[i]/10)*10);
						}
					}
					sum = sum+arr[i];
				}
			System.out.println(sum);
			}
			catch(Exception e) {
				System.out.println("Error");
			}
		}

	}


