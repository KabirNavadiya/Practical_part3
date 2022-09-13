package calc;

public class div {
    public float divi(int a, int b)
    {
        return (a/b);
    }
}

/*.....................................*/
package calc;

public class mul {
    public int multi(int a, int b)
    {
        return a*b;
    }
}

/*.....................................*/

package calc;

public class sub {
    public int subt(int x, int y)
    {
        return x-y;
    }
}

/*.....................................*/

package calc;

public class sum {
    public int Add(int a, int b)
    {
        return a+b;
    }
}

/*.....................................*/

import calc.*;
import java.util.*;
public class practical_3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 1st number");
        int n1=sc.nextInt();
        System.out.println("Enter 2nd number");
        int n2=sc.nextInt();
        sum s=new sum();
        System.out.println(s.Add(n1,n2));
        sub sb=new sub();
        System.out.println(sb.subt(n1,n2));
        mul m=new mul();
        System.out.println(m.multi(n1,n2));
        div d=new div();
        System.out.println(d.divi(n1,n2));
         System.out.println("Prepared by 21CE080- Kabir Navadiya");
    }
}