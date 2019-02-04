//package com.ncu.assignment;
//package com.ncu.assignment.Exception;
import java.util.*;
import java.io.*;
class Qualification{

Qualification()
{
Scanner scan=new Scanner(System.in);	

System.out.println("Enter the qualification name:");
scan.next();
scan.nextLine();	
System.out.println("Enter the university name:");
scan.nextLine();
System.out.println("Enter the institute name:");
scan.nextLine();
System.out.println("Enter the cgpa:");
scan.nextFloat();
}	

static void Display()
{
Qualification e=new Qualification();	
}
}
