import java.util.Scanner;
public class interface1 {
    public static void main(String args[])
    {
      Scanner scan=new Scanner(System.in);
      int resize;
      System.out.println("Enter resize:");
      resize=scan.nextInt();
      Rectangle obj1=new Rectangle();
      System.out.println("--------------------TRIANGLE--------------------");
      System.out.println("Area before resize:"+obj1.getArea());
      System.out.println("Perimeter before resize:"+obj1.getPerimeter());
      obj1.resize(resize);
      System.out.println("Area after resize:"+obj1.getArea());
      System.out.println("Perimeter after resize:"+obj1.getPerimeter());
      Circle obj2=new Circle();
      System.out.println("--------------------CIRCLE--------------------");
      System.out.println("Area before resize:"+obj2.getArea());
      System.out.println("Perimeter before resize:"+obj2.getPerimeter());
      obj2.resize(10);
      System.out.println("Area after resize:"+obj2.getArea());
      System.out.println("Perimeter after resize:"+obj2.getPerimeter());
    }
}
interface Resizable
{
 void resize(int x);
}
class Rectangle implements Resizable
{
    int length=10;
    int breadth=5;
    @Override
    public void resize(int x) 
    {
        length*=x;
        breadth*=x;
        System.out.println("After resize\nLength:"+length+"\nBreadth:"+breadth);
    }
    int getArea()
    {
        return length*breadth;
    }
    int getPerimeter()
    {
        return 2*(length+breadth);
    }
}
class Circle implements Resizable
{
    int radius=2;
    @Override
    public void resize(int x)
    {
       radius=x;
       System.out.println("After resize\nRadius:"+radius);
    }
    double getArea()
    {
        return 3.14*radius*radius;
    }
    double getPerimeter()
    {
        return 2*3.14*radius;
    }
}
