package expno4;
import java.util.Scanner;
abstract class Shape 
{
    int numSides;
    Shape(int n)
    {
     numSides=n;   
    }
    public int getnumSides()
    {
        return numSides;
    }   
    abstract double getArea();
    abstract double getPerimeter();
}
class Rectangle extends Shape
    {
        double width,height;
        Rectangle(int num,double wi,double he)
        {
            super(num);
            width=wi;
            height=he;
        }
        @Override
        double getArea()
        {
            return width*height;
        }
        @Override
        double getPerimeter()
        {
            return 2*(width+height);
        }    
    }
class Triangle extends Shape
    {
        double width,height,slant;
        Triangle(int num,double wi,double he,double sl)
        {
            super(num);
            width=wi;
            height=he;
            slant=sl;
        }
        @Override
        double getArea()
        {
            return 0.5*width*height;
        }
        @Override
        double getPerimeter()
        {
            return (width+height+slant);
        }
}
public class Sides
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        double w_tri,h_tri,w_rect,h_rect,s_tri;
        System.out.println("Enter width of traingle:");
        w_tri=scan.nextDouble();
        System.out.println("Enter height of traingle:");
        h_tri=scan.nextDouble();
        System.out.println("Enter slant height of triangle:");
        s_tri=scan.nextDouble();
        System.out.println("Enter width of rectangle:");
        w_rect=scan.nextDouble();
        System.out.println("Enter height of rectangle:");
        h_rect=scan.nextDouble();
        Triangle obj1=new Triangle(3,w_tri,h_tri,s_tri);
        System.out.println("--------------------TRIANGLE--------------------");
        System.out.println("Number of sides = "+obj1.getnumSides());
        System.out.println("Perimeter = "+obj1.getPerimeter());
        System.out.println("Area = "+obj1.getArea());
        System.out.println("--------------------RECTANGLE-------------------");
        Rectangle obj2=new Rectangle(2,w_rect,h_rect);
        System.out.println("Number of sides = "+obj2.getnumSides());
        System.out.println("Perimeter = "+obj2.getPerimeter());
        System.out.println("Area = "+obj2.getArea());
    }
}