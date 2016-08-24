import.java.io.*;
import java.util.Scanner;
class fact5
{
  public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
  int input1=sc.nextInt();
 
  int rem=0;
  int result=0;
	for(int i=0;i<input1;)
	  {
		rem = input1 % 10;
        input1= input1/ 10;
         result = result * 10 + rem;
	  }
	  System.out.println(result);
  }
 
  
}
