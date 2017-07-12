import java.io.*;
import java.util.*;
public class Fact
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,i,sum=1;
a=sc.nextInt();
for(i=1;i<a;i++)
{
sum=a*i;
}
System.out.println(sum);
}
}
