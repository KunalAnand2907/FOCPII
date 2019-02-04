import java.lang.*;
class point2{
static private double distance;

 point2(int x1, int x2, int y1,int y2)
{
 distance=Math.sqrt((Math.pow((x1-x2),2)+Math.pow((y1-y2),2)));	
}

static public double Distance()
{
System.out.println("The distance btw 2 points is:"+distance);
return 0;	
}

public static void main(String args[])
{
point2 mydistance=new point2(1,2,3,4);
point2.Distance();	
}
}