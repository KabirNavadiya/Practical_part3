import java.util.*;
abstract class Geometricobject
{
    abstract void getArea();
    abstract void getPerimeter();

}
class circle extends Geometricobject
{
    Scanner sc=new Scanner(System.in);
    float r;
    void getArea()
    {
        System.out.println("Enter radius of circle :");
        r=sc.nextInt();
        System.out.println("Area of the circle is : "+3.14*r*r);
    }
    void getPerimeter()
    {
        System.out.println("Enter raddius of circle :");
        r=sc.nextInt();
        System.out.println("perimeter of circle is :"+2*3.14*r);
    }
}
class rectangle extends Geometricobject
{
    Scanner sc=new Scanner(System.in);
    int l,b;
    void getArea()
    {
        System.out.println("Enter length and breadth of rectangle : ");
        l=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Area of rectangle is : "+l*b);
    }
    void getPerimeter()
    {
        System.out.println("Enter length and breadth of rectangle : ");
        l=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Perimeter of rectangle is : "+2*(l+b));
    }
}
class TestGeometricObject
{

    void getArea(int a, int b, int c,int h)
    {
        int s1=a;
        int s2=b;
        int s3=c;
        int h1= h;
        System.out.println("Area of triangle is :"+ 0.5*s2*h1);
    }
    void getPerimeter(int a, int b, int c)
    {
        int s1=a;
        int s2=b;
        int s3=c;
        System.out.println("Perimeter of triangle is : "+s1+s2+s3);
    }
}
public class practical_1 {
    public static void main(String[] args) {
        Geometricobject OC=new circle();
        Geometricobject OR = new rectangle();
        TestGeometricObject OT=new TestGeometricObject();
        System.out.println("FOR CIRCLE ");
        OC.getArea();
        OC.getPerimeter();
        System.out.println("FOR RECTANGLE ");
        OR.getArea();
        OR.getPerimeter();
        System.out.println("FOR TRIANGLE ");
        OT.getArea(2,3,4,5);
        OT.getPerimeter(2,3,4);

    }
}
