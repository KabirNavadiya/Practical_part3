import java.util.*;
interface P
{
 void fun();
}
interface P1 extends P
{
void f1();
}
interface P2 extends P
{
void f2();
}
interface P12 extends P1 ,P2
{
    void f12();
}
class Exercise implements P12
{
public void fun()
{
    System.out.println("HI");
}
public void f1()
{
    System.out.println("MY NAME ");
}
public void f2()
{
    System.out.println("IS");
}
public void f12()
{
    System.out.println("KABIR");
}
}
public class practical_3 {
    public static void main(String[] args) {
        Exercise obj =new Exercise();
        obj.fun();
        obj.f1();
        obj.f2();
        obj.f12();

    }
}
