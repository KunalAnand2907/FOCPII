class circle{
	int radius;
void call(int r)
{
this.radius=r;
}

	double Area()
	{
		double area= radius*radius*3.14;
		return area;
		
	}

	double circumference(){

		double c = 2* 3.14*radius;
		return c;
	}

	void Display(){

		System.out.println("Area of circle="+Area());
		System.out.println("circumference of circle="+circumference());
	}

 
public static void main(String args[])
{	
circle mycircle=new circle();
mycircle.call(2);
mycircle.Display();
}
}
