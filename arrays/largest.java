import java.util.*;
import java.io.*;
class array3{
public static int index(int x)
{	
Scanner scan=new Scanner(System.in);	
int i,j,sum=0,lar=0,slar=-11,small=+111,evencount=0,count=0,choice;

int[] array=new int[x];
System.out.println("The elements of an array are:");


for(i=0;i<x;i++)
{
array[i]=scan.newInt();
}

switch(choice)
{
case 1:

for(i=0;i<x;i++)
{
sum=sum+array[i];	
}
System.out.println("The sum of elements in array are:"+sum);
break;      
case 2:
for(i=0;i<x;i++)
{
	if(array[i]>lar)
	
		lar=array[i];
}
System.out.println("The largest number is :"+lar);
break;

case 3:
for(i=0;i<x;i++)
{
	if(array[i]!=lar)
	{
		if(arrat[i]>slar)
		{
			slar=array[i];
		}
	}
}
System.out.println("The second smallest number is: "+slar);
break;

case 4:
for(i=0;i<x;i++)
{
	if(array[i]<small)
	{
		small=array[i];
	}
}
System.out.println("The smallest number is :"+small);
break;

case 5:
for(i=0;i<x;i++)
{
	if(array[i]%2==0)
	{
      evencount++;
	}
}
System.out.println("The total no. of even numbers are:"+evencount);
break;

case 6:
for(i=0;i<x;i++)
{
 for(j=i+1;j<x;j++)
 {
 	if(array[i]==array[j])
 	{
 		count++;
 	}
 }
}
System.out.println("The frequency of the repeated elements is:"+count);
break;

case 7:
for(i=0;i<x;i=i+2)
{
sum=sum+array[i];	
}
System.out.println("The sum of alternate elments of ann array is:"+sum);	
break;

default:
{
System.out.println("error");
}
return 0;
}


public static void main(String args[])
{
int x=5;
index(x);	
}
}
