//package com.ncu.assignment;
//package com.ncu.assignment.Exception;
import java.util.*;
import java.io.*;
class project
{
	
project()
{
int n;
String c;
String d;	
Scanner scan=new Scanner(System.in);	
System.out.println("Enter project name:");
scan.nextLine();
try
{
System.out.println("Enter the start date:");
c=scan.next();
if(c==" ")
throw new DateFormatException("date format is not right");
else
System.out.println("Enter the start date:");
c=scan.next();
scan.nextLine();
}
catch(DateFormatException e)
{
System.out.println("Error"+e.getMessage());
}

try
{
System.out.println("Enter the end date:");
d=scan.next();
scan.nextLine();
if(d==" ")
throw new DateFormatException("date format is not right");
else
System.out.println("Enter the start date:");
d=scan.next();
scan.nextLine();
}
catch(DateFormatException e)
{
System.out.println("Error"+e.getMessage());
}

System.out.println("Enter the role:");
scan.nextLine();
System.out.println("Enter the value of n:");
n=scan.nextInt();
System.out.println("\n");
System.out.println("Enter the responsibilities::");
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
	scan.next();
}	
}

static void Display()
{
project e=new project();	
}
}
