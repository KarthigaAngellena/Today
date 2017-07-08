import java.io.*;
import java.util.*;
public class Palindrome
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a;
int b=0,n;
a=sc.nextInt();
while(n>0)
{
n=a%10;
b=a*10+n;
a=a/10;
}
if(b==a)
{
System.out.println("Palindrome");
}
else
{
System.out.println("not a Palindrome");
}
}
}
