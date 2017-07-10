import java.io.*;
import java.util.*;
public class Armstrong
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,c=0,n;
a=sc.nextInt();
a=num;
if(a!=0)
{
n=num%10;
c=c+n*n*n;
num=num/10;
}
if(c==a)
{
System.out.println("Armstrong Number");
}
else
{
System.out.println("Not an Armstrong Number");
}
}
}
