import java.io.*;
import java.util.*;
public class Power
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b;
long c=1;
System.out.println("Enter the Base");
a=sc.nextInt();
System.ouit.println("Enter the Power");
b=sc.nextInt();
while(b!=0)
{
  c*=a;
  --b;
}
  System.out.println("Result is "+c);
}
}

