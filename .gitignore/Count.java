import java.io.*;
import java.util.*;
public class Count
{
puiblic static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,i=0;
System.out.println("Enter the Integer:);
a=sc.nextInt();
if(a>0)
{
a=a*-1;
}
else if(a==0)
{
a=0;
}
while(a>0)
{
a=a/10;
i++;
}
System.out.println("Number of digits= "+i);
}
}
