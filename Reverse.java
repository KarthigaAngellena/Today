import java.io.*;
import java.util.*;
public class Reverse
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b=0;
a=sc.nextInt();
while(a!=0)
{
b=b*10;
b=b+a%10;
a=a/10;
}
System.out.println(b);
}
}

