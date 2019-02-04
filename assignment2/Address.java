//package com.ncu.assignment;
//package com.ncu.assignment.Exception;
import java.util.*;
import java.io.*;
class Address{

Address()	
{	
	String s;
Scanner scan=new Scanner(System.in);

try
{
System.out.println("Enter the student address:");
s=scan.nextLine();
if(s==" ")
throw new MandatoryMissingException("address is blank");
else
System.out.println("Enter the student address:");	
s=scan.nextLine();
}
catch(MandatoryMissingException e)
{
System.out.println("Error"+e.getMessage());
}

System.out.println("Enter the city:");
scan.next();
System.out.println("Enter the state:");
scan.next();
System.out.println("Enter the pin code:");
scan.nextInt();
}

static void Display()
{
Address e1=new Address();
}
}

