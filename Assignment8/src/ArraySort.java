import java.util.Scanner;
public class ArraySort {
static int[] bubbleSort(int[] arr) {  
        int temp = 0;
         for(int i=0; i < arr.length; i++){  
                 for(int j=0; j < arr.length; j++){  
                  if(arr[i] < arr[j]){  
                  temp = arr[i];  
                  arr[i] = arr[j];  
                  arr[j] = temp;  
                         }  
                          
                 }  
         }  
  return arr;
    }  
    public static void main(String[] args) {  
    	int []arr = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Ten Values");
		for(int i =0; i< arr.length; i++)
		{
			arr[i] =sc.nextInt();
			}                    
                bubbleSort(arr);
                int []sort = arr;
                System.out.println(" After Bubble Sort");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(sort[i] + " ");  
                }  
   
        }  
}  


