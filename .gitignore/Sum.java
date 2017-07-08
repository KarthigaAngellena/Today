import java.io.*;
import java.util.*;
public class Sum
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,i,sum=0;
a=sc.nextInt();
for(i=0;i<a;i++)
{
sum+=i;
}
System.out.println("Sum of natural numbers is: "+sum);
}
}
