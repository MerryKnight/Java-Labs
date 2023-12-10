
import java.util.ArrayList;
public class test
{
    public static void main(String[] args)
    {
        ArrayList<String> a = new ArrayList<>();
        a.add("be");
        a.add("by");
        
        WaitList<String> w = new WaitList<>();
        w.add("1");
        w.add("2");
        w.add("3");
        System.out.println(w);
        System.out.println(w.remove());
        System.out.println(w);
        System.out.println(w.isEmpty());
        System.out.println(w.contains("1"));
        System.out.println(w.contains("awas"));
        
        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/");
        BoundedWaitList<String> bw = new BoundedWaitList<String>(3);
        bw.add("a");
        bw.add("b");
        bw.add("c");
        System.out.println(bw);
        System.out.println(bw.getCapacity());
        try
        {
            bw.add("asd");
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        bw = new BoundedWaitList<String>(a);
        System.out.println(bw.getCapacity());
        try
        {
            bw.add("asd");
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println(bw);
        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/");
        UnfairWaitList<String> uw = new UnfairWaitList<>();
        uw.add("a");
        uw.add("b");
        uw.add("c");
        uw.add("d");
        System.out.println(uw);
        uw.remove("a");
        System.out.println(uw);
        uw.moveToBack("b");
        System.out.println(uw);
    }
}
