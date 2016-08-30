// ---------------"AreaPerimeter.java"-----------------

import java.lang.*;
abstract class Shape
{	protected String color;
	protected boolean filled;
	Shape()
	{	System.out.println("Default Constructor");
		color="white";filled=false;
	}
	Shape( String color, boolean filled)
	{	this.color=color; this.filled=filled;
	}
	public String getColor(){ return color;}
	public void setColor(String color)
	{ this.color=color;}
	public boolean isFilled(){ return filled;}
	public void setFilled(boolean filled){ this.filled=filled;}
	abstract public double getArea();
	abstract public double getPerimeter();
	public String toString() 
	{ return "COLOR:"+color+" FILLED :"+filled; 	}
}
class Circle extends Shape
{	protected double radius;
	Circle() { radius=0;	}
	Circle(double radius){ this.radius=radius;}
	Circle(double radius,String color, boolean filled)
	{ 	super(color,filled); this.radius=radius;	}
	public double getRadius(){ return radius;}
	public void setRadius(double radius){ this.radius=radius;}
	public double getArea()
	{ return 3.14*radius*radius;}
	public double getPerimeter(){return 2*3.14*radius;}
	public String toString() 
	{ return " CIRCLE :: RADIUS : "+radius+" COLOR:"+color+" FILLED :"+filled; 	}
}

class Rectangle extends Shape
{	protected double width, length;
	Rectangle(){width=length=0;}
	Rectangle(double width,double length){
	this.width=width; this.length=length;}
	Rectangle(double width,double length,String color, boolean filled)
	{ super(color,filled);
	this.width=width; this.length=length;}
	public double getWidth(){ return width;}
	public void setWidth(double width){ this.width=width;}
	public double getLength(){ return length;}
	public void setLength(double length )
	{ this.length=length;}
	
	public double getArea()
	{ return width*length;}
	public double getPerimeter(){return 2*(width+length);}
	public String toString() 
	{ return " RECTANGLE :: WIDTH : "+width+" LENGTH :"+length+" COLOR:"+color+" FILLED :"+filled; 	}
}
class Square extends Rectangle
{
	
	Square(){}
	Square(double side){width=length=side;}
	Square(double side,String color, boolean filled)
	{ super(side,side,color,filled); }
	public double getSide(){ return width;}
	public void setSide(double side){ width=side;length=side;}
	public void setWidth(double side){  width=side;}
	public void setLength(double side ){length=side;}
	
	public String toString() 
	{ return " SQUARE :: side : "+width+" COLOR:"+color+" FILLED :"+filled; 	}
}
public class AreaPerimeter
{
	public static void main(String a[])
	{ 
	 System.out.println(" CIRCLE dimensions using constructor ---");

	Circle c=new Circle(10,"RED",true);
	 System.out.println(""+c);
	System.out.println("\nCIRCLE : Area:: "+c.getArea()+" Perimeter :: "+c.getPerimeter());

	System.out.println(" \nCIRCLE dimensions using get and set methods ---");

	c.setColor("YELLOW");c.setRadius(5);c.setFilled(false);
       System.out.println(" CIRCLE:: Radius :"+c.getRadius()+" COLOR:"+c.getColor()+" FILLED :"+c.isFilled());
	System.out.println("CIRCLE : Area:: "+c.getArea()+" Perimeter :: "+c.getPerimeter());

	System.out.println(" \nRECTANGLE dimensions using constructor ---");
	Rectangle r=new Rectangle(20,5,"GREEN",true);
	System.out.println(""+r);
	System.out.println("RECTANGLE : Area:: "+r.getArea()+" Perimeter :: "+r.getPerimeter());

	System.out.println(" \nRECTANGLE dimensions using get and set methods ---");

	r.setColor("PINK");r.setWidth(10);r.setLength(15);r.setFilled(true);
       System.out.println(" RECTANGLE:: LENGTH :"+r.getLength()+"WIDTH : "+r.getWidth()+" COLOR:"+r.getColor()+" FILLED :"+r.isFilled());
	
	System.out.println(" \nSQUARE dimensions using constructor ---");
	Square s=new Square(6,"BLUE",true);
	System.out.println(""+s);

	System.out.println("SQUARE : Area:: "+s.getArea()+" Perimeter :: "+s.getPerimeter());

	System.out.println(" \nSQUARE dimensions using get and set methods ---");

	s.setColor("PINK");s.setSide(5);r.setFilled(true);
       System.out.println(" SQUARE:: SIDE :"+s.getSide()+ "COLOR:"+s.getColor()+" FILLED :"+s.isFilled());
	System.out.println("SQUARE : Area:: "+s.getArea()+" Perimeter :: "+s.getPerimeter());

	}
}

/* EXECUTION AND OUTPUT
E:\ANDROID\ASSIGNMENT-1>javac AreaPerimeter.java

E:\ANDROID\ASSIGNMENT-1>java AreaPerimeter
 CIRCLE dimensions using constructor ---
 CIRCLE :: RADIUS : 10.0 COLOR:RED FILLED :true

CIRCLE : Area:: 314.0 Perimeter :: 62.800000000000004

CIRCLE dimensions using get and set methods ---
 CIRCLE:: Radius :5.0 COLOR:YELLOW FILLED :false
CIRCLE : Area:: 78.5 Perimeter :: 31.400000000000002

RECTANGLE dimensions using constructor ---
 RECTANGLE :: WIDTH : 20.0 LENGTH :5.0 COLOR:GREEN FILLED :true
RECTANGLE : Area:: 100.0 Perimeter :: 50.0

RECTANGLE dimensions using get and set methods ---
 RECTANGLE:: LENGTH :15.0WIDTH : 10.0 COLOR:PINK FILLED :true

SQUARE dimensions using constructor ---
 SQUARE :: side : 6.0 COLOR:BLUE FILLED :true
SQUARE : Area:: 36.0 Perimeter :: 24.0

SQUARE dimensions using get and set methods ---
 SQUARE:: SIDE :5.0COLOR:PINK FILLED :true
SQUARE : Area:: 25.0 Perimeter :: 20.0

E:\ANDROID\ASSIGNMENT-1> */

