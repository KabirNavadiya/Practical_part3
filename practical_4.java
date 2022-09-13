import java.util.*;
class vehicle
{
    void display()
    {
        System.out.println("I am going to buy a vehicle .");
    }
}
class bike extends vehicle
{
    void display()
    {
        System.out.println("maybe a bike");
    }
}
public class practical_4 {
    public static void main(String[] args) {
        bike obj = new bike();
        vehicle obj1=new vehicle();
        obj1.display();
        obj.display();
        System.out.println("Prepared by 21CE080-Kabir Navadiya");
    }
}
