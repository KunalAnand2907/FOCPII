import java.util.*;
import java.io.*;
class array2{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int i,j,mul;
int a[][]=new int[3][3];
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
	a[i][j]=scan.nextInt();
	if(a[i][j]>99)
	{
    System.out.println("error");
    System.out.println("re enter the digit");
    a[i][j]=scan.nextInt();
}
}
}

for(i=0;i<3;i++)
{
for(j=0;j<3;j++) 
{
if(a[i][j]%2!=0)
{
mul=a[i][j]*2;
System.out.println(mul);	
}	
}	
}

for(i=0;i<3;i++)
{
	for(j=0;j<3;j++)
	{
		if(a[i][j]>99)
		{
			System.out.println("error");

		}
	}
}
}	
} 