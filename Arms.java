import java.io.*;
import java.util.*;
public class Arms
{
public static void main(Sting args[])
{
Scanner sc=new Scanner(System.in);
int a,b,d,e,sum,c=0;
a=sc.nextInt();
b=sc.nextInt();
while(b<=a)
{
sum=0;
d=a;
while(d>0)
{
e=d%10;
sum=sum+(e*e*e);
d=d/10;
if(sum==a)
{
System.out.println(a);
c=c+1;
}
a++;
}
System.out.println("The armstrong numbers are:"+c);
}
}
