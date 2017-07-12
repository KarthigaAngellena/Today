import java.io.*;
import java.util.*;
public class Gcd
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,c;
a=sc.nextInt();
b=sc.nextInt();
c=a%b;
a=b;
b=c;
System.out.println("G.C.D= "+a);
}
}
