import java.io.*;
import java.util.*;
public class Hcf
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,c;
a=sc.nextInt();
b=sc.nextInt();
if(b!=0)
{
c=a%b;
a=b;
b=c;
}
System.out.println(a);
}
}
