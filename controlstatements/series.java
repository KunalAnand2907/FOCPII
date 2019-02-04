import java.util.*;
import java.io.*;
class series{
public static void main(String args[])
{
Scanner console=new Scanner(System.in);
int x,n,a=1,Sn,d;
x=console.nextInt();
n=console.nextInt();
d=x-1;
Sn=n/2*(a+a+(n-1)*d);
System.out.println("The sum of series is :"+Sn);
 }
 }