public class FibonacciSeries {
			 static int num1 = 0,num2 = 1,sum = 0;    
			 static void printFibonacci(int count){    
			    if(count > 0) 
			    {    
			         sum = num1 + num2;    
			         num1 = num2;    
			         num2 = sum;    
			         System.out.print(" "+sum);   
			         printFibonacci(count-1);    
			     }    
			 }    
			 public static void main(String args[]){    
			  int count = 6;    
			  System.out.print(num1 +" "+ num2);
			  printFibonacci(count-2);   
			 }  
	}



