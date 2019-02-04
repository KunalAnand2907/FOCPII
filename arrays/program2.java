import java.util.*;
import java.io.*;
class program2{
public static int callindex(int x)
{
Scanner console=new Scanner(System.in);	
int[] array=new int[x];
int index=-1;
Scanner scan= new Scanner(System.in);
for(int i=0;i<x;i++)
{
	array[i]=scan.nextInt();

}
System.out.println("enter the value to find");
int search= scan.nextInt();
for(int i=0;i<x;i++)
{
	if(array[i]==search)
        {
        System.out.println(i);
        }
    else
    System.out.println(index);	
 }	
return 0;
}

public static void main(String args[])
{
int x=10;
callindex(10);
} 
}


