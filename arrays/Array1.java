import java.util.*;
import java.io.*;
class Array1{
static void main(String args[])
{	
int[] array=new int[10];
int index=-1;
Scanner scan= new Scanner(System.in);
for(int i=0;i<10;i++)
{
	array[i]=scan.nextInt();

}
System.out.println("enter the value to find");
int search= scan.nextInt();
for(int i=0;i<10;i++)
{
	if(array[i]==search)
        {
        System.out.println(i);
        }
    else
    System.out.println(index);	
 }
}
	
}