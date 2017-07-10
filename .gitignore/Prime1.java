import java.io.*;
import java.util.*;
public class Prime1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,bc=0;
a=sc.nextInt();
b=sc.nextInt();
for(int i=a;i<b;i++)
{
for(int j=2;j<i;j++)
{
if((i%j)==0)
c=0;
}
else
{
c=1;
}
}
if(c==0)
{
System.out.println(c);
}
}
}
}
