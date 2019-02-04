//package com.ncu.assignment;
//package com.ncu.assignment.Exception;
import java.util.*;
import java.io.*;
class student{
	

student(int n,int x, int y)
{
	String a;
	String k;
	
	Scanner scan=new Scanner(System.in);
	
	try{
	System.out.println("Enter the student name:");		
     a=scan.nextLine();
     //scan.nextLine();
     if(a.equals("0"))
     throw new MandatoryMissingException("First Name is Blank");
     System.out.println("Enter the student name:");
     a=scan.next();
     scan.nextLine();     
    }
    catch(MandatoryMissingException e)
    {
    System.out.println("Error"+e.getMessage());	
    }

	System.out.println("Enter your address:");
     scan.nextLine();
    
    try
    {
	System.out.println("Enter student date of birth:");
	scan.next();	
	throw new MandatoryMissingException("dob is blank");
    }
    catch(MandatoryMissingException e)
    {
    System.out.println("Error"+e.getMessage());	
    }

	System.out.println("Enter the student skills: ");
	int arr4[]=new int[n];
	for(int l=0;l<n;l++)
	{
	scan.next();	
	scan.nextLine();
	}
	
	System.out.println("Enter student qualifications:");
    int arr5[]=new int[x];
    for(int f=0;f<x;f++)
    {
    scan.nextLine();
    }	

	System.out.println("Enter students projects:");
	int arr6[]=new int[y];
	for(int p=0;p<y;p++)
	{
	scan.nextLine();	
	}

    try
    {
	System.out.println("Enter students email:");
	k=scan.nextLine();
	if(k==" ")
	throw new MandatoryMissingException("email is blank");
    else
    System.out.println("Enter students email:");
	k=scan.nextLine();
    }
    catch(MandatoryMissingException e)
    {
    System.out.println("Error"+e.getMessage());	
    }

    try
    {
	System.out.println("Enter students contact number: ");
	scan.nextLong();	
	throw new MandatoryMissingException("cno is blank");
    }
    catch(MandatoryMissingException e)
    {
    System.out.println("Error"+e.getMessage());	
    }	
}



static void DisplayMethod()
{
student e1=new student(2,2,2);
}
}



















