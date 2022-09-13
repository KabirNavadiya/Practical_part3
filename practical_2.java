import java.util.Vector;
interface iprinter{
    String ip();
    default void show(){
        System.out.println("default iprinter");
    }
}
interface iscanner{
    String isc();
    default void show(){
        System.out.println("default testinterface2");
    }
}
 class defaultmethod implements iprinter,iscanner {
    @Override
    public String ip() {
        return "iprinter";
    }

    @Override
    public String isc() {
        return "iscanner";
    }

    public void show() {
        iprinter.super.show();
        iscanner.super.show();

    }
}
public class practical_2 {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        defaultmethod d = new defaultmethod();
        v.add(d.ip());
        v.add(d.isc());
        v.add(d.ip());
        v.add(d.isc());
        v.add(d.ip());

        d.show();
        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i));
        }
    }
}
