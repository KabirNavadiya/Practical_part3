import java.util.*;
interface test
{
    public void square(int a );
     default void show()
    {
        System.out.println("default method is executed");
    }
}
class testcase implements test
{
  public void square(int a)
    {
        int x;
        x=a;
        System.out.println(x*x);
    }

}
public class practical_7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to find its square : ");
        int x=sc.nextInt();
        testcase A=new testcase();
        A.square(x);
        A.show();
        System.out.println("prepared by 21CE080-Kabir Navadiya ");
    }
}
