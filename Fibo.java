import java.io.*;
import java.util.*;
public class Fibo
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,c,i;
a=sc.nextInt();
b=sc.nextInt();
for(i=0;i<10;i++)
{
c=a+b;
System.out.println(c);
a=b;
b=c;
}
}
}
