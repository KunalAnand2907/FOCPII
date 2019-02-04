import java.lang.*;
class point{
private double distance;

point(int x1, int x2, int y1,int y2)
{
 distance=Math.sqrt((Math.pow((x1-x2),2)+Math.pow((y1-y2),2)));	
}

public double Distance()
{
System.out.println("The distance btw 2 points is:"+distance);
return 0;	
}

public static void main(String args[])
{
point mydistance=new point(1,2,3,4);
mydistance.Distance();	
}
}