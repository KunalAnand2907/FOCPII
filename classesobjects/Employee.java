import java.util.*;
import java.io.*;
class Employee{


Employee(String s1,String s2,double monthsalary)
{
if(monthsalary<0)
{
System.out.println("reenter");
Scanner scan=new Scanner(System.in);
monthsalary=scan.nextInt();

}
else	
System.out.println(s1+s2+"\n"+monthsalary);
}	

void salary(int monthlysalary)
{
int sal=12*monthlysalary;
System.out.println(sal);
}

void risesalary(int monthlysalary)
{
double inc=((12*monthlysalary)*10/100)+(12*monthlysalary);
System.out.println(inc);
}

public static void main(String args[])
{
Employee e=new Employee("kunal","anand",40000);	
e.salary(40000);
e.risesalary(40000);
}
}