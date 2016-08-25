import java.io.*;
import java.util.Arrays;
import java.util.Scanner;


public class deleting3digit1
{

    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String s=String.valueOf(n);
    char[] c=s.toCharArray();
    for(int i=0;i<c.length;i++)
    Arrays.sort(c);
    for(int i=1;i<c.length;i++)
    {
        System.out.println(c[i+1]);
    }
    }
}
